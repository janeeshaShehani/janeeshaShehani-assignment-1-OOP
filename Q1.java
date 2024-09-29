import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

            Scanner x = new Scanner(System.in);
            System.out.print("Enter word :  ");
            String word = x.nextLine();
            int len = word.length();
            System.out.println("word length : " + len);
            int i = len % 2;
            int j = (len / 2);

            if (i == 1) {
                System.out.println("Middle character is " + word.charAt(j));
            }

            else{
                System.out.println("your entered word has even number characters");
            }
        }
    }