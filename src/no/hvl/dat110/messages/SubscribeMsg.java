package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	private String topic;
	
	/**
	 * Konstruktør som oppretter en SubscribeMsg
	 * @param user
	 * @param topic
	 */
	public SubscribeMsg(String user, String topic) {
		super(MessageType.SUBSCRIBE, user);
		this.topic = topic; 
	}
	
	/**
	 * Returnerer topic
	 * @return
	 */
	public String getTopic() {
		return topic;
	}

	/**
	 * Setter topic vha String gitt som parameter
	 * @param topic
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	} 
	
	@Override
	public String toString() {
		return "[SubscribeMsg]: Topic: " + topic + super.toString();
	}
		
}
