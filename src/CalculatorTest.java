public class CalculatorTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5,8);
        double obwodProstokata = ShapeCalculator.rectanglePerimeter(rectangle1);
        double poleProstokata = ShapeCalculator.rectangleArea(rectangle1);

        Circle circle1 = new Circle(10);
        double obowodKola = ShapeCalculator.circlePerimeter(circle1);
        double poleKola = ShapeCalculator.circleArea(circle1);

        System.out.println("Pole prostokąta o bokach "+rectangle1.getSideA()+", "+rectangle1.getSideB()+" wynosi "+poleProstokata);
        System.out.println("Obwod prostokąta o bokach "+rectangle1.getSideA()+", "+rectangle1.getSideB()+" wynosi "+obwodProstokata);
        System.out.println("Pole trojkata o promieniu "+circle1.getRadius()+" wynosi "+poleKola);
        System.out.println("Obwod trojkata o promieniu "+circle1.getRadius()+" wynosi "+obowodKola);
    }
}
