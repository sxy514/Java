import java.awt.*;
import javax.swing.*;

public class 程序8_12 {
    private JFrame frame;
    private JButton b1, b2, b3;
    public static void main(String[] args) {
        程序8_12 that = new 程序8_12();
        that.go();
    }
    void go() {
        frame = new JFrame("Null Layout example");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(null);   // 设置布局管理器为null
        b1 = new JButton("Yes");
        contentPane.add(b1);               // 添加按钮
        b2 = new JButton("No"); 
        contentPane.add(b2);
        b3 = new JButton("Cancel");
        contentPane.add(b3);
        b1.setBounds(30,15,75,20); // 设置按钮的位置和大小
        b2.setBounds(60,60,75,50);
        b3.setBounds(160,20,75,30);
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
