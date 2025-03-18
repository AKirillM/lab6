package blogic;

public class FFHelp {
    public static double triangleArea(double a, double b, double c){
        double p = (a + b + c) / 2;
        return Math.sqrt(p *(p-a) * (p-b) * (p-c));
    }

    public static double parallelogramArea(double a, double b, int angle){
        return a*b*Math.sin(angle * Math.PI / 100 );
    }
}
