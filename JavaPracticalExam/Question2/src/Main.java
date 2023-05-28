 class Shape{
    public void calculateArea(){
        System.out.println("Calculating area of a generic shape");
    }
}

class Rectangle extends Shape{
     int length;
     int width;

//Create constructors
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        int area = length * width;
        System.out.println("Area of rectangle: " + area);
    }
}

 class Circle extends Shape {
     double radius;

//     Create constructors
     public Circle(double radius){
         this.radius = radius;
     }

     @Override
     public void calculateArea() {
         double area = Math.PI * radius * radius;
         System.out.println("Area of Circle: " + area);
     }
 }

public class Main {
    public static void main(String[] args) {
    Shape Rectangle = new Rectangle(25,5);
    Rectangle.calculateArea();

    Shape Circle = new Circle(3.5);
    Circle.calculateArea();

    }
}