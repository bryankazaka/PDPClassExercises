public class Payment {
    String cardNumber = null;
    String clientName = null;
    String recipientName = null;
    int amount;

    public Payment(){}
    public Payment(String cardNumber, String clientName, String recipientName, int amount)
    {
        
    }
    public static class Builder {
        private String cardNumber;
        private String clientName;
        private String recipientName;
        private int amount;

        public Builder(){}

        public Builder setCardNumber(String cardNumber) {

            if (cardNumber == null)
            {
                throw new IllegalArgumentException("cardNumber is required.");
            }
            this.cardNumber = cardNumber;
            return this;
        }

        public Builder setClientName(String clientName) {

            if (clientName == null || clientName.isEmpty())
            {
                throw new IllegalArgumentException("clientName is required.");
            }
            this.clientName = clientName;
            return this;
        }

        public Builder setRecipientName(String recipientName) {

            if (recipientName == null || recipientName.isEmpty())
            {
                throw new IllegalArgumentException("recipientName is required.");
            }
            this.recipientName = recipientName;
            return this;
        }

        public Builder setAmount(int amount) {

            if (amount <= 0)
            {
                throw new IllegalArgumentException("amount must be positive.");
            }
            this.amount = amount;
            return this;
        }
        public Payment build() {
            return new Payment(cardNumber, clientName, recipientName, amount);
        }
    }
}