import java.util.Scanner;

public class PrintStringReverseRecursion {
    public static void ReverseString(String str, int index){
        if(index ==0){
            System.out.println(str.charAt(index));
            return;
        }
          System.out.print(str.charAt(index));
        ReverseString(str, index-1);
    }
    public static void main(String args[]){
        
         Scanner sc=new Scanner(System.in);
         String str=sc.next();
          System.out.println("entered string is : "+ str);
          System.out.println("reversed string is : ");
         ReverseString(str, str.length()-1);

    }
    
}
