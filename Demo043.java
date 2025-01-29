import java.util.Scanner;

public class Demo043{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charector");
        String input1 = sc.nextLine();
        String value = input1.toUpperCase();
        System.out.println(value);
       
        sc.close();
    }
}
