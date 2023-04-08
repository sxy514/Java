package tutorial1;

public class InnerClass {

    // 创建一个内部类
    public class InnerClass1 {
        public void display() {
            System.out.println("this is an Inner class");
        }

    }

    public void Inner() {
        InnerClass1 in = new InnerClass1();
        in.display();
    }


}
