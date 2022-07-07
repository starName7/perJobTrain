package test15.domain;



import test15.domain.vo.Gender;

import java.io.Serializable;
import java.util.Objects;

public class Emp implements Serializable {

    public static final Long serialVersionUID = -1L;
    private String id;

    private String name;

    private Integer age;

    private String mail;

    private Gender gender;

    private Integer salary;

    private Dept dept;

    public Emp() {}
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(id, emp.id) && Objects.equals(name, emp.name) && Objects.equals(age, emp.age) && Objects.equals(mail, emp.mail) && gender == emp.gender && Objects.equals(salary, emp.salary) && Objects.equals(dept, emp.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, mail, gender, salary, dept);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", dept=" + dept +
                '}';
    }
}
