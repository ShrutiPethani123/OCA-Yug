/*

constructor: 

-> use: intialize the value of instance variable
-> name is same as class name
-> no return type of constuctor
-> when objects are created constructor will call automatically

Types of Constructor:

1. Default constructor
2. perametrized constructor
3. copy constructor



 */



class Test{

    int a;
    int b;
    Test()
    {
        a=50;
        b=21;
        System.out.println("Default Constructor called!!");
    }

    Test(int c , int d)
    {
        a=c;
        b=d;
        System.out.println("Perametrized Constructor");
    }

    Test(Test t)
    {
        this.a=t.a;
        this.b=t.b;

    }

}

public class Constructor{

    public static void main(String[] args) {
        
        Test obj = new Test();
        System.out.println(obj.a);
        System.out.println(obj.b);

        Test obj2 = new Test(3,4);
        System.out.println(obj2.a);
        System.out.println(obj2.b);

        obj.a=56;
        System.out.println(obj2.a);

        Test obj3 = new Test(obj2);
        System.out.println(obj3.a);
        System.out.println(obj3.b);
    




    }
}