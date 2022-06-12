import java.lang.*;
import java.util.*;

class Array3
{
    public static void main(String a[])
    {
        int i=0,j=0;

        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter number of elment of row: ");
        int size1=sobj.nextInt();

        System.out.println("Enter number of column: ");
        int size2=sobj.nextInt();
        int arr[][]=new int[size1][size2];

        System.out.println("Enter your element of array");

        for(i=0;i<arr.length;i++)
        {
            for (j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sobj.nextInt();
            }
        }
        System.out.println("Element of array");

        for(i=0;i<arr.length;i++)
        {
            for (j=0;j<arr[i].length;j++)
            {
                System.out.println(arr[i][j] );
            }
            System.out.println("");

        }
    }
}