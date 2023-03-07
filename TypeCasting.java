/*
Type casting:

1. Implicit (byte->short->int->long->float->double)
2. Explicit (double->float->long->int->short->byte)


 */
//


public class TypeCasting {
 
    public static void main(String[] args) {
        
        int a=56;
        long d=a;
        System.out.println(d);

        int b= 45;
        short s =(short)b;
        System.out.println(b);


        long l = 534534643645645l;
        float f = l;
        System.out.println(f);

        double g = 462356.457437;
        float f1 = (float)g;
        System.out.println(f1);



    }
}
