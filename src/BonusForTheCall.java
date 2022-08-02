public class BonusForTheCall {
    public static void main(String[] args) {
        int initialBalance = 100;
        int topUpBalance = 8000;

        if (topUpBalance > 1000) {
            initialBalance = topUpBalance + topUpBalance / 100 + initialBalance;
        } else {
            initialBalance = initialBalance + topUpBalance;
        }
        System.out.println("Баланс Вашего счета составляет: " + initialBalance);
    }
}
