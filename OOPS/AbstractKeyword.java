/*

abstract: class  , method

-> we can't create object of abstract class
-> Abstract methods do not specify a body
-> must overide the abstract method
-> we can't write abstract method in non abstract class

 */

abstract class Exam{

    void display()
    {
        System.out.println("Non abstract Method!!");
    }

    abstract void print();
    
}

class Test extends Exam{

    void print()
    {
        System.out.println("Overrided abstract method");
    }
}


public class AbstractKeyword {
    public static void main(String[] args) {
        
        Test t = new Test();
        t.display();
        t.print();
    }

}
