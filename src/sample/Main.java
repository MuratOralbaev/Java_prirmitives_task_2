public class Main  {

    public static void main(String[] args) {
        int count = 1000;
        int amountDeposit = 2300;
        int bonus = amountDeposit/100;
        int totalAmount = count + amountDeposit + bonus;
        if (amountDeposit<1000) {
            bonus = 0;
        } else {
            bonus = 1;
        }
        System.out.println(totalAmount);


    }
}
