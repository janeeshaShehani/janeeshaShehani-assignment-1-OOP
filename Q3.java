import java.util.Scanner;
public class Q3 {

    public static void main(String[] args){

        Scanner x = new Scanner(System.in);
        System.out.print("Enter length from centimetres : ");
        float length = x.nextFloat();

        //convert to inch(1 inch = 2.54cm)
        double I = length / 2.54;

        //convert to feet
        int Feet = (int)I / 12;

        //get the remainder for get inch
        double inch = I%12;

        System.out.println("length = " +Feet +"feet" +" " + String.format("%.2f",inch) +"inches");



    }
}
