

/**
 *
 * @author Angel
 */
import java.text.DecimalFormat;
// add rectangle to its own file and it will complie correctly
public class Excercise_09_1 {
public static void main(String[] args) {


        Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle(4,40);
        rectangles[1] = new Rectangle(3.5, 35.9);

        for (int i = 0; i < 2; i++){
            System.out.println("Rectangle " + (i+1) +":");
            System.out.print("Area = " + rectangles[i].getArea ());
            System.out.println(" Perimeter = " +  rectangles[i].getPerimeter() +"\n");
        }
    }
}

public class Rectangle {

    private double width;
    private double height;

    public Rectangle () {
        this.width = 1.0;
        this.height = 1.0;
    }
    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return this.width * 2 + this.height * 2;
    }

