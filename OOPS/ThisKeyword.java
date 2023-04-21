class Test{

    int c=50;
    Test()
    {
        System.out.println("Default con...");
    }
    Test(int x)
    {
        this();
        // super();
        System.out.println("Per. con...");
        // this();
    }

    void print()
    {
        System.out.println(c);
        System.out.println(this.c);
        this.msg();
        msg();
    }

    void msg()
    {
        System.out.println("message");
    }
}

public class ThisKeyword {
 
    public static void main(String[] args) {
        
        Test t1=new Test(4);
        t1.print();
    }
}
