class BankAccount {
    private String OwnerName;
    private int AccountNumber;
    private float Balance;
    BankAccount(String name, int num1, float num2) { // 构造方法
      OwnerName = name;
      AccountNumber = num1;
      Balance = num2;
    }
    String getOwnerName() {  //返回名字
      return OwnerName;
    }
    int getAccountNumber() { // 返回账号
      return AccountNumber;
    }
    float getBalance() {  // 返回余额
      return Balance;
    }
    public boolean equals(Object x) {
        if(this.getClass() != x.getClass())   // 具有相同的类型
          return false;
        BankAccount b = (BankAccount)x;
        return((this.getOwnerName().equals(b.getOwnerName()))
              &&(this.getAccountNumber() == b.getAccountNumber())
              &&(this.getBalance() == b.getBalance())); // 判定各个成员变量的值是否相等
      }
  }
  public class EqualsTest {
    public static void main(String args[]) {
      BankAccount a = new BankAccount("张三", 123456, 1000.0f);
      BankAccount b = new BankAccount("张三", 123456, 1000.0f);
      // BankAccount b = a;
      if (a.equals(b)) {
        System.out.println("equals_YES");
      } else {
        System.out.println("equals_NO");
      }
      if (a == b) {
        System.out.println("==_YES");
      } else {
        System.out.println("==_NO");
      }    
    }
  }