import java.util.Scanner;
public class HCF{

    public static void main(String[] args) {
        
        int n,m,hcf=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        n = sc.nextInt();
        System.out.println("Enter a no: ");
        m = sc.nextInt();

        int min=n<m?n:m;

        for(int i=1;i<=min;i++)
        {
            if(m%i==0 && n%i==0)
            {
                hcf=i;
            }
        }

        System.out.println("Hcf is "+hcf);
    }
}