import java.util.*;

public class PrintNumbersRecursion {
    public static void printNum(int n, int i){
        if(n==i+1){
            return;
        }
        System.out.println(n);
        printNum(n+1, i);
    }
    public static void main (String args[]){
        Scanner sc= new Scanner (System.in);
        int i=sc.nextInt();
        int n=0;
        printNum(n,i);
        
    }
    
}
