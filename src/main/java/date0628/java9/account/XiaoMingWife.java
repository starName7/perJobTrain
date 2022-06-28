package date0628.java9.account;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class XiaoMingWife implements Runnable {
    private Account account;
    private double withdrawal;


    public XiaoMingWife(Account account, double withdrawal) {
        this.account = account;
        this.withdrawal = withdrawal;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(double withdrawal) {
        this.withdrawal = withdrawal;
    }

    public void run() {
        while (true) {
            Account.lock.lock();
            if (account.getBalance() > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(account.getBalance() >= this.getWithdrawal()){
                    account.setBalance(account.getBalance() - this.getWithdrawal());
                    System.out.println(Thread.currentThread().getName() + "取了一次款，现在的余额还有: " + account.getBalance());
                }else{
                    System.out.println("余额不足取款额");
                    Account.lock.unlock();
                    break;
                }
                Account.lock.unlock();
            } else {
                System.out.println("余额不足");
                Account.lock.unlock();
                break;
            }

        }
    }
}
