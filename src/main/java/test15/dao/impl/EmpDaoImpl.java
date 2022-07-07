package test15.dao.impl;


import test15.dao.IDeptDao;
import test15.dao.IEmpDao;
import test15.domain.Dept;
import test15.domain.Emp;
import test15.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpDaoImpl implements IEmpDao {

    private List<Emp> list = new ArrayList<>();

    private IDeptDao deptDao = new DeptDaoImpl();
    @Override
    public List<Emp> list(String name, Long deptId) {
        List<Emp> emps = list;
        if (name != null && !name.trim().equals("")) {
            emps = emps.stream()
                    .filter(item -> item.getName().indexOf(name) != -1)
                    .collect(Collectors.toList());
        }

        if (deptId != null ) {
            List<Dept> depts = deptDao.list();
            List<Long> collect = depts.stream().map(item -> item.getId()).collect(Collectors.toList());
            int i = collect.indexOf(deptId);
            if (i == -1) {
                throw new RuntimeException("没有对应的部门");
            } else {
                emps = emps.stream().filter(item -> item.getDept().getId().equals(deptId)).collect(Collectors.toList());
            }
        }

        return emps;
    }

    @Override
    public boolean add(Emp emp) {
        if (emp.getDept() == null) {
            // 不能存
            throw new RuntimeException("部门信息不能为空");
        } else {
            List<Dept> depts = deptDao.list();
            List<Long> collect = depts.stream().map(item -> item.getId()).collect(Collectors.toList());
            int i = collect.indexOf(emp.getDept().getId());
            if (i == -1) {
                throw new RuntimeException("添加的部门信息不存在");
            }
        }
        emp.setId(Utils.getId());
        return list.add(emp);
    }



    @Override
    public boolean update(Emp emp) {
        Emp empMapper = get(emp.getId());
        if (empMapper != null) {
            int i = list.indexOf(empMapper);
            list.set(i, emp);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean remove(String id) {
        Emp empMapper = get(id);
        if (empMapper != null) {
            int i = list.indexOf(empMapper);
            if (i != -1) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Emp get(String id) {
        Optional<Emp> first = list.stream().filter(item -> item.getId().equals(id)).findFirst();
        return first.orElse(null);
    }
}
