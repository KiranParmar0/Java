import java.lang.*;
import java.util.*;

class Array3
{
    public static void main(String a[])
    {
        int i=0;j=0;
        int arr[][]=new int[3][];
        arr[0]= new int[3];
        arr[1]= new int[5];
        arr[2]= new int[2];

        for(i=0<arr.length;i++)
        {
            for(j=0;j<arr[i];j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}