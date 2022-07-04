package date0630.java11.character.tool;

public final class CharacterTools {

    /**
     * 检测是否为小写字母
     * @param c 要检测的内容
     * @return 是否为小写字符
     */
    public static boolean isLowerChar(char c){
//        Character.isUpperCase(c);
        if(c <= 122 && c >=97){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 检测是否为大写字母
     * @param c  需要检测的内容
     * @return   是否为大写字母
     */
    public static boolean isUpperChar(char c){
        if(c <= 91 && c >= 65){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 检测是否为数字
     * @param c  需要检测的内容
     * @return   是否为数字
     */
    public static boolean isNumberChar(char c){
        if(c <= 57 && c >= 48){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 检测是否为字母
     * @param c  需要检测的内容
     * @return   是否为字母
     */
    public static boolean isLetterChar(char c){
        if(CharacterTools.isLowerChar(c) || CharacterTools.isUpperChar(c)){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 大写转小写
     * @param c  需要转换的字符
     * @return   转换后的字符
     */
    public static char transformLowerChar(char c){
        if(CharacterTools.isLetterChar(c) && !CharacterTools.isLowerChar(c) ){
            return (char) (97 + (c-65));
        }else{
            return c;
        }
    }

    /**
     * 小写转大写
     * @param c  需要转换的字符
     * @return   转换后的字符
     */
    public static char transformUpperChar(char c){
        if(CharacterTools.isLetterChar(c) && !CharacterTools.isUpperChar(c)){
            return (char)(65 + (c - 97));
        }else{
            return c;
        }
    }

    /**
     * 将大写转为小写，将小写转为答谢，如果不在字母范围内，直接返回
     * @param c  需要转换的字符
     * @return   转换后的字符
     */
    public static char transformUpperOrLowerChar(char c){
        if(CharacterTools.isUpperChar(c)){
            return CharacterTools.transformUpperChar(c);
        }else if(CharacterTools.isLowerChar(c)){
            return CharacterTools.transformLowerChar(c);
        }else{
            return c;
        }
    }

    /**
     * 随机获取一个小写字母
     * @return 随机小写字母
     */
    public static char getRandomLowerChar(){
        char c = (char)(Math.random() * 26 + 97);
        return c;
    }

    /**
     * 随机获取一个大写字母
     * @return  随机大写字母
     */
    public static char getRandomUpperChar(){
        char c = (char)(Math.random() * 26 + 65);
        return c;
    }

    /**
     * 随机获取一个字符串数组 长度随机，总长度不能超过52
     * @return
     */
    public static char[] getRandomCharArray(){
        String generate = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSTUVWXYZ";
        String str = "";
        int len = (int)(Math.random() * 52 + 1);
        for (int i = 0; i < len; i++) {
            char c = generate.charAt((int) Math.floor(Math.random() * generate.length()));
            generate = generate.replaceAll(CharacterTools.toString(c),"");
            str += CharacterTools.toString(c);
        }
        return str.toCharArray();
    }

    /**
     * 随机获取一个字符数组，长度为传入的值i，字符数组不能重复，i值不能超过52
     * @param i  随机字符数组的长度
     * @return   随机生成的字符数组
     */
    public static char[] getRandomCharArrayByNumber(int i){
        if(i > 52){
            throw new RuntimeException("输入的值不能超过52!");
        }
        String generate = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSTUVWXYZ";
        String str = "";
        for (int j = 0; j <i ; j++) {
            char c = generate.charAt((int) Math.floor(Math.random() * generate.length()));
            generate = generate.replaceAll(CharacterTools.toString(c),"");
            str += CharacterTools.toString(c);
        }
        return str.toCharArray();
    }

    /**
     * 通过位移的方式，将原数组中的char便宜固定个数后，生成新字符，并装入新字符数组放回
     * @param chars  要位移的数组
     * @return       位移之后的数组
     */
    public static char[] encryptCharArray(char[] chars){
       char[] charsClone = chars;
       for(int i = 0; i < charsClone.length;i++){
           if(i % 2 ==0){
               charsClone[i] = (char) (charsClone[i] + 4);
           }else{
               charsClone[i] = (char) (charsClone[i] - 4);
           }
       }
        return charsClone;
    }

    /**
     * 通过位移的方式，将原数组中的char还原固定个数后，还原成就字符，转入新字符数组返回
     * @param chars  需要还原的字符数组
     * @return       还原之后的新生成的字符数组
     */
    public static char[] decryptCharArray(char[] chars){
        char[] charsClone = chars;
        for(int i = 0; i < charsClone.length;i++){
            if(i % 2 ==0){
                charsClone[i] = (char) (charsClone[i] - 4);
            }else{
                charsClone[i] = (char) (charsClone[i] + 4);
            }
        }
        return charsClone;
    }


    public static String toString(char c){
        String str = "" + c;
        return str;
    }
    public static void main(String[] args) {
        char[] chars = {'a','b','c','d','e','f','g'};
        char[] charEncrypt = CharacterTools.encryptCharArray(chars);
        for (char c :
                charEncrypt) {
            System.out.println(c);
        }
        System.out.println("============");
        char[] charDecrypt = CharacterTools.decryptCharArray(charEncrypt);
        for (char c :
                charDecrypt) {
            System.out.println(c);
        }
    }
}
