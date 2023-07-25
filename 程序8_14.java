import java.awt.*;
import javax.swing.*;
import java.awt.event.*;;

public class 程序8_14 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionEvent Demo2");
        MyButton b = new MyButton("Close");
        frame.getContentPane().add(b, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MyButton extends JButton implements ActionListener {
    public MyButton(String text) {
        super(text);
        addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}