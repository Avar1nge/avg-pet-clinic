package tech.pm.patterns.adapter.practice;

public class CardPaymentProcessorAdapter implements PaymentSystem {
  CardPaymentProcessor cardPaymentProcessor;

  public CardPaymentProcessorAdapter(CardPaymentProcessor cardPaymentProcessor) {
    this.cardPaymentProcessor = cardPaymentProcessor;
  }

  @Override
  public String processPayment() {
    cardPaymentProcessor.getCardDetails();
    cardPaymentProcessor.getTargetBankAccountDetails();
    cardPaymentProcessor.sendFunds();
    return PAYMENT_PROCESSED;
  }
}
