import java.io.*;

class String1
{
    public static void main(String a[])
    {
        String str1="Hello";
        String str2="Hello";
        String str3=new String("Hello");

        if(str1==str3)
        {
            System.out.println("Strings are same");
        }
        else
        {
            System.out.println("Strings are Different");
        }
        if(str1.equals(str3))
        {
            System.out.println("Strings are same");
        }
        else
        {
            System.out.println("Strings are Different");
        }
    }
}