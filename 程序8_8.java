import java.awt.*;
import javax.swing.*;

public class 程序8_8 {
    public static void main(String[] args) {
        MyWindow that = new MyWindow();
        that.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MyWindow extends JFrame {
    private JButton b1, b2, b3, b4, b5, b6;
    MyWindow() {
        setTitle("Grid example");
        Container contentPane = getContentPane();
        contentPane.setPreferredSize(new Dimension(400, 350)); // 设置窗口大小
        contentPane.setLayout(new GridLayout(3,2)); // 3行2列的GridLayout布局管理器
        b1 = new JButton("grid_1");     // 创建按钮
        b2 = new JButton("grid_2"); 
        b3 = new JButton("grid_3");
        b4 = new JButton("grid_4");
        b5 = new JButton("grid_5");
        b6 = new JButton("grid_6");
        contentPane.add(b1);        // 添加按钮
        contentPane.add(b2);
        contentPane.add(b3);
        contentPane.add(b4);
        contentPane.add(b5);
        contentPane.add(b6);
        pack();
        setVisible(true);
    }
}