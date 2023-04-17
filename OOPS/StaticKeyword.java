/*

static:  class , methods , variable , block

-> outer class can not be static.
-> Inner class can be static.
-> we can't use non static variable in static method.

 */
class Test {
    static int a=3;
    int b=45;


   static  class Test2{

    }

    Test() {
        System.out.println(a++);
    }

    static void print() {

        int c=34;
        System.out.println(a);
        System.out.println(c);
    }

    void display()
    {
        System.out.println(a+ " " + b);

    }

    {
        System.out.println("Instance block");
    }

    static{
        System.out.println("Static block");
    }
}

public class StaticKeyword {
    public static void main(String[] args) {

        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        System.out.println(t1.a);
        t1.display();
        t1.print();

    }
}
