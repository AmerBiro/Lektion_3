import java.util.Scanner;
public class ASCII_tabel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Lektion 3");
        System.out.println("ASCII tabel");
        while (true) {
            System.out.println("Indtast venligst et tegn");
            String a = s.next();

            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    System.out.println("Tegnet er et stort bogstav for A-Z");
                } else if (c >= 'a' && c <= 'z') {
                    System.out.println("Tegnet er et lille bogstav for a-z");
                } else if (c >= '0' && c <= '9') {
                    System.out.println("Tegnet er et tal for 0-9");
                } else if (c == '#' || c == '!' || c == '+' || c <= '\\') {
                    System.out.println("Tegnet er et af de 4 specialtegn (#, !, +, \\) ");
                } else {
                    System.out.println("Tegnet er ikke kendt af dette program");
                }
            }
            System.out.println("----------------------------------");
        }
        }
    }