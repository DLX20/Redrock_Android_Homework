package Lv2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Menu menu = new Menu();
        System.out.println("欢迎来到"+menu.MenuName+"........");
        System.out.println("----------今日菜品------------");
        menu.Put();         //输出菜单
        System.out.println("请输入你想吃的菜的序号：");
        ArrayList<Integer> List=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        String line=scan.nextLine();
        String[] a=line.split(" ");
        for(int i=0;i<a.length;i++){
            int temp=Integer.parseInt(a[i]);
            List.add(temp);
        }
        System.out.println("你选择了：");
        menu.Choose(List);
        menu.Calculate(List);
        System.out.println("-------------支付方式-------------");
        menu.PayWays();
        System.out.println("请选择付款的方式：");
        //int pay=scan.nextInt();
        boolean isTure;
        do{
            int pay=scan.nextInt();
            isTure=menu.Judge(pay);
        }while(isTure==false);

    }
}
