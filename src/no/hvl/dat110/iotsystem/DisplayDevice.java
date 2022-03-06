package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		// TODO - START
				
		// create a client object and use it to
		
		// - connect to the broker - use "display" as the username
		// - create the temperature topic on the broker
		// - subscribe to the topic
		// - receive messages on the topic
		// - unsubscribe from the topic
		// - disconnect from the broker
		
		//Lager klienten
		Client klient = new Client("display", Common.BROKERHOST, Common.BROKERPORT);
		
		klient.connect();
		klient.createTopic(Common.TEMPTOPIC);
		klient.subscribe(Common.TEMPTOPIC);
		
		for(int i = 0; i < COUNT; i++) {
			
			//Mottar meldingen
			PublishMsg message = (PublishMsg) klient.receive();
			
			//Skriver ut meldingen
			System.out.println("Displayet viser: " + message.getMessage());
			
			try {
				Thread.sleep(1500);
				
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		
		klient.unsubscribe(Common.TEMPTOPIC);
		klient.disconnect();
		
		
		// TODO - END
		
		System.out.println("Display stopping ... ");
		
		
	}
}
