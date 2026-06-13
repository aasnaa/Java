public class NicAsia implements BankDao{
   int amount=0;
   public void deposit(int amt)
   {
    this.amount+=amt;
   } 
   public void withdraw(int amt)
   {
    this.amount-=amt;
   }
   public void ShowBalance()
   {
    System.out.println("Balance:"+amount);
   }
   public static void main(String []args)
   {
    BankDao NicAsia=new NicAsia();
    NicAsia.deposit(100000);
    NicAsia.withdraw(50000);
    NicAsia.ShowBalance();
   }
}
