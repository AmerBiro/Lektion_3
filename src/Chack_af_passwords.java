import java.util.Scanner;

public class Chack_af_passwords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Lektion 2");
        System.out.println("Chack af passwords");

        do {
            boolean valid;
        System.out.println("Indtast venligst passwordet");
        String password0 = in.nextLine();
            if (password0.length() < 5)
            {
                System.out.println("Password for kort");
            }
            if (password0.length() > 8)
            {
                System.out.println("Password for langt");
            }
            if ((password0.length() > 4) & (password0.length() < 9))
            {
                System.out.println("Password tilpas");
                if (valid = true)
                    break;
            }
            System.out.println("-------------------------------------");
        }while (true);

        }
    }

