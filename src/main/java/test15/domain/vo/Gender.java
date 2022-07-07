package test15.domain.vo;

import java.util.Arrays;

/**
 * 性别
 * @author Michael
 */
public enum Gender {
    MAN("man"),WOMAN("woman");

    private String name;

    private Gender(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(Gender.values()));
//        Gender man = Gender.valueOf("MAN");
//        System.out.println(man);
    }
}
