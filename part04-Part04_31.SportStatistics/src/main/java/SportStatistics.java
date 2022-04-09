
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        try(Scanner theFile = new Scanner(Paths.get(file))){
            System.out.println("Team: ");
            String team = scan.nextLine();
            int count = 0;
            int winner = 0;
            int loser = 0;
            while(theFile.hasNextLine()){
                String line = theFile.nextLine();
                if (line.contains(team)){
                    count++;
                    String[] parts = line.split(",");
                    int homeScore = Integer.valueOf(parts[2]);
                    int awayScore = Integer.valueOf(parts[3]);
                    if(parts[0].equals(team)){
                        if(homeScore > awayScore){
                            winner++;
                        }else {
                            loser++;
                        }
                    }
                    if(parts[1].equals(team)){
                        if (awayScore > homeScore){
                            winner++;
                        }else {
                            loser++;
                        }
                    }
                    
                }
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + winner);
            System.out.println("Losses: " + loser);
        }catch (Exception e){

        }

    }

}
