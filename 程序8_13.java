import java.awt.*;                                              // 对应①
import javax.swing.*;
import java.awt.event.*;

public class 程序8_13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionoEvent Demo");
        JButton b = new JButton("Press me");
        b.addActionListener(new ButtonHandler());               // 注册侦听程序，对应②
        frame.getContentPane().add(b, BorderLayout.CENTER);     // 添加按钮
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class ButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {                // 出现ActionEvent事件时调用的方法，对应③
        System.out.println("Action occurred");                // 显示信息
    }
}