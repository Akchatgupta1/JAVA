public class StringAndBuilder {
    public static void main(String args[]){
        StringBuilder sb= new StringBuilder("hello");
        //inserting any character
            sb.insert(0, "hey");
            System.out.println(sb);
            //deleting any char
            sb.delete(0,3);
            System.out.println(sb);
            //adding more to a string
            sb.append("w");
            sb.append("o");
            sb.append("r");
            sb.append("l");
            sb.append("d");
            System.out.println(sb);
            

    }

}
