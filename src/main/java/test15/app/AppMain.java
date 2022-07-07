package test15.app;




import test15.dao.IDeptDao;
import test15.dao.IEmpDao;
import test15.dao.impl.DeptDaoImpl;
import test15.dao.impl.EmpDaoImpl;
import test15.domain.Dept;
import test15.domain.Emp;
import test15.domain.vo.Gender;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class AppMain {
    private static IDeptDao deptDao = (IDeptDao) new DeptDaoImpl();
    private static IEmpDao empDao = new EmpDaoImpl();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Dept> deptList = deptDao.list();
        System.out.println(deptList);
        while(true) {
            showMessage();
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    String name = null;
                    Long deptId = null;
                    System.out.println("请输入name进行模糊查询");
                    String nameSc = scanner.next();

                    if(nameSc != null && !nameSc.trim().equals("")) {
                        if ("exit".equals(nameSc)) {
                            name = null;
                        } else {
                            name = nameSc;
                        }
                    }


                    System.out.println("请输入部门编号进行模糊查询");
                    String deptIdSc = scanner.next();
                    if (deptIdSc != null && !deptIdSc.trim().equals("")) {
                        try {
                            if ("exit".equals(deptIdSc)) {
                                deptId = null;
                            } else {
                                deptId = Long.valueOf(deptIdSc);
                            }
                        } catch (Exception e) {
                            deptId = null;
                        }
                    }

                    List<Emp> list = empDao.list(name, deptId);
                    printEmp(list);
                    break;
                case 2:
                    System.out.println("请输入用户名");
                    String empName = scanner.next();
                    System.out.println("请输入年龄");
                    String empAge = scanner.next();
                    System.out.println("请输入email");
                    String empEmail = scanner.next();
                    System.out.println("请输入" + Arrays.toString(Gender.values()));
                    String empGender = scanner.next();
                    Gender gender = Gender.valueOf(empGender.toUpperCase());
                    System.out.println("请输入dept对应的编号");
                    System.out.println(deptList);
                    String empDeptId = scanner.next();

                    Emp emp = new Emp();
                    emp.setName(empName);
                    emp.setAge(Integer.valueOf(empAge));
                    emp.setGender(gender);
                    emp.setMail(empEmail);
                    emp.setSalary(4000);

                    Optional<Dept> first = deptList.stream().filter(item -> item.getId().equals(Long.valueOf(empDeptId))).findFirst();
                    Dept dept = first.orElse(null);
                    emp.setDept(dept);
                    empDao.add(emp);
                    break;
                case 3:
                    System.out.println("请输入雇员编号");
                    String empNo = scanner.next().trim();
                    System.out.println("请重新输入名字");
                    String newName = scanner.next().trim();
                    System.out.println("请重新输入email");
                    String newEmail = scanner.next().trim();

                    Emp emp1 = empDao.get(empNo);
                    emp1.setName(newName);
                    emp1.setMail(newEmail);

                    boolean update = empDao.update(emp1);
                    if (update) {
                        System.out.println("修改成功");
                    } else {
                        System.out.println("修改失败");
                    }
                    break;
                case 4:
                    System.out.println("请输入雇员编号");

                    String empNo1 = scanner.next().trim();
                    boolean fl = empDao.remove(empNo1);
                    if (fl) {
                        System.out.println("删除成功");
                    } else {
                        System.out.println("删除失败");
                    }

                    break;
                default:
                    System.out.println("请输入（1-4）之间的数");
                    break;
            }
        }

    }

    public static void showMessage () {
        System.out.println("请选择：");
        System.out.println("1. 查看所有职员信息");
        System.out.println("2. 添加职员信息");
        System.out.println("3. 修改职员信息");
        System.out.println("4. 删除职员信息");
    }

    public static void printEmp(List<Emp> list) {
        System.out.println("id\t\t\t" + "name\t" + "email\t" + "dept\t" );
        String toStr = "";
        for(int i = 0; i < list.size(); i++) {
            Emp emp = list.get(i);
            toStr += i + ":" + emp.getId() + "\t";
            toStr += emp.getName() + "\t";
            toStr += emp.getMail() + "\t";
            toStr += emp.getDept().getDeptName() + "\t";
        }
        System.out.println(toStr);
    }
}
