 class Pen{
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }
    public void printColor() {
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

  //constructor is a special function which is used to initialize the object of a class. It has the same name as the class and it does not have any return type. It is automatically called when an object of a class is created.

    Student(Student s2){
    this.name = s2.name;
    this.age = s2.age;
    }
   Student(){ //copy constructor

    }
//polymorphism is the ability of an object to take on many forms. 
// The most common use of polymorphism in OOPs is when a parent class reference is used to refer to a child class object.
//Compile time polymorphism is also known as static polymorphism. 
// It is achieved by method overloading and operator overloading. 
// In method overloading, multiple methods have the same name but different parameters.
// The method to be called is determined at compile time based on the method signature.
public void printInfo(String age){
    System.out.println("Age: " + age);
}
public void printInfo(int age){
    System.out.println("Age: " + age);
}
public void printInfo(String name, int age){
    System.out.println("Name: " + name + " Age: " + age);
   
}
}
public class oops {
    public static void main(String args[]) {    
        // Pen pen1 = new Pen();
        // pen1.color = "Blue";
        // pen1.type = "Gel";
        // pen1.write();
    
        // Pen pen2=new Pen();
        // pen2.color = "Black";
        // pen2.type = "Ballpoint";
        //  pen1.printColor();
        //  pen2.printColor();
        Student s1 = new Student();
        s1.name = "Virat";
        s1.age = 22;
        s1.printInfo();

        Student s2 = new Student(s1); //copy constructor
        s2.printInfo();
        s1.printInfo(s1.name,s1.age);
     }}