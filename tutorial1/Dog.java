package tutorial1;

public class Dog {
    protected String name; // protected 关键字表示受保护的,只有同一个包中的类和子类可以访问
    private int age; // private关键字 表示 这个name 和 age 只能在这个类中访问
    protected static int count ; // static 表示类的变量,不用创建类的实例就可调用
    public static void display() {
        System.out.println("I am Dog");
    }

    public Dog(String name , int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
     System.out.println("I am " + this.name + "and I am " + this.age + " years old");
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int x){
        this.age = x;
    }
    public int add(){
        return this.age;
    }


}
