package date0628.java11.string.test;

import org.junit.Test;

import java.util.Arrays;

public class StringTest {
    @Test
    public void test02() {
        String value = "ABC";
    }

    @Test
    public void test03() {
        String value = new String();
    }

    @Test
    public void test04() {
        String value = new String("ABC");
    }

    @Test
    public void test05() {
        char[] charArray = {'A', 'B', 'C'};
        String value = new String(charArray);
    }
    @Test
    public void test06(){
        char[] charArray = {'A', 'B', 'C'};
        String value = new String(charArray, 0, charArray.length);
    }
    @Test
    public void test07(){
        byte[] byteArray = {65,66,67};
        String value = new String(byteArray);
    }
    @Test
    public void test08(){
        byte[] byteArray = {65,66,67};
        String value = new String(byteArray,0,byteArray.length);
    }
    @Test
    public void test09(){
        String s1 = "hello";
        String s2 = "world";
        String s3 = "hello" + "world";
        String s4 = s1 + "world";
        String s5 = s1 + s2;
        String s6 = (s1 + s2).intern();
        final String s7 = "hello";
        final String s8 = "World";
        String s9 = s7 + s8;
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s4 == s5);
        System.out.println(s3 == s6);
        System.out.println(s9 == s3);
    }
    @Test
    public void test10(){
        String value = "12hello34world5java4591mysql456";
        System.out.println(value.length());
        System.out.println(value.charAt(2));
        System.out.println(value.indexOf('e'));
        System.out.println(value.indexOf("hello"));
        System.out.println(value.indexOf('4',20));
        System.out.println(value.indexOf("45",5));
        System.out.println(value.substring(2));
        System.out.println(value.substring(2,7));
    }
    @Test
    public void test11(){
        String value1 = "HELLO JAVA";
        String value2 = "hello java";
        System.out.println(value1.equals(value2));
        System.out.println(value1.equalsIgnoreCase(value2));
        System.out.println(value1.contains("LLO"));
        System.out.println(value1.contains("llo"));
        System.out.println(value1.startsWith("HELLO"));
        System.out.println(value1.endsWith("va"));
        System.out.println(value1.isEmpty());
    }
    @Test
    public void test12(){
        String value = "Hello Java";
        byte[] byteArray = value.getBytes();
        System.out.println(Arrays.toString(byteArray));

        char[] charArray = value.toCharArray();
        System.out.println(Arrays.toString(charArray));

        char[] charsArr = {'a','b','c'};
        System.out.println(String.valueOf(charArray));

        String intString = String.valueOf(1001);
        System.out.println(intString);
        System.out.println(value.toLowerCase());
        System.out.println(value.toUpperCase());
        System.out.println(value.concat(" & Hello Mysql"));

    }
    @Test
    public void test13(){
       String value = "Hello Java";
        System.out.println(value.replace('a','A'));
        String replaceValue = "go go go, well done";
        System.out.println(replaceValue.replace("go","o"));

        String trimValue = "     --space--     ";
        System.out.println(trimValue.trim());


        String compareString = "abc";
        System.out.println(compareString.compareTo("ab"));
        System.out.println(compareString.compareTo("abc"));
        System.out.println(compareString.compareTo("abcd"));
        System.out.println(compareString.compareToIgnoreCase("ABC"));
    }
    @Test
    public void test14(){
        System.out.println(costomTrim("     a b     "));
    }
    public String costomTrim(String original){
        int len = original.length();
        int off = 0;
        char[] charArray = original.toCharArray();
        while(off < len && charArray[off] == ' '){
            off++;
        }
        while(off < len && charArray[len-1] == ' '){
            len--;
        }
        return off > 0 || len < original.length() ? original.substring(off,len):original;
    }
    public String reverse(String str,int startIndex,int endIndex){
        if(str != null){
            char[] arr = str.toCharArray();
            for(int x = startIndex,y = endIndex;x<y;x++,y++){
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }

    @Test
    public void test16(){
        String source = "abkkcadkabkebfkabkskab";
        String target = "ab";
        System.out.println(findCount(source,target));
    }
    public int findCount(String original,String source){
        int count = 0;
        int offset = 0;
        int temp = 0;
        while((temp = original.indexOf(source,offset)) != -1){
            count++;
            offset = temp + source.length();

        }
        System.out.println(count);
        return count;
    }

    @Test
    public void test17(){
        String str1 = "abcwerthelloyuiodef";
        String str2 = "cvhellobnm";
        String maxSameString = getMaxSameString(str1,str2);
        System.out.println(maxSameString);
    }
    public String getMaxSameString(String str1,String str2){
        if(str1 != null && str2 != null){
            String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
            String minStr = (str1.length() < str2.length())? str1 : str2;
            int length = minStr.length();
            for(int i = 0;i < length;i++){
                for(int x = 0,y = length -i;y <= length; x++,y++){
                    String subStr = minStr.substring(x,y);
                    if(maxStr.contains(subStr)){
                        return subStr;
                    }
                }
            }
        }
        return null;
    }
    @Test
    public void test18(){
        String str = "aslkdfjlaskjdlfjaeiwovmbkfmkdslakfdj123123124";
        System.out.println(sortChars(str));
    }

    public String sortChars(String original){
        byte[] bytes = original.getBytes();
        Arrays.sort(bytes);
        return new String(bytes);
    }

    @Test
    public void test20(){
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer(16);
        StringBuffer sb3 = new StringBuffer("abc");
    }
    @Test
    public void test21(){
        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("cde");
        StringBuffer sb3 = sb1.append(sb2);
        System.out.println(sb3.toString());

        StringBuffer sb4 = sb3.delete(1,2);
        System.out.println(sb4.toString());

        StringBuffer sb5 = sb4.replace(0,1,"A");
        System.out.println(sb5.toString());

        StringBuffer sb6 = sb5.insert(0,"__");
        System.out.println(sb6.toString());

        StringBuffer sb7 = sb6.reverse();
        System.out.println(sb7.toString());
    }
    @Test
    public void test22(){
        StringBuffer sb1 = new StringBuffer("abcdef");
        int b = sb1.indexOf("b");
        System.out.println(b);

        String substring = sb1.substring(1,3);
        System.out.println(substring);

        System.out.println(sb1.length());

        System.out.println(sb1.charAt(0));

        sb1.setCharAt(0,'H');
        System.out.println(sb1.toString());

    }
}
