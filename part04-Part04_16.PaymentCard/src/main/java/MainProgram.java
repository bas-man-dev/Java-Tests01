
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard paulC = new PaymentCard(20.0);
        PaymentCard mattC = new PaymentCard(30.0);
        
        paulC.eatHeartily();
        mattC.eatAffordably();
        
        System.out.println("Paul: " + paulC.toString());
        System.out.println("Matt: " + mattC.toString());
        
        paulC.addMoney(20.0);
        mattC.eatHeartily();
        
        System.out.println("Paul: " + paulC.toString());
        System.out.println("Matt: " + mattC.toString());
        
        paulC.eatAffordably();
        paulC.eatAffordably();
        mattC.addMoney(50.0);
        
        System.out.println("Paul: " + paulC.toString());
        System.out.println("Matt: " + mattC.toString());
        
    }
}
