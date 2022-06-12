import java.lang.*;
import java.io.*;

class Input2
{
    public static void main(String a[])
    {
        InputStreamReader iobj=new InputStreamReader(System.in);
        BufferedReader bobj= new BufferedReader(iobj);
        try
        {
            System.out.println("Enter your Name");
            String name =bobj.readLine();
            System.out.println("Your name is:"+name);

            System.out.println("Enter your Age");
            int Age=Integer.parseInt(bobj.readLine());
            System.out.println("Your Age is:"+Age);
        }
        catch(IOException obj) 
        {
            System.out.println("Exception occurs");
        }
        finally
        {
            iobj=null;
            bobj=null;
        }
    }
}