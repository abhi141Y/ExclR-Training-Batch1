package ps001.corejava;

public class Demo014 {public static void main(String[] args) {
            int a = 5;
            int b = 3;
    
            int plus = +a;
            System.out.println("Unary Plus: " + plus);
    
            int minus = -a;
            System.out.println("Unary Minus: " + minus);
    
            int preIncrement = ++a;
            System.out.println("Pre-Increment (a): " + preIncrement);
    
            int preDecrement = --b;
            System.out.println("Pre-Decrement (b): " + preDecrement);
    
            int postIncrement = a++;
            System.out.println("Post-Increment (a): " + postIncrement);
            System.out.println("Value of a after post-increment: " + a);
    
            int postDecrement = b--;
            System.out.println("Post-Decrement (b): " + postDecrement);
            System.out.println("Value of b after post-decrement: " + b);
    
           
    }
    
}
