import java.lang.*;

class Mytherd1
{
    public static void main(String a[])
    {
        System.out.println("Inside the main");

        Thread tobj=Thread.currentThread();

        System.out.println("Name of current thrad is "+tobj.getName());
    }

}