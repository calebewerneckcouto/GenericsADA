package entities;

import interfaces.PaymentProcessor;

public class CreditCardProcessor implements PaymentProcessor<CreditCard> {
    @Override
    public void processPayment(CreditCard payment) {
        System.out.println("Processando pagamento com cartão: " + payment.cardNumber);
    }
}