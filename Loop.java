/*

types of loop:

1. Entry conrol - for , while
2. Exit control - do while

 */



public class Loop {
    public static void main(String[] args) {
        
        for(int i=1;i<=10;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        int j=1;
        while(j<=10)
        {
            System.out.print(j+ " ");
            j++;
        }
        System.out.println();

        int k=1;
        do
        {
            System.out.print(k+ " ");
            k++;
        }
        while(k>=5);

        int i=3;
        for(;i<5;)
        {
            System.out.println("royal");
            i++;
        }
    }
}
