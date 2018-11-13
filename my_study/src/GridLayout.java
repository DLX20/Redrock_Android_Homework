import javax.swing.*;
import java.awt.*;

public class GridLayout extends JFrame {
    public GridLayout(){
        Container c=getContentPane();
        setLayout(new java.awt.GridLayout(7,3,5,5));
        for(int i=0;i<20;i++){
            c.add(new JButton("按键"+i));
        }
        setSize(300,300);
        setTitle("这是一个网格布局管理器的窗体");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    }
    public static void main(String[] agr){
        new GridLayout();
    }
}
