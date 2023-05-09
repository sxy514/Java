import java.util.Vector;

class Question {

    // 方法 int getNum(int n）的功能是返回 整数n的位数
    static int getNum(int n)  {
        // do循环 每次循环都将参数 n 的值 除以 10 ，并且 x 加 1 
        int x = 0;
        do {
            n /= 10;
            x++;
        } while( n != 0 );

        return x;
   }

   // 方法 int maxDigit(int n)的功能是通过while循环找出十进制整数n 各位中最大的一位数字。例如：12359，将返回9
   static int maxDigit(int n) {
        int c = 0, d;
        while (n > 10 ){
            d = n % 10 ;
            if (d > c)
                c = d;
            n /= 10;
        }
        return c;
   }

   // 请写出该函数的输出结果
   static void expressTest() {
        int a = 1, b = 3, c = 6, d;
        d = (a + b * 3) % c >> 1;
        System.out.println(d);
   }

   // Vector添加元素
   public static void myVectorMethod() {
    Vector<Double> myVector = new Vector<Double>();
    for (int i = 1; i <= 10; i++) {
        myVector.addElement(Math.random());
    }
    System.out.println(myVector.elementAt(5) + "\t");
    myVector.insertElementAt(55555d, 5);  // 插入在下标为5的位置，原来这个位置及后续各位置的元素均后移一位。
    System.out.println(myVector.elementAt(6) + "\t");
   }

    public static void main(String[] args) {
        System.out.println(getNum(55));
        System.out.println(maxDigit(265));
        expressTest();

        boolean a, b, c;
        a = c = false;
        b = true;

        a = a || b;
        b = a &&(b||c);
        c = b && a && c;
        System.out.println(a+ " and " + b + " " + c);
        myVectorMethod();

        
    }
}