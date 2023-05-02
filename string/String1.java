

/*

String: sequence of character


char ch='A'

String Declaration:

1. using literals
2. using new keyword


 */

public class String1 {
    public static void main(String[] args) {
        
        String str="yug"; // using literals
        System.out.println(str);

        String str1 = new String("Patel");
        System.out.println(str1);

        
        System.out.println(str.length());
        System.out.println(str.concat("java"));
        System.out.println(str);

        // String objects are immutable

        str = str.concat("java");
        System.out.println(str);

        str="Royal Technosoft";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(5));
        System.out.println(str.contains("al"));
        System.out.println(str);
        System.out.println(str.substring(1, 4)); // 1 2 3
        System.out.println(str.substring(3));
        System.out.println(str.equals(str1));
        String str2="Royal Technosoft";
        System.out.println(str.equals(str2));
        System.out.println(str==str2);

        String s3 = new String("Royal Technosoft");
        System.out.println(str.equals(s3));
        System.out.println(str==s3);

        System.out.println(str.equals("royal technosoft"));
        System.out.println(str.equalsIgnoreCase("royal Technosoft"));

        System.out.println(str.indexOf("Tech"));
        System.out.println(str.indexOf("o" ,3));
        System.out.println(str.lastIndexOf("soft"));
        System.out.println(str.lastIndexOf("o"));

        System.out.println(str);
        System.out.println(str.startsWith("Royal"));
        System.out.println(str.startsWith("R"));
        System.out.println(str.startsWith("r"));
        System.out.println(str.startsWith("l" , 4));

        System.out.println(str.endsWith(s3));
        System.out.println(str.endsWith("soft"));

        String s4="xyz    ";
        s4.trim();
        System.out.println(s4);

        s4="      x     yz    ";
        s4.trim();
        System.out.println(s4);


        




        
        
    }
}
