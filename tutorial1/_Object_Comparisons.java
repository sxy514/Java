package tutorial1;

public class _Object_Comparisons {
    // 什么是对象比较？ 两个对象是否相等
    public static void main(String[] args){

        Student s1 = new Student("tim");
        Student s2 = new Student("tim");
        System.out.println(s1 == s2); // false

        System.out.println(s1.equals(s2)); // 类中创建比较函数，然后调用比较
        System.out.println(s2);

        System.out.println(s1.compareTo(s2) > 0);


    }






}
