//constructor= to initialize the attributes of the class

public class Math {
    int a; //instance property
    Math()
    {
        a=10;
    }
    void show()
    {
        int b=50; //local property
        System.out.println(b); 
        System.out.println(this.a);

    }

public static void main(String[]args)
{
Math obj=new Math();
obj.show();

}
}
