import java.util.Scanner;

public class Practicel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name :");
        String name = sc.nextLine();
        System.out.println("Enter Password : ");
        String pswd = sc.nextLine();

        validation(name, pswd);
    }

    public static void validation(String name, String pswd) {
        // for name
        int i = 0;
        int count = 0;
        char id = '@';

        while (i < name.length()) {
            char curr = name.charAt(i);
            if (curr == id) {
                count++;
            }
            i++;
        }

        if (count != 1) {
            System.out.println("Invalid name. Name should have @ characters.");
        }

        // for password
        i = 0;
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;

        while (i < pswd.length()) {
            char pos = pswd.charAt(i);

            if (pswd.length() > 8) {
                if (Character.isUpperCase(pos)) {
                    hasUpperCase = true;
                } else if ("@#$%&*".indexOf(pos) != -1) {
                    hasSpecialChar = true;
                }
            }
            i++;
        }

        if (!hasUpperCase || !hasSpecialChar) {
            System.out.println("Invalid password. Password should have at least 8 characters, " +
                    "at least one uppercase letter, and at least one of the special characters: @#$%&*");
        }
    }
}
