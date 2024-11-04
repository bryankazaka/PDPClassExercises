public class Card {
    private String cardNumber;
    private String expiryDate;
    private String cardHolderName;
    private String cardType;

    // Getters for each field
    public String getCardNumber() { return cardNumber; }
    public String getExpiryDate() { return expiryDate; }
    public String getCardHolderName() { return cardHolderName; }
    public String getCardType() { return cardType; }

    public static class Builder {
    private String cardNumber;
    private String expiryDate;
    private String cardHolderName;
    private String cardType;

    // Builder method for setting cardNumber with validation
    public Builder setCardNumber(String cardNumber) {
        if (cardNumber == null) {
            throw new IllegalArgumentException("Card number missing.");
        }
        this.cardNumber = cardNumber;
        return this;
    }

    // Builder method for setting expiryDate with validation
    public Builder setExpiryDate(String expiryDate) {
        if (expiryDate == null) {
            throw new IllegalArgumentException("Expiry date missing.");
        }
        this.expiryDate = expiryDate;
        return this;
    }

    // Builder method for setting cardHolderName
    public Builder setCardHolderName(String cardHolderName) {
        if (cardHolderName == null || cardHolderName.isEmpty()) {
            throw new IllegalArgumentException("Card holder name cannot be empty.");
        }
        this.cardHolderName = cardHolderName;
        return this;
    }

    // Builder method for setting cardType with validation
    public Builder setCardType(String cardType) {
        if (cardType == null || !(cardType.equals("Debit") || cardType.equals("Credit"))) {
            throw new IllegalArgumentException("Card type must be 'Debit' or 'Credit'.");
        }
        this.cardType = cardType;
        return this;
    }

    // Build method to create a new Card instance
    public Card build() {
        return new Card(this);
    }
}
