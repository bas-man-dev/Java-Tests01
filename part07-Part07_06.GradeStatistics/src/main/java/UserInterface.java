
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */
public class UserInterface {
    
    private final Scanner scanner;
    private int totalScores;
    private double passScores;
    private int count;
    private double passCount;
    private ArrayList<ArrayList<String> > grades;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.totalScores = 0;
        this.count = 0;
        this.passScores = 0;
        this.passCount = 0;
        this.grades = new ArrayList<ArrayList<String>>(6);
    }

    public void start() {
        ArrayList<String> fail = new ArrayList<>();
        ArrayList<String> one = new ArrayList<>();
        ArrayList<String> two = new ArrayList<>();
        ArrayList<String> three = new ArrayList<>();
        ArrayList<String> four = new ArrayList<>();
        ArrayList<String> five = new ArrayList<>();
        fail.add("0: ");
        one.add("1: ");
        two.add("2: ");
        three.add("3: ");
        four.add("4: ");
        five.add("5: ");
        this.grades.add(fail);
        this.grades.add(one);
        this.grades.add(two);
        this.grades.add(three);
        this.grades.add(four);
        this.grades.add(five);
        
        
        
        System.out.println("Enter point totals, -1 stops:");
        
        while(true){
            String score1 = this.scanner.nextLine();
            if (score1.isEmpty()){
                continue;
            }
            int score = Integer.valueOf(score1);
            if (score == -1){
                break;
            }
            
            
            if (!(score <= 100 && score >= 0)){
                continue;
            }
            if (score>=50){
                this.passCount++;
                this.passScores+=score;
                if (score>=90){
                    five.add("*");
                } else if(score>=80){
                    four.add("*");
                } else if(score>=70){
                    three.add("*");
                } else if(score>=60){
                    two.add("*");
                } else {one.add("*");}
                
            }
            if (score<50){fail.add("*");}
            this.count++;
            this.totalScores+=score;
            
            
        }
        System.out.println("Point average (all): " + (double)((1.0*this.totalScores)/this.count));
        if (this.passCount>0){
            System.out.println("Point average (passing): " + (double)((1.0*this.passScores)/this.passCount));
            System.out.println("Pass percentage: "+(double)(100*this.passCount/this.count*1.0));
        }  else {
            System.out.println("Point average (passing): -");
            System.out.println("Pass percentage: 0.0");
        } 
        System.out.println("Grade distribution:");
        for (int i = 5; i>=0; i--){
            for (int j=0; j< this.grades.get(i).size(); j++){
                System.out.print(this.grades.get(i).get(j));
        }
            System.out.println("");
           
        }
        //finish the rows, maybe write a class for this?
        
    }

    
}
