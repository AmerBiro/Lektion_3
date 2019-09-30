import java.util.Scanner;
public class Datoer {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Indtast år:");
            int år =sc.nextInt();
            System.out.println("Indtast måned:");
            int måned = sc.nextInt();
            System.out.println("Indtast dag");
            int dag = sc.nextInt();

            System.out.println("Dagen efter " +dag+ "/" +måned+ " " +år+ " er");


        }while (true);
    }
}
