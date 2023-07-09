// 用Thread类的子类创建线程

class LeftHand extends Thread{
    public void run() {                // 线程体
        for(int i = 0; i <= 5; i++) {
            System.out.println("I am LeftHand");    // 输出6次信息
            try {
                sleep(500);
            } catch(InterruptedException e){ }
        }
    }
}

class Righthand extends Thread{
    public void run() {                 // 线程体
        for(int i = 0; i <= 5; i++) {
            System.out.println("I am RightHand");    // 输出6次信息
            try {
                sleep(300);
            } catch(InterruptedException e){ }
        }
    }
}

public class 程序10_1 {
    static LeftHand left;
    static Righthand right;
    public static void main(String[] args) {
        left = new LeftHand();
        right = new Righthand();
        left.start();
        right.start();
    }
}