//Encapsulation="Data hiding to control accessibilty of the attribute of the class"
//prevent from overriding
//provide security
//to control the visibility

public class ParentClass {
    int a=10;
    public int b=15;
    protected int c=5;
    public int d=11;

    void show()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
