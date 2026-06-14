package NewPack;

public class ExceptionClass {
    public void divide(int a)
    {
        int res=0;
        try{
            res=20/a;
            System.out.println("Result:"+res);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error occurred..." +e);
        }
        finally{
            System.out.println("Finally called");
        }
    }
    public static void main(String[]args)
    {
        ExceptionClass obj=new ExceptionClass();
        obj.divide(0);
        obj.divide(2);
    }
    
}
