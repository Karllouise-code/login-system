import java.util.Scanner;

public class loginSystem {
    public static void main(String[] args) {
        String user, pass;
        String username = "karllouise";
        String password = "rito123";
        int chance = 3;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Enter Username: ");
            user = scan.nextLine();

            System.out.print("Enter Password: ");
            pass = scan.nextLine();

            if (user.equals(username) && pass.equals(password)) {
                System.out.println("Login Successful!");
                scan.close();
                System.out.println();
                return;
            } else if (!user.equals(username) && pass.equals(password)) {
                System.out.println("Wrong Username! Chances Left: " + chance);
                System.out.println();
                chance--;
            } else if (!pass.equals(password) && user.equals(username)) {
                System.out.println("Wrong Password! Chances left: " + chance);
                System.out.println();
                chance--;
            } else {
                System.out.println("Wrong Username and Password! Chances Left: " + chance);
                System.out.println();
                chance--;
            }
        } while (chance >= 0);
        System.out.println("You are BLOCK!");
        scan.close();
    }
}