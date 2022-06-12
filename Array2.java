import java.lang.*;
import java.util.*;

class Array2
{
    public static void main(String a[])
    {
        int iCnt=0;

        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter number of element: ");
        int size=sobj.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter your element of array");

        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            arr[iCnt]=sobj.nextInt();
        }
        System.out.println("Element of array");
        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
           System.out.println(arr[iCnt]);
        }
    }
}