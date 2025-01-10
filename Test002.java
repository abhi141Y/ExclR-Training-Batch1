import java.util.Scanner;

class Test002{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are u a student(yes/no)");
        String replay = scanner.nextLine();
        while(true){
            if(replay.equals("yes")){
                System.out.print("happy sankranthi");
                break;
            }
            
        }
        
    }
}