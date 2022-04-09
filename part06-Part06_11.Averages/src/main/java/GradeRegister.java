
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    public double averageOfGrades(){
        if(this.grades.size() > 0){
            int total = 0;
            for(int grade : this.grades){
                total+=grade;
            }
            double grandTotal = (double)total*1.0;
            return grandTotal / this.grades.size() *1.0;
        }
        return -1;
    }
    
    public double averageOfPoints(){
        if(this.points.size()>0){
            double total = 0;
            for(int point : this.points){
                total+=point;
            }
            return total/this.points.size()*1.0;
        }
        
        return -1;
    }
}
