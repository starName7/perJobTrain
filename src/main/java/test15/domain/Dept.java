package test15.domain;

import java.io.Serializable;
import java.util.Objects;

public class Dept implements Serializable {

    public static final Long serialVersionUID = -1L;

    private Long id;

    private String deptName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Dept() {}

    public Dept(Long id, String deptName) {
        this.id = id;
        this.deptName = deptName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dept dept = (Dept) o;
        return Objects.equals(id, dept.id) && Objects.equals(deptName, dept.deptName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deptName);
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
