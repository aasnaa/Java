public class OddEven_print {
    public static void main(String []args)
    {
        int num=100;
        int i;
          System.out.println("even:" );
        for(i=0;i<num;i++)
        {
            if(i%2==0)
            {

            
          System.out.println("\t" + i);
            }

        }
        System.out.println("Odd:");
        for(i=0;i<num;i++)
        {
            if(i % 2 !=0)
            {
              System.out.println("\t" +i);
            }
        }

    }
}
