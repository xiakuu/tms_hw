package lesson6;

public class CreditCard {
    String checkNumber;
    int money;
    public CreditCard(){
        checkNumber = "1122 3323 4454 9900";
        money = 1000;
    }


    public CreditCard(String checkNumber, int money){
        this.checkNumber = checkNumber;
        this.money = money;
    }


    public String getInfo(){
        return "Номер счета: " + checkNumber + ", деньги на счете: " + money;
    }

    public int depositMoney(int deposit){
        this.money = money;
        int sum = money + deposit;
        money = deposit;
        return sum;
    }

    public int withdrawMoney(int withdraw){
        this.money = money;
        int diff = money - withdraw;
        money = diff;
        return diff;
    }
}
