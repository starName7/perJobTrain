package date0628.java9.exercises.sixth;

public class Test06 {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        ChiHuo ch = new ChiHuo("吃货" ,bz);
        BaoZiPu bzp = new BaoZiPu("包子铺",bz);
        ch.start();
        bzp.start();
    }
}
class BaoZi{
    String pier;
    String xianer;
    boolean flag = false;

    public String getPier() {
        return pier;
    }

    public void setPier(String pier) {
        this.pier = pier;
    }

    public String getXianer() {
        return xianer;
    }

    public void setXianer(String xianer) {
        this.xianer = xianer;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
class ChiHuo extends Thread{
    private BaoZi bz;
    public ChiHuo(String name,BaoZi bz){
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        while(true){
            synchronized (bz){
                if(bz.flag == false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃" + bz.pier + bz.xianer + "包子");
                bz.flag = false;
                bz.notify();
            }
        }
    }
}
class BaoZiPu extends Thread{
    private BaoZi bz;

    public BaoZiPu(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while(true){
            synchronized (bz){
                if(bz.flag == true){
                    try{
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("包子铺开始做包子了");
                if(count % 2 ==0){
                    bz.pier = "冰皮";
                    bz.xianer = "五仁";
                }else{
                    bz.pier = "薄皮";
                    bz.xianer = "牛肉大葱";
                }
                count++;
                bz.flag = true;
                System.out.println("包子造好了: " + bz.pier + bz.xianer);
                System.out.println("吃货来吃吧");
                bz.notify();
            }
        }
    }
}