class Test{

    Test()
    {
        System.out.println("Test class Default Constructor");
    }

    Test(int c)
    {
        System.out.println("Test class Pera. constuctor");
    }
}

class Student extends Test{

    int id;
    Student()
    {
        // super();
        super(5);super(4);
        System.out.println("Student class Default Constructor");
        // super(4);
    }

    Student(int s)
    {
        id=s;
        System.out.println("Student class Pera. constuctor");
    }

}



public class SuperKeyword {
    public static void main(String[] args) {
        
        // Student st = new Student();

        Student s1 = new Student();

    }
}
