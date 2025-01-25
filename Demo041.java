
import java.util.Scanner;

public class Demo041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter");
        char letter = sc.next().toLowerCase().charAt(0);
        if(letter == 'a'||letter == 'e'||letter == 'i'||letter == '0'||letter == 'u'){
            System.out.println("The given letter is ovel");
        }
        else{
            System.out.println("The given code is a consonent");
        }
    }
}
