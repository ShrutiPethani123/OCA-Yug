/*


pops
oops

class : 
object: 


 */
class Car{

    // data memeber
    int wheel = 4;
    String color;

    //member function
    void run()
    {
        System.out.println("Car Running!!");
    }
    
}




public class ClassObj{

    public static void main(String[] args) {
        
        Car bmw = new Car();
        //className objectName = new classname()
        System.out.println(bmw.wheel);
        bmw.run();

        Car farari = new Car();
        System.out.println(farari.wheel);
        farari.run();

        bmw.color="red";
        System.out.println(farari.color);
        System.out.println(bmw.color);

    }
}