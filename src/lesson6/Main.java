package lesson6;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard("1231 1332 1778 9900", 500);
        CreditCard card3 = new CreditCard("7788 9965 2323 7771", 850);

        System.out.println(card1.getInfo());
        System.out.println(card2.getInfo());
        System.out.println(card3.getInfo());

        card1.depositMoney(600);
        card2.depositMoney(450);
        card3.withdrawMoney(250);

        System.out.println(card1.getInfo());
        System.out.println(card2.getInfo());
        System.out.println(card3.getInfo());


    }
}
