import java.util.Scanner;
public class LCM {
    
    public static void main(String[] args) {
        
        int n,m,lcm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        n = sc.nextInt();
        System.out.println("Enter a no: ");
        m = sc.nextInt();

        int max=n>m?n:m;

        int i=max;
        while(true)
        {
            if(i%n==0 && i%m==0)
            {
                lcm=i;
                break;
            }
            i+=max;
        }

        System.out.println("LCM: "+ lcm);

        
    }
}

/*
 
4 - 4 8 12 16 20 24 .. 
5 - 5 10 15 20 25 ...
 
 */