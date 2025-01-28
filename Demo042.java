import java.util.Scanner;

public class Demo042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charector");
        String input1 = sc.nextLine();
        String value = input1.toLowerCase();
        System.out.println(value);
       
        sc.close();
    }
}