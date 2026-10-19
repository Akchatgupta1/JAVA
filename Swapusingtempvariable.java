public class Swapusingtempvariable {

    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping values are "+a+b);
    }
    public static void main(String[] args) {
        int a=5, b=10;
        System.out.println("before swapping values are "+  a+ b);
        swap( a, b);
    }
    
}
