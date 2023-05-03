class AgeException extends Exception {

   AgeException() {
      System.out.println("You are not eligible for vote!!");
   }
}

public class Exe1 {
   public static void main(String[] args) throws AgeException {
      // int a=5,b=0;

      // try{
      //    System.out.println(a/b);
      // }catch(NullPointerException e)
      // {
      //    System.out.println("can't devide by 0");
      // }catch(Exception e)
      // {
      //    e.printStackTrace();
        
      // }finally{
      //    System.out.println("Finally block");
      // }

      int age=4;

      // if(age<18)
      // {
      //    throw new AgeException();

      // }else{
      //    System.out.println("Eligible for vote!!");

      // }

      try{
         if(age<18)
         {  
            throw new AgeException();
         }
      }catch(AgeException e)
      {
         System.out.println("Handled!!");
      }



   }
}
