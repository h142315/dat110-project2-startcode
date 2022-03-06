package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		// TODO - start

		// create a client object and use it to

		// - connect to the broker - user "sensor" as the user name
		// - publish the temperature(s)
		// - disconnect from the broker
		
		Client klient = new Client("sensor", Common.BROKERHOST, Common.BROKERPORT);
		klient.connect();
		
		for(int i = 0; i < COUNT; i++) {
			int temperatur = sn.read();
			String tempString = Integer.toString(temperatur);
			
			System.out.println("Leser.. : " + tempString);
			
			klient.publish(Common.TEMPTOPIC, tempString);
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		
		// TODO - end

		System.out.println("Temperature device stopping ... ");


	}
}
