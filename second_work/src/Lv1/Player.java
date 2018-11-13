package Lv1;

public class Player {

    String player[] = new String[]{"里脊", "花生"};

    public void getPlayer() {
        for (int i = 0; i < player.length; i++) {
            System.out.println((i + 1) + "." + player[i]);
        }
    }

    public String TakeCard(Card card,int x) {
        return card.GetCard(x);
    }

    public void PutCard(String play1,String play2){
        System.out.println("玩家里脊的牌是："+play1);
        System.out.println("玩家花生的牌是："+play2);
    }
}
