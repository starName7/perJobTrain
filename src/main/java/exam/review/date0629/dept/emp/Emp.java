package exam.review.date0629.dept.emp;

import java.util.Objects;

public class Emp {
    private String str;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(str, emp.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(str);
    }
}
