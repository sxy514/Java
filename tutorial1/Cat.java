package tutorial1;

public class Cat extends Dog {
    private int food;

    public Cat(String name, int age, int food) { // 构造函数也可以重载
        super(name, age);
        this.food  = food;
    }
    public Cat(String name) {
        super(name,0);
    }

    public void speak() {
        System.out.println("Meow my name is  " + this.name + " and I get fed " + this.food);
    }
    public void eat(int x) {
        this.food -= x;
    }

}
