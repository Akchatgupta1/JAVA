import java.util.*;
public class FUNCRIONS2 {


    //   public static void calculatesum(int a, int b){
    //    Scanner sc=new Scanner (System.in);
    //    int a=sc.nextInt();
    //    int b=sc.nextInt();
    //   int sum=a+b;
    //    System.out.println(sum);

    //}

    public static void calculatesum(int a, int b){//parameters or formal parameter
        
        int sum=a+b;
        System.out.println(sum);

    }
    public static void main(String[] args) {
        
        // calculatesum();
        
        
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calculatesum(a, b);// arguments or actual parameter
        
    }
    
}
