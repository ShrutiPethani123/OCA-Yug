

class Father{

    public  void car()
    {
        System.out.println("Father car!!!");
    }

    void Office()
    {
        System.out.println("Father Office!!");
    }
}

class Son extends Father{

    public void car()
    {
        System.out.println("Son car!!");
    }

    public void bike()
    {
        System.out.println("Son Bike");
    }

}

// private < default < protected <public 




public class Polymorphism2 {
    public static void main(String[] args) {
        
        // child ref child object

        Son s1 = new Son();
        s1.car();
        s1.bike();
        s1.Office();

        System.out.println("---------------------------------");

        // Parent ref Parent object

        Father f1 = new Father();
        f1.car();
        // f1.bike();
        f1.Office();


        System.out.println("---------------------------------");

        // Child ref Parent object

        // Son s2 = new Father(); // invalid

        System.out.println("---------------------------------");

        // Parent ref Child object

        Father f2 = new Son();
        f2.car();
        // f2.bike(); - invalid
        f2.Office();

        

    }
}
