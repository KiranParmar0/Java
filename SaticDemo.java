import java.lang.*;

class Demo
{
    public int i,j;
    public static int k;

    static
    {
        System.out.println("Inside Static block");
        k=11;
    }

    public Demo()
    {
        this.i=0;
        this.j=0;
        System.out.println("inside the counstrction");
    }

    public void fun()
    {
        System.out.println("inside the fun");
    }

    public static void gun()
    {
        System.out.println("Inside the static gun");
    }
}

class StaticDemo
{
    public static void main(String arr[])
    {
       Demo.gun();
       Demo obj;
       obj=new Demo();

    }
}