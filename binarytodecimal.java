public class binarytodecimal {
    // n=101

    public static void bitodec(int n){
        int pow=0;
        int dec=0;

        while (n>0) {
            int lastdigit=n%10;
            dec=dec+(lastdigit* (int)Math.pow(2, pow));
            pow++;
            n=n/10;

            
        }
        System.out.println("decimal no is "+ dec);

    }
    
    
    public static void main(String[] args) {

        bitodec(111);
        
    }
    
}
