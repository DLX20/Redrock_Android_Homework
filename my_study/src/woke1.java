import javax.swing.*;
import java.awt.*;

public class woke1 extends JFrame {
    public void CreateJFrame(String title){
        JFrame jf=new JFrame(title);     //创建窗体对象
        Container container=jf.getContentPane();        //创建容器
        JLabel jl=new JLabel("这是一个JFrame窗体");             //创建标签对象
        jl.setHorizontalAlignment(SwingConstants.CENTER);       //使标签上的文字居中
        container.add(jl);      //将标签加到容器中
        container.setBackground(Color.white);       //设置窗体背景
        jf.setVisible(true);        //使窗口可视化
        jf.setSize(500,550);         //设置窗体长宽
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);         //关闭窗体
    }
    public static void main(String[] arg){
        new woke1().CreateJFrame("创建一个JFrame窗体");
    }

}
