public class ShapeTest {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];
        shape[0] = new Rectangle(4, 7);
        shape[1] = new Rectangle(6.5, 9.34);
        shape[2] = new Circle(10);


        double shapeArea=0;
        double shapePerimeter=0;

        for (int i = 0; i < shape.length; i++) {
            if (shape[i] instanceof Rectangle) {
                shapeArea = ShapeCalculator.rectangleArea((Rectangle) shape[i]);
                shapePerimeter = ShapeCalculator.rectanglePerimeter(((Rectangle) shape[i]));
            } else if (shape[i] instanceof Circle) {
                shapeArea = ShapeCalculator.circleArea((Circle) shape[i]);
                shapePerimeter=  ShapeCalculator.circlePerimeter((Circle) shape[i]);
            }
            System.out.println("Obwód to: "+shapePerimeter+"; pole to: "+shapeArea);
        }
    }
}
