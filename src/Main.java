//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        double balance = 5000;
        final double INTEREST_RATE = 0.17;
        double interest = 0;

        interest = balance * INTEREST_RATE;
        balance = balance + interest;
        System.out.println("Your balance after 1 month is $" + balance);
        interest = balance * INTEREST_RATE;
        balance = balance + interest;
        System.out.println("Your balance after 2 months is $" + balance);
    }
}