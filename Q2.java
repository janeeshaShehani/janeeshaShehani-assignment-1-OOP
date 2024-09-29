import java.util.Scanner;
public class Q2 {

    public static void main (String[] args){

        Scanner F = new Scanner(System.in);
        Scanner M = new Scanner(System.in);
        Scanner L = new Scanner(System.in);

        System.out.print("Enter your first name : ");
        String Fname= F.nextLine();

        System.out.print("Enter your middle name : ");
        String Mname= M.nextLine();

        System.out.print("Enter your last name : ");
        String Lname= L.nextLine();

        System.out.println(Lname +", "+ Fname +" "+ Mname.charAt(0));


    }

}
