import java.util.*;
public class first_program 
{
    public static void main(String args[])
    {
        /*System.out.println("hello world");
        System.out.println("hiiiii");
        System.out.println("hello world");
        int a=12, b=12, c;
        c=a+b;
        System.out.println("ans is "+c);
        
        if(c<20){
            System.out.println("lesser than 20");
        }
        else {
            System.out.println("greater than 20");
        }
        int i=0,j=0,d=0;
        for(i=0;i<=10;i++){
            for(j=0;j<=i;j++){
            System.out.print("*");
            }
            System.out.println(" ");
        }
        for(d=0;d<=10;d++){
         int e =5*d;
          System.out.println(e);
        }*/

        /*int space=5;
        for(int i=1;i<=5;i++){
            for(int k=1;k<=space;k++ ){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            space--;
        }*/
           
        try (/*for(int i=1;i<=10;i++){
                    for(int j=10;j>=1;j--){
                        System.out.print("*");
                    }
                    System.out.println();
                }*/
        Scanner sc = new Scanner(System.in); 
            int a=sc.nextInt();
              int b=sc.nextInt();
              int sum=a+b;

              System.out.println(sum);
        
    }
}