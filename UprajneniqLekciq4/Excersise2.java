import java.util.Scanner;
public class Excersise2 {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("Enter your age:");
        int userage = age.nextInt();
        if (userage >= 16){
            System.out.println("You are eligable for work.");
        }
        else {
            System.out.println("You do not meet the required age.");
        }

    }
}
