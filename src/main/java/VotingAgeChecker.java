import java.util.Scanner;
public class VotingAgeChecker {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite savo amžių: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Jūs esate pilnametis ir galite balsuoti.");
        } else{
            System.out.println("Jums dar negalima balsuoti.");

    }

    }
}
