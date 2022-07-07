package date0706.java17.five;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args) {
        Law law = (Law) LawProxy.action(new Plaintiff());
        law.trial();
    }
}
interface Law{
    void trial();
}
class Plaintiff implements Law{
    @Override
    public void trial() {
        System.out.println("打官司");
    }
}

class LawProxy{
    public static Object action(Object obj){
        Object o = Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),new ProxyHandler(obj));
        return o;
    }
}
class ProxyHandler implements InvocationHandler{
    private Object obj;

    public ProxyHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理前执行");
        method.invoke(obj,args);
        System.out.println("代理后执行");
        return null;
    }
}
