public class findbionomialcofficient {


    public static int Factorial(int n){

        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static int binocoff(int n, int r){
        int nfact= Factorial(n);
        int rfact=Factorial(r);
        int nmrfact=Factorial(n-r);

        int binocoff=nfact/(rfact*nmrfact);
        return binocoff;
    }


    public static void main(String[] args) {

        System.out.println(binocoff(5, 2));
        
    }
}
