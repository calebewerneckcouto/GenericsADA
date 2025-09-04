package entities;

import interfaces.Notifier;

public class SMSNotifier implements Notifier<SMS> {

	@Override
	public void send(SMS message) {
		System.out.println("Enviando SMS para: " + message.phone);

	}

}
