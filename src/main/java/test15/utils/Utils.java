package test15.utils;

import java.util.UUID;

public class Utils {

    public static String getId(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}
