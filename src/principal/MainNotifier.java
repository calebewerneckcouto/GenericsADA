package principal;

import entities.Email;
import entities.EmailNotifier;
import entities.SMS;
import entities.SMSNotifier;
import entities.Skype;
import entities.SkypeNotifier;
import interfaces.Notifier;

public class MainNotifier {
	
	public static void main(String[] args) {
		
		Notifier<Email> emailNotifier = new EmailNotifier();
        emailNotifier.send(new Email("teste@email.com"));

        Notifier<SMS> smsNotifier = new SMSNotifier();
        smsNotifier.send(new SMS("31999998888"));
        
        Notifier<Skype> skypeNotifier = new SkypeNotifier();
        skypeNotifier.send(new Skype("skype123", "senha123", "teste@skype.com"));
        
		
	}

}
