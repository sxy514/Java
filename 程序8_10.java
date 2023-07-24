import java.awt.*;
import javax.swing.*;

public class 程序8_10 {
    private JFrame frame;
    private JPanel pv, ph;
    public static void main(String[] args) {
        程序8_10 that = new 程序8_10();
        that.go();
    }
    public void go() {
        frame = new JFrame("Box Layout example");    
        Container contentPane = frame.getContentPane();
        pv = new JPanel();
        pv.setLayout(new BoxLayout(pv, BoxLayout.Y_AXIS));  // 为pv设置为垂直方向的BoxLayout
        pv.add(new JLabel("  First"));                 // 为ov添加表亲啊lable
        pv.add(new JLabel("  Second"));     
        pv.add(new JLabel("  Third"));
        contentPane.add(pv, BorderLayout.CENTER);           // 将pv添加到内容窗格的中部
        ph = new JPanel();  
        ph.setLayout(new BoxLayout(ph, BoxLayout.X_AXIS));
        ph.add(new JButton("Yes"));                 // 为ph添加按钮
        ph.add(new JButton("NO"));
        ph.add(new JButton("Cancel"));
        contentPane.add(ph,BorderLayout.SOUTH);         // 将ph添加到内容窗格的下部
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 如果不加这句，关闭程序窗口仍没有结束
    }
}
