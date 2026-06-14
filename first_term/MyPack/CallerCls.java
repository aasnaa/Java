package MyPack;
import DemoPack.*;
public class CallerCls extends DemoPack.Demo {
    public void show()
    {
        super.show();
        System.out.println("Childs show");
    }
    public static void main(String []args)
    {
        CallerCls obj=new CallerCls();
        obj.show();
    }
}
