import java.lang.*;
import java.util.*;

class Array5
{
    public static void main(String a[])
    {
        int Arr[]={ 10,20,30,40,50};

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the index");

        int index=sobj.nextInt();

        try
        {
            System.out.println("Elemnt at that indeax is:"+Arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Inside catch 1 ");
            System.out.println(obj);
        }
        catch(Exception obj)
        {
            System.out.println("Inside catch 2 ");
            System.out.println(obj);
        }
        finally
        {
            System.out.println("Inside finally");
            sobj.close();
        }
        System.out.println("End of Application");
    }
}
