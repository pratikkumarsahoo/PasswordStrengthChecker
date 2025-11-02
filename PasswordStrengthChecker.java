import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int strengthScore = 0;

        // Check length
        if (password.length() >= 8) {
            strengthScore++;
        }

        // Check for uppercase letters
        if (password.matches(".*[A-Z].*")) {
            strengthScore++;
        }

        // Check for lowercase letters
        if (password.matches(".*[a-z].*")) {
            strengthScore++;
        }

        // Check for numbers
        if (password.matches(".*[0-9].*")) {
            strengthScore++;
        }

        // Check for special characters
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            strengthScore++;
        }

        // Display password strength
        switch (strengthScore) {
            case 5:
                System.out.println("Password Strength: Very Strong 💪");
                break;
            case 4:
                System.out.println("Password Strength: Strong ✅");
                break;
            case 3:
                System.out.println("Password Strength: Medium ⚠️");
                break;
            case 2:
                System.out.println("Password Strength: Weak ⚡");
                break;
            default:
                System.out.println("Password Strength: Very Weak ❌");
                break;
        }

        // Provide feedback
        if (password.length() < 8)
            System.out.println("- Try making your password at least 8 characters long.");
        if (!password.matches(".*[A-Z].*"))
            System.out.println("- Add at least one uppercase letter.");
        if (!password.matches(".*[a-z].*"))
            System.out.println("- Add at least one lowercase letter.");
        if (!password.matches(".*[0-9].*"))
            System.out.println("- Include at least one number.");
        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*"))
            System.out.println("- Include at least one special character.");

        sc.close();
    }
}
