
import java.util.Scanner;

public class PS018 {
    
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();
        long minutesInAYear = 60 * 24 * 365;
        long years = minutes / minutesInAYear;
        System.out.println(minutes + " minutes is approximately " + years + " years.");
        scanner.close();
    }
}


