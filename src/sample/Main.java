public class Main {

    public static void main(String[] args) {
        int count = 1000;
        int amountDeposit = 2300;
        int bonus = amountDeposit > 1000 ? amountDeposit / 100 : amountDeposit;
        int totalAmount = count + amountDeposit + bonus;

        //if (amountDeposit < 1000) {
        //bonus = 0;
        //} else {
        //bonus = 1;
        //}
        System.out.println("Ваш баланс: " + totalAmount);
        System.out.println("Ваши бонусы: " + bonus);


    }
}
