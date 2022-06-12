import java.lang.*;

class Kiran implements Runnable
{
    public void run()
    {
        System.out.println("Inside thread:"+Thread.currentThread().getName());
    }
}
class Mytherd3
{
    public static void main(String a[])
    {
        Kiran kobj1=new Kiran();
        Thread t1= new Thread(kobj1,"First");

        Kiran kobj2=new Kiran();
        Thread t2= new Thread(kobj2,"Secound");

        t1.start();
        t2.start();
    }
}