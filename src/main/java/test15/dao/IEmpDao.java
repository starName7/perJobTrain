package test15.dao;



import test15.domain.Emp;

import java.util.List;

public interface IEmpDao {

    List<Emp> list(String name, Long deptId);

    boolean add(Emp emp);

    boolean update(Emp emp);

    boolean remove(String id);

    Emp get(String id);
}
