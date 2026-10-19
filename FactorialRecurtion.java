import java.util.*;

public class FactorialRecurtion {
    public static int calFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1=calFactorial(n-1);
        int fact_n=n*fact_nm1;
        return fact_n;
    }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int ans=calFactorial(n);
        System.out.println(ans);
    
     }
    }

