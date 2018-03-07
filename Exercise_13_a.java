package Chapter_8_a;

public class Exercise_13_a
{
    public static void main(String[] args)
    {
        Exercise_13_a Hanne = new Exercise_13_a("Hanne",505);
        Exercise_13_a Hans = new Exercise_13_a("Hans", 400);

        System.out.println(Hanne);
        System.out.println(Hans);
        Hanne.transfer(Hans, 300);
        System.out.println(Hanne);
        System.out.println(Hans);


    }


    String name;
    double balance;
    double transactionFee = 5.00;

    public void deposit(double amount)
    {

        balance = balance + amount;

    }
    //metode til at hæve penge, hvis der er nok penge på.
    public void withdraw(double amount)
    {
        if (balance - amount - transactionFee < 0)
        {
            System.out.println("Insufficient funds");

        } else
        {
            balance = balance - amount - transactionFee;

            System.out.println(name + "'s balance is: " + balance);
        }
    }
// metoe
    public void transfer ( Exercise_13_a name, double amount){

        if(balance - transactionFee >= amount)
        {
            withdraw(amount);
            name.deposit(amount);

        }else{
            System.out.println("Insufficient funds");
        }
    }
    //Contructor til customer
    public Exercise_13_a(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }
    // toString metoder til customer
    public String toString(){
        return name + ", " + balance;
    }
}