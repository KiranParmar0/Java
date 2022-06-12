import java.lang.*;

class Array1
{
    public static void main(String a[])
    {
        int iCnt=0;
        int arr[]=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        System.out.println("Size of Array is :"+arr.length);
        //length is property for array in java
      //  System.out.println("Element of array:"+arr);

        System.out.println("Data by for loop Array is :");

        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            System.out.println(arr[iCnt]);
        }
        iCnt=0;
        System.out.println("Data by while loop Array is :");
        while(iCnt<arr.length)
        {
            System.out.println(arr[iCnt]);
            iCnt++;

        }
        System.out.println("Data for each loop Array is :");
        for(int no:arr)
        {
            System.out.println(no);
        }
    }
}