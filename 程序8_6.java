import java.awt.*;

import javax.swing.*;

public class 程序8_6 {
    // 布局管理器示例
    private JFrame frame;
    private JButton button1, button2, button3;
    public static void main(String[] args) {
        程序8_6 that = new 程序8_6();
        that.go();
    }
    public void go() {
        frame = new JFrame("Flow Layout");
        Container contentPane = frame.getContentPane(); // 内容窗格
        contentPane.setLayout(new FlowLayout()); // 为内容窗格设置Flow Layout布局管理器
        button1 = new JButton("OK");        // 分别创建3个按钮
        button2 = new JButton("Open");
        button3 = new JButton("Close");
        contentPane.add(button1);               // 向内容窗格中添加3个按钮
        contentPane.add(button2);
        contentPane.add(button3);
        frame.setSize(200,100);     // 设定窗口大小
        frame.setVisible(true);                // 显示窗口
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // 退出时关闭窗口
    }
}
