package entities;

import interfaces.PaymentProcessor;

public class PixProcessor implements PaymentProcessor<Pix> {
    @Override
    public void processPayment(Pix payment) {
        System.out.println("Processando pagamento via Pix: " + payment.chave);
    }
}