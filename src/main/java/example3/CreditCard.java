package example3;

public class CreditCard {

    private int CardPin;
    private String CardHolderName;

    public CreditCard(int cardPin, String cardHolderName) {
        this.CardPin = cardPin;
        this.CardHolderName = cardHolderName;
    }

    public int getCardPin() {
        return CardPin;
    }

    public void setCardPin(int cardPin) {
        this.CardPin = cardPin;
    }

    public String getCardHolderName() {
        return CardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.CardHolderName = cardHolderName;
    }
}
