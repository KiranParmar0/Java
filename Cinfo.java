import java.lang.*;
class Demo
{}
class Cinfo
{
    public static void main(String a[])
    {
        Demo obj=new Demo();
        Class cref=obj.getClass();

        System.out.println("Class name of obj is: "+cref.getName());

        String str="Kiran";
        Class cref1=str.getClass();
        System.out.println("Class name of str is: "+cref1.getName());
    }
}