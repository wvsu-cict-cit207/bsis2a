abstract class Shape{
    abstract String getName();
    abstract double getArea(int x);
}
class Circle extends Shape{
    String getName(){
        return ("Circle");

    }
    double getArea(int radius){
        return (3.14*radius*radius);
    }
}
class Square extends Shape{
    String getName(){
        return ("Square");
    }
    double getArea(int side){
        return(side*side);
    }
}
public class Act11_Shape {
    public static void main(String[] args) {
        Circle obj1 = new Circle();
        String name;
        double area;
        name= obj1.getName();
        area= obj1.getArea(4);
        System.out.println("Area of the " + name + " is  " + area);
        Square obj2 = new Square();
        name = obj2.getName();
        area=obj2.getArea(5);
        System.out.println("Area of the "+ name + " is " + area);
    }
}
