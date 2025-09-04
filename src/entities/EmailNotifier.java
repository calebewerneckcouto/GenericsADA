package entities;

import interfaces.Notifier;

public class EmailNotifier implements Notifier<Email> {
	

	@Override
	public void send(Email message) {
		 System.out.println("Enviando e-mail para: " + message.address);
	}

}
