package Lv2;

import java.util.ArrayList;

public class Menu {
    String MenuName="红高粱菜单";
    String menu[];
    int price[];
    int label[];

    public void Put(){
        this.menu=new String[]{"椒盐里脊","糖醋排骨","农夫过水鱼","珍珠奶茶","冒菜","重庆小面"};
        this.price=new int[]{15,20,30,6,10,3};
        this.label=new int[]{1,2,3,4,5,6};
        for(int i=0;i<menu.length;i++){
            System.out.println(label[i]+"."+" "+menu[i]+" "+price[i]+"元");
        }
    }

    public void Choose(ArrayList<Integer> a){
        for(int i=0;i<a.size();i++){
            for(int j=0;j<this.label.length;j++){
                if(a.get(i)==this.label[j]){
                    System.out.println(this.label[j]+"."+" "+this.menu[j]);
                }
            }
        }
    }

    public void Calculate(ArrayList<Integer> a){
        int sum=0;
        for(int i=0;i<a.size();i++){
            for(int j=0;j<this.label.length;j++){
                if(a.get(i)==this.label[j]) {
                    sum = sum + this.price[j];
                }
            }
        }
        System.out.println("一共是"+sum+"元");
    }

    public void PayWays(){
        String[] ways=new String[]{"刷脸","微信","支付宝","一卡通"};
        for(int i=0;i<ways.length;i++) {
            System.out.println((i+1)+"."+ways[i]);
        }
    }

    public boolean Judge(int pay) {
        if (pay > 4 || pay <= 0) {
            System.out.println("Sorry,我们这里没有这个选项的支付方式........");
            System.out.println("请换一种方式付款哦.............");
            return false;
        }
        else {
            System.out.println("支付成功，请慢慢享用您的食物..............");
            return true;
        }
    }
}
