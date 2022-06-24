package date0624.java8.subString;

public class StrIndexBounds {
    public static void main(String[] args) {
        String oldStr = "【美女你好，吃了没】";
        System.out.println(oldStr + "第3 【-】 6个字符串: " + subString(oldStr,2,5));
        System.out.println(oldStr + "第3 【-】 6个字符串: " + subString(oldStr,-22,5));
    }

    public static String subString(String str, int starIndex, int endIndex) {
        if (starIndex < 0) {
            StringIndexOutOfBoundsException se = new StringIndexOutOfBoundsException("" +
                    "starIndex - 小于0，下标越界");
            throw se;
        }
        if (endIndex < 0) {
            StringIndexOutOfBoundsException se = new StringIndexOutOfBoundsException("" +
                    "endIndex - 小于0，下标越界");
            throw se;
        }
        if (starIndex > str.length() - 1) {
            StringIndexOutOfBoundsException se = new StringIndexOutOfBoundsException("" +
                    "starIndex - 大于lenght -1，下标越界");
            throw se;
        }
        if (endIndex > str.length() - 1) {
            StringIndexOutOfBoundsException se = new StringIndexOutOfBoundsException("" +
                    "endIndex - 大于length-1，下标越界");
            throw se;
        }
        String concatStr="";
        for(int idx = starIndex;idx <= endIndex; idx++){
            char curChar = str.charAt(idx);
            concatStr += curChar;
        }
        return concatStr;
    }
}
