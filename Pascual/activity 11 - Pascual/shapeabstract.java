package company;

public class shapeabstract {
public void run()
{
  Shape circle = new Circle(10);
  System.out.println("Name:"+ circle.getname());
  System.out.println("Area:"+circle.getArea());
  System.out.println("Perimeter:"+circle.getPerimeter());
  System.out.println();
  
  Shape square = new Square(6);
  System.out.println("Name:"+square.getname());
  System.out.println("Area:"+square.getArea());
  System.out.println("Perimeter:"+square.getPermeter());
  System.out.println();
}
}
