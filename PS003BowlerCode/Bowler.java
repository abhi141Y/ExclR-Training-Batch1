package PS003BowlerCode;

public class Bowler {
  
    public String name;
    public int wickets;
    public int matches;
   public  int balls_bowled;
    public int runs_conceded;

    
    public Bowler() {
        name = "Unknown";
        wickets = 0;
        matches = 0;
        balls_bowled = 0;
        runs_conceded = 0;
    }

    public Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

   
    public static void main(String[] args) {
        
        Bowler bowler1 = new Bowler();
        System.out.println("Bowler 1 - Name: " + bowler1.name + ", Wickets: " + bowler1.wickets);

        
        Bowler bowler2 = new Bowler("James Anderson", 600, 150, 12000, 10500);
        System.out.println("Bowler 2 - Name: " + bowler2.name + ", Wickets: " + bowler2.wickets);
    }
}

