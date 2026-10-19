class area {
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends area{
    public void area(int len,int h){
        System.out.println(1/2*len*h);
    }
    class circle extends area{
        public void area(int r){
            System.out.println(3.14*r*r);
        }
    }
}
public class Inheritence {
    public static void main (String args[]){
   
    }
    
}
