/*
    final: class , method , variables

    -> we can't inherite final class
    -> we can't override final method
    -> we can't change final variable value



 */

class A{


    int x=45;
    final int y=70;
    int z;
    final int t;

    A(int n)
    {
        t=n;
    }


    public void print()
    {
        x=50;
        y=90;
    }

   void display()
    {

    }



}

class B extends A{

    public void print()
    {

    }

    void display()
    {

    }
}



public class FinalKeyword {
    
    public static void main(String[] args) {
        

        A obj = new A(6);
    }
}
