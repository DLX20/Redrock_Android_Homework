package Lv1;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------欢迎来到皇家赌场--------");
        Player play = new Player();
        System.out.println("今天的2位玩家是：");
        play.getPlayer();
        Card card = new Card();
        System.out.println("这是我们的一副新牌，请你们过目.........");
        System.out.println();
        card.put();
        System.out.println();
        System.out.println("我要开始花样洗牌啦，，，看好啦。。。。。" + '\n');
        card.Shuffle();
        String play1,play2;
        System.out.println("请玩家1里脊抽牌.........(只能一张哦）");
        play1=play.TakeCard(card,1);
        System.out.println("请玩家2花生抽牌.........(也只能一张牌哦)");
        play2=play.TakeCard(card,2);
        System.out.println("请2位玩家出示你们抽的牌..............");
        play.PutCard(play1,play2);
    }
}
