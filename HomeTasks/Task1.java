package HomeTasks;

public class Task1 {
    public static void main (String[] args){
    int num1 = 1;
    int num2 = 2;
    double result1 = circleArea(num1);
    double result2 = circleLength(num2);
    System.out.println("Circle area is: " + result1);
    System.out.println("Circle length is: " + result2);
}
    public static double circleArea(double num1){
        double result = (num1*num1)*Math.PI;
        return result;
    }
    public static double circleLength(double num1){
        double result = 2*num1*Math.PI;
        return result;
    }
}

