package Lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card {
    String number[] = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    String color[] = new String[]{"黑桃", "红桃", "方块", "梅花"};
    String FirstKing = "大王";
    String SecondKing = "小王";
    String[] cards=new String[54];

    public void put() {
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < number.length; j++) {
                System.out.print(color[i] + number[j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.print(FirstKing + " " + SecondKing);
        System.out.println();
    }

    public void Shuffle() {
        List<String> list = new ArrayList();
        int m = 0;
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < number.length; j++) {
                this.cards[m] = color[i] + number[j];
                m++;
            }
        }
        this.cards[m] = FirstKing;
        this.cards[m + 1] = SecondKing;
        for (int i = 0; i < this.cards.length; i++) {
            list.add(this.cards[i]);
        }
        Collections.shuffle(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            if (i % 13 == 0 && i != 0)
                System.out.println();
        }
        System.out.println('\n');
        for(int i=0;i<list.size();i++){
            this.cards[i]=list.get(i);
        }
        System.out.println("牌已经洗好，，，请玩家准备啦。。。。。");
    }
    public String GetCard(int x){
        return this.cards[x-1];
    }

}
