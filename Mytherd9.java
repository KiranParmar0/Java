import java.lang.*;
import java.util.*;


class Kiran extends Thread
{
    System.out.println("Inside thread:"+Thread.currentThread().getName());
    System.out.println("Inside thread:"+Thread.currentThread().getPriority());
}
class Mytherd9
{
    public static void main(String arr[]) throws Exception
    {
       System.out.println("Main thread: Priority"+Thread.currentThread().getPriority());
       Kiran kobj1=new Kiran();
       Kiran kobj2=new Kiran();

       Thread t1=new Thread(kobj1,"First");
       Thread t2=new Thread(kobj2,"Second");

       t1.start();
       t2.start();

       t1.join();
       t2.join();
    }
}