package entities;

import interfaces.Notifier;


		public class SkypeNotifier implements Notifier<Skype> {

		    @Override
		    public void send(Skype skype) {
		        System.out.println("Sending Skype notification:");
		        System.out.println("Skype ID: " + skype.getSkypeId());
		        System.out.println("Email: " + skype.getEmail());
		       
		    }

	

	}


