public class B extends A{
    void show()
    {
        System.out.println("This is child  class");
        super.show();
        super.show(10);
    }
    public static void main(String []args)
    {
        B obj=new B();
        obj.show();
      

    }
     
}
