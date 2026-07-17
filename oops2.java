public class oops2 {
   
// abstraction
   abstract class Shape {
      abstract void draw();
   }

   // inheritance
   class Circle extends Shape {
      void draw() {
         System.out.println("Drawing Circle");
      }
   }

   class Rectangle extends Shape {
      void draw() {
         System.out.println("Drawing Rectangle");
      }
   }

   public static void main(String[] args) {
      oops2 obj = new oops2();
      Shape circle = obj.new Circle();
      Shape rectangle = obj.new Rectangle();

      circle.draw();
      rectangle.draw();
   }
}
