import java.lang.*;
import java.util.*;

class Demo
{
    public int Arr[];
    public Demo(int size)
    {
        System.out.println("Allocate the resource in Constructor");
        this.Arr=new int[size];
    }
    protected void finalize()
    {
        System.out.println("Deallocate the resource in Constructor");
        this.Arr=null;
    }
}
class GC
{
    public static void main(String arr[])
    {
        Demo dobj=new Demo(10);
        dobj=null;
        System.gc();
        System.out.println("End of main");
    }
}

