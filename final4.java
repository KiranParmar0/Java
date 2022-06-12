import java.lang.*;

final class Base
{
    public void fun()
    {
        System.out.println("Base fun");
    }
}

/*class Derived extends Base
{
} Not Allowed */

class Derived
{
    public Base bobj=new Base(); // Composition
    public void gun()
    {
        System.out.println("Derived gun");
    }
}
class final4
{
    public static void main(String arr[])
    {
        Derived dobj=new Derived();
        dobj.bobj.fun();
        dobj.gun();
    }
}

/*
java.lang

final class system
{
    public static PrintStream out = new PrintStream();
}
class PrintStream
{
    public void println(String str)
    {
    }
}
System.out.println("Hello..");
*/