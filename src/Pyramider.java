import java.util.Scanner;
public class Pyramider {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Pyramider");
        do {
            System.out.println("Indtast venligst et tegn");
            char sym = sc.next().charAt(0);
            for (int sps = 5, hrt = 0; sps >= 0; sps--, hrt += 2) {
                for (int x = 0; x < sps; x++) {
                    System.out.print(" ");
                }
                for (int x = 0; x <= hrt; x++) {
                    System.out.print(sym);
                }
                System.out.println();
            }
        }while (true);
    }
}
