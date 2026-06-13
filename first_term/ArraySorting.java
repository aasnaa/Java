public class ArraySorting {
    public static void main(String[]args)
    {
        int a[]={10,5,100,90,77};
        int i,j,temp;
        for(i=0;i<(a.length-1);i++)
        {
            for(j=i+1;j<(a.length);j++)
            {
                if( a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("");
        for(i=0;i<(a.length);i++)
        {
            System.out.println("\t" +a[i]);
        }

    }
}

