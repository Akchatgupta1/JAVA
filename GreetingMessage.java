import java.util.Scanner;

public class GreetingMessage {
    public static void main(String args[]){
     System.out.println("press 1 for english \npress 2 for hindi \npress 3 for spanish \npress 4 for other language");

     try (Scanner sc = new Scanner(System.in)) {
        int a=sc.nextInt();
         switch(a){
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("namaste");
            break;
            case 3: System.out.println("hola");
            break;
            case 4: System.out.println("bonjour");
            break;
            default: System.out.println("invalid entry");

         }
    }
     
    }
    
}
