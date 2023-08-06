import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;;

public class 程序9_1 {
    JFrame frame = new JFrame("JComboBox Demo");
    JComboBox<String> jcb1, jcb2;
    JTextArea ta = new JTextArea(0,30);
    public static void main(String[] args) {
      程序9_1 that = new 程序9_1();   
      that.go();    
    }
    public void go() {
        JPanel p1 = new JPanel(); //创建内部JPanel容器
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        String[] itemList = {"One", "Two", "Three", "Four", "Five"};
        jcb1 = new JComboBox<String>(itemList);
        p1.add(jcb1);
        jcb1.setSelectedIndex(3);   // 设置第四个可选项为当前的显示项
        Border etched = BorderFactory.createEtchedBorder(); // 创建边框
        Border border = BorderFactory.createTitledBorder(etched, "Uneditable JComboBox");
        p1.setBorder(border); // 添加边框
        jcb2 = new JComboBox<String>();
        jcb2.addItem("Six");
        jcb2.addItem("Seven");
        jcb2.addItem("Eight");
        jcb2.addItem("nine");
        jcb2.setEditable(true);  // 将jcb2设置为可编辑的
        p2.add(jcb2);
        border = BorderFactory.createTitledBorder(etched, "Editable jComboBox");
        p2.setBorder(border);
        JScrollPane jp = new JScrollPane(ta);  // 添加滚动条
        p3.setLayout(new BorderLayout());
        p3.add(jp);
        border = BorderFactory.createTitledBorder(etched,"Results");
        p3.setBorder(border);
        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox jcb = (JComboBox)e.getSource();
                if (jcb == jcb1) {
                    jcb2.insertItemAt((String)jcb1.getSelectedItem(), 0);
                    ta.append("\n Item" + jcb1.getSelectedItem() + "insert");
                } else {
                    ta.append("\n You selected item: " + jcb2.getSelectedItem());
                    jcb2.addItem((String)jcb2.getSelectedItem());
                }
            }
        };
        jcb1.addActionListener(al);
        jcb2.addActionListener(al);
        p4.setLayout(new GridLayout(0,1));
        p4.add(p1);
        p4.add(p2);
        Container cp = frame.getContentPane();
        cp.setLayout(new GridLayout(0,1));
        cp.add(p4);
        cp.add(p3);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
}
