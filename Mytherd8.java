import java.lang.*;
import java.util.*;

class Kiran
{
    public int Arr[];
    public Kiran(int size)
    {
        Arr=new int[size];
    }
    public void Accept()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter Number");
        for(int i=0;i<this.Arr.length;i++)
        {
            this.Arr[i]=sobj.nextInt();
        }
    }
    public void Display()
    {
        System.out.println("Data from array is:");
        for(int i=0;i<this.Arr.length;i++)
        {
           System.out.println(this.Arr[i]);
        }
    }
    synchronized public void DisplayEven()
    {
        for(int i=0;i<this.Arr.length;i++)
        {
            if(this.Arr[i]%2==0)
            {
                System.out.println(this.Arr[i]);
            }
        }
    }
}
class Demo extends Thread
{
    public Kiran kref;

    public Demo (Kiran obj)
    {
        this.kref=obj;
    }
    public void run()
    {
        this.kref.DisplayEven();
    }
}
class Mytherd8
{
    public static void main(String arr[]) throws Exception
    {
       Kiran kobj1=new Kiran(5);
       Kiran kobj2=new Kiran(8);

       kobj1.Accept();
       kobj1.Display();

       kobj2.Accept();
       kobj2.Display();

       Demo dobj1=new Demo(kobj1);
       Demo dobj2=new Demo(kobj2);

       Thread t1=new Thread(dobj1);
       Thread t2=new Thread(dobj2);

       t1.start();
       t2.start();

       t1.join();
       t2.join();
    }
}