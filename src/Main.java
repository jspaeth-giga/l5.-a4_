import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int userAge;

        System.out.println("How old are you?");
        userAge = scan.nextInt();

        if(userAge >= 21){
            System.out.println("Congrats you now have a wristband");
        }
    }
}