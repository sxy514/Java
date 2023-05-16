package tutorial1;

class SuperClass {
    void showMyPosition() {
      System.out.println("This is the superClass!");
    }
  }
  class SubClass extends SuperClass {
    void showMyPosition() {     
      System.out.println("At first I will go to superClass!");
      super.showMyPosition();   // 调用父类方法
      System.out.println("Now I hava moved to subClass!");
    }
  }
  public class SuperTest {
    public static void main(String args[]) {
      SubClass sub = new SubClass();  // 创建子类对象
      sub.showMyPosition();           // 调用子类方法
    }
  }