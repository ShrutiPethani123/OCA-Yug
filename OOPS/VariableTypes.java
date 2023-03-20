/*


variable types:

instance variable
static variable
local variable


data types  default value

boolean        false
byte           0
short          0
int            0
long           0
float          0.0
double         0.0
char           /u
String          null


 */

public class VariableTypes {

    // instance
    int a = 45;
    int b;

    void print()
    {
        int f = 45; // local
    }
    public static void main(String[] args) {

        int c; // local variable
        c = 50;
        int a = 100;
        VariableTypes obj = new VariableTypes();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(c);
        System.out.println(a);
    }
}
/*
 * Make one class student include data members like name , age , roll_no ,
 * isActive ,gender , addreess , contact_no
 * and also make two function like getData() and setdata()
 * 
 */