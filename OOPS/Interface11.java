/*

Interface : pure abstract class

methods: public abstrct
variables: public static final



I
| implements
C


C
| extends
C

I
| extends
I 


-> multipal inheritance

    A   B
    \   /
      C
 */

interface A{

    int a=89;
    void disp();
}

interface C extends A {

    void print();
    
}

class B implements C{

    public void disp()
    {
        System.out.println("Hello");
    }

    public void print()
    {
        System.out.println("Print....");
    }
}


public class Interface11 {
    public static void main(String[] args) {
    
        B obj = new B();
        System.out.println(obj.a);
        obj.disp();
        obj.print();
    }
}
