class pen{
    //variables or data like int, string etc..
    String color;
    String type;

    //methods or functions
    public void printColor(){
        System.out.println("The color is : "+this.color);
    }

    public void printType(){
        System.out.println("the type is : "+this.type);
    }
    //non parametirised constructor
    pen(){
        System.out.println("Constructor for the class pen is called");
    }

}
//another class
class Student{
    //variables or data
    String name;
    int age;

    //functions or methods
    public void printInfo(){
        System.out.println("Student's name is:"+this.name);
        System.out.println("Student's age is:"+this.age);
    }

    //parametirised constructor containing parameters name and age
    Student(String name, int age){
        // System.out.println("Constructor for the class Student is called");
        //parimeters, note : this.name is a object and name is the variable
        this.name = name;
        this.age = age;
    }

}

//another class
class Computer{
    String type;
    String gpu;
    int price;

    public void info(){
        System.out.println("computer: "+this.type);
        System.out.println("gpu: "+this.gpu);
        System.out.println("price: "+this.price);
    }
    //copy constructor
    Computer(Computer computer2){
        this.type = computer2.type;
        this.gpu = computer2.gpu;
        this.price = computer2.price;

    }
    Computer(){
        
    }
}
//public class
public class exam4{
    public static void main(String args[]){
        //making object for the class pen
        pen pen1 = new pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        pen pen2 = new pen();
        pen2.color = "Black";
        pen2.type = "Ball";

        //calling the function on the class pen
        pen1.printColor();
        pen2.printColor();

        pen1.printType();
        pen2.printType();

        //making oblect for the class Student and passing the values for the variables which are present in the
        Student student = new Student("Abhay", 20);
        //Student() in this statement is a function a special type of function which is also called a constructor the work of it is to construct the object of the class
        // student.name = "Abhay";
        // student.age = 20;

        //calling the function printInfo which is present on the class Student
        student.printInfo();

        Computer computer1 = new Computer();
        computer1.type = "Windows";
        computer1.gpu = "RTX 4060";
        computer1.price = 79000;

        Computer computer2 = new Computer(computer1);
        computer2.info();


    }
}