package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	// message sent from client to create topic on the broker

	// TODO:
	// Implement object variables - a topic is required
	
	private String topic;

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	/**
	 * Konstruktør som oppretter en DeleteTopicMsg
	 * @param user
	 * @param topic
	 */
	public DeleteTopicMsg(String user, String topic) {
		super(MessageType.DELETETOPIC, user);
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
		return "[DeleteTopicMsg]: Topic: " + topic + super.toString();
	}


}
