public class ShapeCalculator {

    public static double rectangleArea (Rectangle rectangle){
        double result = rectangle.getSideA()*rectangle.getSideB();
        return result;
    }

    public static double rectanglePerimeter (Rectangle rectangle){
        double result = 2*rectangle.getSideA()+2*rectangle.getSideB();
        return result;
    }

    public static double circleArea (Circle circle){
        double result = Circle.getPi()*Math.pow(circle.getRadius(),2);
        return result;
    }

    public static double circlePerimeter (Circle circle){
        double result = 2*circle.getRadius()*Circle.getPi();
        return result;
    }
}
