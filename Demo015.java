package ps001.corejava;

public class Demo015 {
    public static void main(String[] args) {
        int a = 5; 
        int b = 10;
    
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
