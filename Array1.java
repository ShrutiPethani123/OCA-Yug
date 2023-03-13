import java.util.Scanner;

/*
 
Array:- collection of elements that have same data type.

a - 4 5 9 6 3

a[0] = 4

-> index start with 0
-> index end with size-1






 */


public class Array1{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // int[] a = {4,5,9,6,3};
        // int a[]={1,2,3,4,5};

        // for(int i=0;i<a.length;i++) 
        // {
        //     System.out.print(a[i]+" ");
        // }

        // int b[]=new int[5];
        int []b=new int[5];

        System.out.println("Enter elements: ");
        for(int i=0;i<b.length;i++)
        {
            System.out.print("\nb[" +i+"]=");
            b[i]=sc.nextInt();
        }

        // for
        System.out.println("Array:");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }

        // for each
        System.out.println();
        for(int x:b)
        {
            System.out.print(x+" ");
        }
    }
}