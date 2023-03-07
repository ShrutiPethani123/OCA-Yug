/*
Data Types:

boolean - nextBoolean()
byte - nextByte()
short-  nextShort()
int  - nextInt()
long - nextLong()
float -nextFloat()
double - nextDouble()
char -
String - nextLine() , next()


 */

import java.util.Scanner;
public class DataType {
    
    public static void main(String []ar)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();

        float f1 =45.56F;// f , F
        System.out.println(f1);

        // long d = sc.nextLong();
        // System.out.println(d);

        long d = 546464645454644L; // l or L

        sc.nextLine();
        System.out.println("Enter name: ");
        String name= sc.nextLine();
        System.out.println(name);

        char ch = sc.next().charAt(0);
        System.out.println(ch);
    }
}
