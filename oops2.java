// abstract class Animal{
//    abstract void walk();
// }
// class Horse extends Animal{
//    void walk(){
//       System.out.println("walks on 4 legs");
//    }
// }
// class Chicken extends Animal{
//    void walk(){
//       System.out.println("walks on 2 legs");
//    }
// }

// public class oops2 {
//    public static void main(String[] args) {
//      Horse horse=new Horse();
//      horse.walk(); 
//    //   Animal animal=new Animal(); // This line will give error because we cannot create object of abstract class
//    //   animal.walk();              //animal ko hum bna hi ni sakte as its abstract concept   
//    }
// }
interface Animal{
   void walk();
   // Animal(){ // This line will give error because we cannot create constructor of interface
   // }
   // void eat(){ // This line will give error because we cannot create method with body in interface,we can do in subclass
   // }
}
interface herbivore{
   void eatGrass();
}
class Horse implements Animal, herbivore{ 
   public void walk(){
      System.out.println("walks on 4 legs");
   }
   public void eatGrass(){
      System.out.println("eats grass");
   }
}

public class oops2 {
   public static void main(String[] args) {
     Horse horse=new Horse();
     horse.walk(); 
   //   Animal animal=new Animal(); // This line will give error because we cannot create object of interface
   //   animal.walk();              //animal ko hum bna hi ni sakte as its abstract concept   
   }
}
