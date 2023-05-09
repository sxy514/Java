// 向量示例
import java.util.*;

import javax.naming.event.ObjectChangeListener;

public class MyVectorTest extends Vector {
    public MyVectorTest() { 
        super(1,1);  // 指定 capacity 和 capacityIncrement  的值
    }

    public void addInt(int i) {
        addElement(new Integer(i));
    }

    public void addFloat(float f) {
        addElement(new Float(f));
    }

    public void addString(String s) {
        addElement(s);
    }

    public void addCharArray(char a[]) {
        addElement(a);
    }

    public void printVector() {
        Object o;
        int length = size();
        System.out.println("Number of vector elements is " + length + "and they are:");
        for (int i = 0; i < length; i++) {
            o = elementAt(i);
            if(o instanceof char[]){
                System.out.println(String.copyValueOf((char[])o));
            } 
            else {
                System.out.println(o.toString());
            }
        }
    }

    public static void main(String args[]) {
        MyVectorTest mv = new MyVectorTest();
        int digit = 5;
        float real = 3.14f;
        char letters[] = {'a', 'b', 'c', 'd'};
        String s = new String("Hi there!");
        mv.addInt(digit);
        mv.addFloat(real);
        mv.addString(s);
        mv.addCharArray(letters);
        mv.printVector();
    }


}
