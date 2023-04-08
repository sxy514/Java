package tutorial1;

public interface Vehicle {  // interface
    int gears = 5;
    void changeGear(int a);
    void speedUp(int a);
    void slowDown(int a);

    default void  out() {
        System.out.println("Default Method");
    }

    static  int math(int b){ //静态方法直接调用
        return b + 2;
    }


}
