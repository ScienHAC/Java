package com.krmu.thirdDay;
import java.util.Scanner;
class Atm{
    double val;
    public double CheckMoney(){
        return this.val;
    }
    public void WithdrawMoney(double a){
        val-=a;
    }
    public void DepositMoney(double a){
        val+=a;
    }
    public void doNothing(){
        System.out.println("Enter the value you want to credit or withdraw");
    }
}
public class SimpleAtm {
    public static void main(String[] args){
        Atm att = new Atm();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Enter you choice 1 2 3 exit..............");
            int val = sc.nextInt();
                switch (val) {
                    case 1:
                        System.out.println(att.CheckMoney());
                        break;
                    case 2:
                        double b = sc.nextDouble();
                        att.doNothing();
                        att.WithdrawMoney(b);
                        break;
                    case 3:
                        double c = sc.nextDouble();
                        att.doNothing();
                        att.DepositMoney(c);
                        break;
                    default:
                        flag = false;
                        System.out.println("Exited");
                }
        }
    }
}
