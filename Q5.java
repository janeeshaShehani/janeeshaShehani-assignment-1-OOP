import java.util.Scanner;

class Circle {
    private double radius;
    public Circle(double r){
        this.radius=r;
    }
    public double computeArea(){
        return Math.PI*Math.pow(radius, 2);
    }

    public  double computeCircumference(){
        return 2*Math.PI*radius;       }
}
public class Q5 {


    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter Inner Circle Radius :");
        double ri = x.nextDouble();
        System.out.println("Enter Outer Circle Radius :");
        double ro = x.nextDouble();

        if(ri>ro) {
            System.out.println("Inner radius should be less than Outer radius");
            return;
        }
        Circle c_outer = new Circle(ro);
        Circle c_inner = new Circle(ri);

        double area = c_outer.computeArea()-c_inner.computeArea();
        System.out.println("The area of the circular region is: " + area);  // area of shaded area



        System.out.println("Inner Circle Area: " + String.format("%.4f",c_inner.computeArea()));
        System.out.println("Outer Circle Area: " + String.format("%.4f",c_outer.computeArea()));
        System.out.println("Inner Circle Circumference: " + String.format("%.4f",c_inner.computeCircumference()));
        System.out.println("Outer Circle Circumference: " + String.format("%.4f",c_outer.computeCircumference()));
    }}

