package interfaces;

public interface PaymentProcessor<T> {
	void processPayment(T paymentDetails);

}
