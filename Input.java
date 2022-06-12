import java.util.*;

class Input
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter your Name:");
        String name =sobj.nextLine();

        System.out.println("Please enter your Age:");
        int age =sobj.nextInt();

        System.out.println("Please enter your Percentage:");
        float percentage =sobj.nextFloat();

        System.out.println("Your name is :"+name);
        System.out.println("Your Age is :"+age);
        System.out.println("Your Percentage is :"+percentage);
    }
}