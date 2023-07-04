public class Patterns {
    public static void main(String args[]){
        //solid rectangle
        for(int i=1;i<=4;i++){
            for (int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
           //hollow rectangle
         for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || j==1 || i==4 || j==5 ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
         }  
         //half pyramid
         for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
         }
        //inverted half pyramid
         for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
         }
         //     *
         //    **
         //   ***
         //  ****
         // *****

         for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
         }
         //half pyramid with numbers
         for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
         }
         //inverted half pyramid with numbers
         for(int i=5;i<=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
    }

    //floyd's triangle
    int num=1;
    for(int i=1;i<=5;i++){
        for(int j=1;j<1;j++){
            System.out.print(num +" ");
            num++;
        }
    }
    //0-1 triangle
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
        int sum=i+j;
        if (sum%2==0){
            System.out.print("1 ");
        }
        else {
            System.out.print("0 ");
        }
    }
    System.out.println();
    }
    //butterfly pattern
    int n=4;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        int space=2*(n-i);
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++) {

               System.out.print("*");

           }
        System.out.println();
    }
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        int space=2*(n-i);
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //solid rombhus
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
        //number pyramid
        int k=5;
        for(int i=1;i<=k;i++){
            for(int j=1;j<=k-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        //palindromic pattern
          for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
          }
          //diamond pattern

       for(int i=1; i<=n; i++) {
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
       for(int i=n; i>=1; i--) {
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
}
}
