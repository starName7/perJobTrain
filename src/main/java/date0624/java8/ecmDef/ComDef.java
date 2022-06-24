package date0624.java8.ecmDef;

public class ComDef {
    public static void main(String[] args) {
        ecm(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
    }
    public static void ecm(int a,int b){

        try{
            if(a < 0 || b < 0){
                throw new EcDef("请输入正数");
            }
            System.out.println(a/b);
        }catch(NumberFormatException e){
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (EcDef e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("定义异常 EcDef 处理负数的输入");
        }
    }

}

class EcDef extends RuntimeException {

    private static final long serialVersionUID = -2610178984107103876L;

    public EcDef() {
    }
    public EcDef(String message){
        super(message);
    }
}
