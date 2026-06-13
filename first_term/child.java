public class child extends parent{
    int data=30;
    void display()
    {
        System.out.println("data" +data);
    }
    public static void main(String []args)
    {
        child obj=new child();
        obj.show();
        obj.display();
    }
    
}
