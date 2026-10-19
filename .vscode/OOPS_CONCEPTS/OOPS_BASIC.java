
class Student{
    String name;
    int age ;
// function formation for printing info from the main class
 public void PrintInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
 }
 // parameterized and non -parameterized constructor
/*  Student(String name, int age)  {
    System.out.println("constructor called");
    this.name = name;
    this.age = age;
 }*/
 Student (Student s2){
    this.name=s2.name;
    this.age=s2.age;
 }
 Student(){
    
 }
}

public class OOPS_BASIC {
    public static void main(String args[]){
        Student s1 = new Student();
       s1.name="akchat gupta";
       s1.age=22;
      
       Student s2 = new Student(s1);
        s2.PrintInfo();

    }
}
