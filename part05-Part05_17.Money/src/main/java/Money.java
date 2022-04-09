
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        
        int newCents = this.cents + addition.cents;
        int newEuros = this.euros + addition.euros;
        if (newCents>99){
            newCents-=100;
            if (newCents<0){
                newCents*=-1;
            }
            newEuros++;
        }
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
    public boolean lessThan(Money compared){
        int totalThis = this.euros * 100 + this.cents;
        int totalComp = compared.euros * 100 + compared.cents;
        return totalThis < totalComp;
            
        
    }
    
    public Money minus(Money decreaser){
        Money newMoney;
        int newEuros = this.euros;
        int newCents = this.cents;
        if (this.lessThan(decreaser)){
            newMoney = new Money(0,0);
            return newMoney;
        }
        if((this.cents - decreaser.cents) < 0){
            newCents+=100;
            newEuros--;
        }
        newEuros-=decreaser.euros;
        newCents-=decreaser.cents;
        newMoney = new Money(newEuros,newCents);
        
        return newMoney;
        
    }

}
