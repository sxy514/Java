import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class 程序8_4 extends WindowAdapter implements ActionListener{
    JFrame f;
    JButton b;
    JTextField tf;
    int tag = 0;
    public static void main(String[] args) {
        程序8_4 be = new 程序8_4();
        be.go();
    }

    public void go() {
        f = new JFrame("JButton Example");
        b = new JButton("Sample");
        b.addActionListener(this);
        f.getContentPane().add(b, "South");
        tf = new JTextField();
        f.getContentPane().add(tf, "Center");
        f.addWindowListener(this);
        f.setSize(300,150);
        f.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) { //实现接口中的actionPerformed()方法
        String s1 = "You have pressed the Button!";
        String s2 = "You do another time!";
        if(tag == 0) {
            tf.setText(s1);;
            tag = 1;
        } else {
            tf.setText(s2);
            tag = 0;
        }
    }
    // 覆盖WindowAdapter类中的windowClosing()方法
    public void windowClosing(WindowEvent e) {
        System.exit(0);
        // 结束程序运行
    }

}
