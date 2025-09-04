package principal;

import entities.CreditCard;
import entities.CreditCardProcessor;
import entities.Pix;
import entities.PixProcessor;
import interfaces.PaymentProcessor;

public class MainPix {
	public static void main(String[] args) {
		PaymentProcessor<CreditCard> ccProcessor = new CreditCardProcessor();
        ccProcessor.processPayment(new CreditCard("1234-5678-9999"));

        PaymentProcessor<Pix> pixProcessor = new PixProcessor();
        pixProcessor.processPayment(new Pix("ana@email.com"));
	}
}
