import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class 程序8_9 extends MouseAdapter {
    JPanel p1, p2, p3;
    JLabel l1, l2, l3;
    CardLayout myCard;      // 声明一个CardLayout对象
    JFrame frame;
    Container contentPane;

    public static void main(String[] args) {
        程序8_9 that = new 程序8_9();
        that.go();
    }

    public void go() {
        frame = new JFrame("Card Test");
        contentPane = frame.getContentPane();
        myCard = new CardLayout();
        contentPane.setLayout(myCard);      // 设置CardLayout布局管理器
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        l1 = new JLabel("This is the first JPanel");   // 为每一个JPanel创建一个标签
        p1.add(l1);
        p1.setBackground(Color.yellow);                     // 设定不同的背景颜色，以便于区分
        l2 = new JLabel("This is the second JPanel");
        p2.add(l2);
        p2.setBackground(Color.green);
        l3 = new JLabel("This is the third JPanel");   
        p3.add(l3);
        p3.setBackground(Color.magenta);    
        p1.addMouseListener(this);                         // 设定鼠标监听事件
        p2.addMouseListener(this);
        p3.addMouseListener(this);
        // 将每一个JPanel作为一张卡片加入frame的内容窗格。
        contentPane.add(p1,"First");
        contentPane.add(p2,"Second");
        contentPane.add(p3,"Third");
        myCard.show(contentPane, "First");            // 显示名为"First"的卡片
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // 处理鼠标事件，每当按下鼠标键时，即显示下一张卡片
    // 如果已经显示到最后一张，则重新显示第一张
    public void mouseClicked(MouseEvent e) {
        myCard.next(contentPane);
    }
}
