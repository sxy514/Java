import java.awt.*;
import javax.swing.*;

public class 程序8_7 {
    private JFrame frame;
    private JButton be, bw, bn, bs, bc;
    public static void main(String[] args) {
        程序8_7 that = new 程序8_7();
        that.go();
    }
    void go() {
        frame = new JFrame("Border Layout");
        be = new JButton("East");
        bs = new JButton("South");
        bw = new JButton("West");
        bn = new JButton("North");
        bc = new JButton("Center");
        frame.getContentPane().add(be, BorderLayout.EAST);  // 添加按钮到右部
        frame.getContentPane().add(bs, BorderLayout.SOUTH); // 添加按钮到下部
        frame.getContentPane().add(bw, BorderLayout.WEST);  // 添加按钮到左部
        frame.getContentPane().add(bn, BorderLayout.NORTH); // 添加按钮到上部
        frame.getContentPane().add(bc, BorderLayout.CENTER);// 添加按钮到中部
        frame.setSize(350,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 退出时关闭窗口
    }
}
