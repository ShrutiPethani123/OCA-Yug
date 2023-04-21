class Test{


    int x=34;
    Test()
    {
        System.out.println("Test class Default Constructor");
    }

    Test(int c)
    {
        System.out.println("Test class Pera. constuctor");
    }

    void result()
    {
        System.out.println("Result!!");
    }
}

class Student extends Test{

    int id;
    Student()
    {
        // super();
        super(5);
        System.out.println("Student class Default Constructor");
        // super(4);
    }

    Student(int s)
    {
        id=s;
        System.out.println("Student class Pera. constuctor");
    }

    void display()
    {
        System.out.println(super.x);
        System.out.println(x);
        super.result();
        result();
    }

}



public class SuperKeyword {
    public static void main(String[] args) {
        
        // Student st = new Student();

        Student s1 = new Student();
        s1.display();

    }
}
