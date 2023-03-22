class Test{

    double a;
    double b;

    Test(int a , int b)
    {
        this.a = a;
        this.b=b;
        System.out.println("Int constructor called!!");

    }

    Test(float a , float b)
    {
        this.a = a;
        this.b=b;
        System.out.println("Float constructor called!!");

    }
    Test(double a , double b)
    {
        this.a = a;
        this.b=b;
        System.out.println("Double constructor called!!");

    }
}

public class Constructor2{

    public static void main(String[] args) {
        
        Test t1 = new Test(2,3);
        System.out.println("a= "+ t1.a+ " b= " +t1.b);

        Test t2 = new Test(2.5f,5.78f);
        System.out.println("a= "+ t2.a+ " b= " +t2.b);
    }
}
/*


int
float
double
long

 */
