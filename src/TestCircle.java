/**
 * Created by student on 22.04.2015.
 */
public class TestCircle {        // save as "TestCircle.java"
    public static void main(String[] args) {
        // Declare and allocate an instance of class Circle called c1
        //  with default radius and color
        Circle c1 = new Circle();
        // Use the dot operator to invoke methods of instance c1.
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea()+" а также имеет цвет "+ c1.getColor());

        // Declare and allocate an instance of class circle called c2
        //  with the given radius and default color
        Circle c2 = new Circle(2.0);
        // Use the dot operator to invoke methods of instance c2.
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea() +" а также имеет цвет "+ c2.getColor());

        Circle C3 = new Circle(5.1);
        System.out.println(" Если радиус круга "+ C3.getRadius() + " то его пощадь равна " + C3.getArea() + " а цвет "+ C3.getColor());

        // System.out.println (c1.radius=5.0);


    }
}
