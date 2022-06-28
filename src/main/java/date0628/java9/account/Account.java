package date0628.java9.account;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String accountingNumber;
    private double balance;
    static Lock lock = new ReentrantLock();

    public Account() {
    }

    public Account(String accountingNumber, double balance) {
        this.accountingNumber = accountingNumber;
        this.balance = balance;
    }

    public String getAccountingNumber() {
        return accountingNumber;
    }

    public void setAccountingNumber(String accountingNumber) {
        this.accountingNumber = accountingNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object obj) {
//判断是否为同一对象
        if(obj == this){
            return true;
        }
//        判断类型是否相同
        if(obj instanceof Account){
            //转型
            Account a = (Account)obj;
            //判断各个成员属性是否相同
            if(Double.compare(this.getBalance(),a.getBalance()) == 0){
                if (this.getAccountingNumber().equals(a.getAccountingNumber())){
                    return true;
                }
            }
        }
        return false;


    }

    public static void main(String[] args) {
        Account account = new Account("12345678",10000);
        XiaoMing xm = new XiaoMing(account,100);
        XiaoMingWife xmw = new XiaoMingWife(account,200);
        Thread thread1 = new Thread(xm,"小明");
        Thread thread2 = new Thread(xmw,"小明的妻子");
        thread1.start();
        thread2.start();
    }
}
