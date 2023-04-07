/*

polymorphism : many Forms

2 types:

1. Method overloading
    -> Method name is same but number of argument is different
    -> Method name is same but data type of argument is different


2. Method overriding

    -> Parent and child have same method name.



 */

class A{

    void add()
    {
            System.out.println("Add Method");
    }

    void add(int x , int y)
    {
        System.out.println("Add Two Numbers: "+ (x+y));
        
    }

    void add(float a , float b)
    {
        System.out.println("Add Two Float Numbers: "+ (a+b));
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        
        A obj = new A();
        obj.add();
        obj.add(3,4);
        obj.add(3.4f,5.6f);
    }
}
