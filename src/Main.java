public class Main {

    public static void main(String[] args) {

        int userWallet = 400;
        int price = 1200;
        int bonusThreshold = 1000;
        int bonus = 0;
        int sum;
        int bonusStep = 100;

        if (price > bonusThreshold) {
            bonus = price / bonusStep;
            sum = bonus + userWallet + price;
        } else {
            sum = userWallet + price;
        }
        System.out.println("Итоговый счет: " + sum);
        System.out.println("Количество бонусных рублей: " + bonus);
    }


}
