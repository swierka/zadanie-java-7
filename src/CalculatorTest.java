import com.sun.org.apache.regexp.internal.RE;

public class CalculatorTest {
    public static void main(String[] args) {

        Shape[] allShapes = new Shape[4];
        allShapes[0] = new Rectangle(5, 8);
        allShapes[1] = new Rectangle(10, 8);
        allShapes[2] = new Circle(10);
        allShapes[3] = new Circle(13.5);

        for (int i = 0; i<allShapes.length;i++)  {
            if (allShapes[i] instanceof Rectangle) {
                double obwodProstokata = ShapeCalculator.rectanglePerimeter(((Rectangle) allShapes[i]));
                double poleProstokata = ShapeCalculator.rectangleArea(((Rectangle) allShapes[i]));
                System.out.println("Pole prostokąta o bokach " + ((Rectangle) allShapes[i]).getSideA() + ", " + ((Rectangle) allShapes[i]).getSideB() + " wynosi " + poleProstokata);
                System.out.println("Obwod prostokąta o bokach " + ((Rectangle) allShapes[i]).getSideA() + ", " + ((Rectangle) allShapes[i]).getSideB() + " wynosi " + obwodProstokata);
            } else if (allShapes[i] instanceof Circle) {
                double obwodKola = ShapeCalculator.circlePerimeter(((Circle) allShapes[i]));
                double poleKola = ShapeCalculator.circleArea(((Circle) allShapes[i]));
                System.out.println("Pole trojkata o promieniu " + ((Circle) allShapes[i]).getRadius() + " wynosi " + poleKola);
                System.out.println("Obwod trojkata o promieniu " + ((Circle) allShapes[i]).getRadius() + " wynosi " + obwodKola);
            } else {
                System.out.println("Brak obliczen");
            }
        }
    }
}