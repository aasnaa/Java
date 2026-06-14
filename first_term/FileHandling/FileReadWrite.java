package FileHandling;
import java.io.*;
public class FileReadWrite {
    void FileWrite(String file)throws Exception{
        FileWriter fw=new FileWriter(file);
        PrintWriter pw=new PrintWriter(fw);
        pw.println("Hello from java");
        pw.flush();
        pw.close();
        fw.close();


    }
    void FileRead(String file)throws Exception
    {
        FileReader fr=null;
        try{
            fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            while(true)
            {
                String line =br.readLine();
                if(line==null)
                {
                    break;
                }
                System.out.println(line);

            }
            br.close();
        }
        catch(Exception e)
        {
            System.out.println("Error occurred while reading"+e);

        }
        finally{
            try{
               fr.close();

            }
            catch(Exception e)
            {
                System.out.println("Error occurred while closing"+e);

            }
            
        }

    }
    public static void main(String []args)throws Exception
    {
        FileReadWrite obj=new FileReadWrite();
        obj.FileWrite("file.txt");
        obj.FileRead("file.txt");
    }

}
