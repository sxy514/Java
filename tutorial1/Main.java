package tutorial1;
import java.util.*;




public class Main {
    public static void main(String[] args) {
        int number = 1;
        double dnumber = 2.2d;
        boolean b = true;
        char c = '2';
        String s = "set"; // 字符串不是原始数据类型

        int a;// 创建变量但没有初始化,无法使用未初始化的变量
        double d = Math.pow(number,dnumber);
        Scanner myScan = new Scanner(System.in);

//        System.out.println("Enter your number: ");
//        String scanned = myScan.nextLine();
//        int x = Integer.parseInt(scanned); // 这样能转为整数
        // 如果向输入其他数据类型
        //  int inputNum = myScan.nextInt();

        // > < == >= <= !=
        //boolean isnum = x != number;

        // 流程控制语句：if  / if else / if else if
        // s.equals("tim");  将此字符串与指定对象进行比较。当且仅当参数不为空且为String对象，表示与此对象相同的字符序列时，结果为真
//        if (scanned.equals("tim")) {
//            System.out.println("You typed tim");
//        }
//        else {
//            System.out.println("Print");
//        }

        // 数组： 固定的有多种元素组成的数组
        String[] newArr = new String[5];
        newArr[1] = "timasda";
        newArr[0] = "timasdwxsw";

        int[] num = {1,2};
        num[1] = 1;
        System.out.println(num[0] +  " " + newArr[1]);

        // for循环
        for (int i = 1;i < 10;i++) {
            System.out.println("for:"+newArr[0]);
            if (i >= 3) break;
        }
        int i = 0;
        int icount = i + 1;
        // while 循环
        while (true) {
            System.out.println("This is While Loops");
           if (icount >= 2) break;
           icount++;
        }

        // sets and list： 集合和列表: 集合不能包含重复的元素，而列表可以，而且列表是有序排列的
        // 来自Java中称为集合接口的东西。
        Set<Integer> t = new HashSet<Integer>(); // 什么是集合？ 集合内的元素是独一无二的，并且无序
        t.add(5);
        t.add(6);
        t.add(7);
        t.remove(7);
        int tnum =  t.size(); // 获取集合t的大小
        boolean xs = t.contains(6); // 如果此集合包含指定的元素，则返回true。更正式地说，当且仅当该集合包含一个元素e，使得Objects。= (o, e)。
        t.clear(); // 清空
        System.out.println(t);

        Set<Integer> m = new TreeSet<Integer>(); // 类似集合,你只能拥有唯一元素,实际上是有序的,是在树状数据结构中排序的
        m.add(7);
        m.add(9);
        m.add(2);
        // int mnum = m.size();
        System.out.println(m);


        // Set<Integer> hashj = new LinkedHashSet<Integer>(); //哈希集

        // 列表
        ArrayList<Integer> aT = new ArrayList<Integer>(); // 如果你不知道用什么List好的话，就用ArrayList很不错
        aT.add(5);
        aT.add(2);
        aT.set(0,2); //将列表中指定位置的元素替换为指定的元素。
        aT.subList(1,2); //subList方法是用来返回一个列表的一部分视图,从指定的开始索引(包含)到结束索引(不包含)

        // Maps & HashMaps 这里只看三种Map
        Map m1 = new HashMap(); //HashMap 哈希映射
        // Map是什么？ 是键值对
        m1.put("tim",5);
        m1.put("joe",11);
        //m1.put(11,2);
        m1.put(11,222);//相同的key，会覆盖前一个值

        System.out.println("键值对："+m1);
        // TreeMap: 有序排列的树型Map，如下，Key按照首字母进行排序,这也意味着我们传入Key的数据类型必须相同
        Map m2 = new TreeMap();
        m2.put("xy",21);
        m2.put("sx",22);
        m2.put("a2","2b");
        System.out.println("TreeMap: "+m2);

        // LinkedHashMap：LinkedHashMap是Java中的一个类，它继承了HashMap类，并实现了Map接口。它使用哈希表和双向链表来存储和遍历键值对。
        // LinkedHashMap的特点是：
        // 它可以保持键值对的插入顺序或访问顺序。
        // 它允许使用null键和null值，并且不保证元素的顺序。
        // 它是非同步的，如果多个线程同时访问它，需要进行外部同步。
        Map m3 = new LinkedHashMap();
        m3.put("tim",2);
        m3.put("linda",22);
        m3.containsKey("tim");
        m3.containsValue(2);

        m3.isEmpty();// 检查map是否为空


        System.out.println("LinkedHashMap: "+m3.get("linda"));
        // Maps Example
        Map h1 = new HashMap();
        String str = "Hello my name is time and i am cool";
        System.out.println(str.toCharArray());

        for (char x:str.toCharArray()) {
            if (h1.containsKey(x)) {
                int old = (int) h1.get(x);
                h1.put(x, old+1);
            }
            else {
                h1.put(x, 1);
            }
        }
        h1.remove(' '); // 删除Key 值也没有了
        System.out.println(h1);

        int[] arrx = {100, 200, 300, 2, 1 ,3 ,4};
        Arrays.sort(arrx, 0, 7); //数组的排序 sort()方法 参数1为数组名称, 参数2和3分别是起始索引和结束索引
        for (int i1:arrx) {
            System.out.print(i1 + ",");  //
        }

        // intro to object
        Scanner sc = new Scanner(System.in); // new 创建类的对象
        // sc.next(); // 从对象调用next 方法
        int xw = 5;
        String  st1 = "hello";
        tim();
        tim("Tim.t ",3);

        // 调用add2 返回形参加2
        System.out.println(add2(2));

        // 调用Dog类
        Dog dog = new Dog("Tim ",4); //在构造函数中定义的参数,在创建类的对象时需要传递参数
        dog.speak();
        Dog tim = new Dog("yxs " , 5);
        tim.speak();
        tim.getAge();
        tim.setAge(10);
        System.out.print(tim.add());
        // Cat类继承了Dog类, 并调用cat类中重载的speak方法
        Cat cat = new Cat("myCat", 22, 100);
        cat.speak();
        cat.eat(10);

        System.out.println(Dog.count);
        Dog.display(); // 被static 关键字声明的属性和方法,不创建实例即可调用

        // 对象比较查看_object_Comparisons class
        // InnerClass
        InnerClass myInObj = new InnerClass();
        myInObj.Inner(); //调用对象myInObj的方法Inner， 方法Inner定义中创建内部类对象并调用内部类的display方法，输出其中的语句

        InnerClass.InnerClass1 myIn2 = myInObj.new InnerClass1(); // 或者直接创建内部类的对象，注意，这里的new需要从外部类调用，如 外部类对象名.new = 内部类名();
        myIn2.display();

        // Interface类： 在被 implement 后可以使用
        Car myCar = new Car();
        myCar.speedUp(10);
        myCar.changeGear(2);
        myCar.display();
        System.out.println(Vehicle.math(2));

        // Enums
        Level lvl = Level.LOW; //枚举类名 枚举变量 = 枚举类.枚举元素
        Level[] arr = Level.values();

        for(Level e : arr) {
            System.out.println(e);
        }
        System.out.println(Level.valueOf("LOW"));

        lvl.setLvl(2);
        System.out.println(lvl.getLvl());






        


    }

    // 类方法:
    public static  void  tim() {
        System.out.print("Tim\n");
    }
    public static void tim(String str, int age) { // 参数传递, 方法重载
        for(int i = 0;i < age; i++) {
            System.out.println(str + age);
        }

    }
    public static int add2(int x){  // void 声明表示不接收返回值, int声明表示该方法接收int返回值
        return x + 2;
    }

}

