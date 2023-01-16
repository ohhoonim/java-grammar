package implement;

public class Main {
    public static void main(String[] args) {
        PayMethod money = new PayMoney();        
        String moneyMessage = money.pay();
        System.out.println(moneyMessage);

        PayMethod card = money.changeMethod(new PayCard());
        String cardMessage = card.pay();
        System.out.println(cardMessage);
    }    
}
