/*

Inheritance:

parent
|
child

use: code reusability

types:

1. single level
2. multi level
3. multiple (not supportd java)
4. hyracrhical
5. hybrid


1. single level

    A
    |
    B

2. multi level

    A
    |
    B
    |
    C

3. multiple

    A   B
    \   /
      C

      -> A: add()
         B : add()

         c obj -> obj.add()
         -> ambiguty 

4. Hyrarchical

     A
    / \
    B  C

5. hybrid

     A
    / \
    B  C
    |
    D
 */
class A{

    void print()
    {
        System.out.println("Print A....");
    }
}
class B extends A{

    void display()
    {
        System.out.println("Print B....");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        
        A obj = new A();
        obj.print();
        // obj.display();

        B b1 = new B();
        b1.print();
        b1.display();
    }
}
