import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
// 程序8_15同时实现MouseMotionListener和MouseListener
public class 程序8_15 implements MouseListener, MouseMotionListener{
    private JFrame frame;
    private JTextField tf;
    public static void main(String[] args) {
        程序8_15 that = new 程序8_15();
        that.go();
    }
    void go() {
        frame = new JFrame("Two listeners example");
        Container contentPane = frame.getContentPane();
        contentPane.add(new JLabel("Click and drag the mouse"),BorderLayout.NORTH); 
        tf = new JTextField(30);
        contentPane.add(tf, BorderLayout.SOUTH);
        frame.addMouseMotionListener(this);   // 注册侦听程序
        frame.addMouseListener(this);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // 实现MouseMotionListener接口中的方法
    public void mouseDragged(MouseEvent e) {
        String s = "Mouse dragging:  X =" + e.getX() + " Y = " + e.getY();
        tf.setText(s);   
    }

    public void mouseMoved(MouseEvent e) {}
    // 实现MouseListener接口中的方法
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {
        String s = "The mouse entered";
        tf.setText(s);
    }
    public void mouseExited(MouseEvent e) {
        String s = "The mouse has left the building";
        tf.setText(s);
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    
}
