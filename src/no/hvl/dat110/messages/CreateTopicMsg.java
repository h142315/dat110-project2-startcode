package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// message sent from client to create topic on the broker
	
	// TODO: 
	// Implement object variables - a topic is required
	
	private String topic;


	
	// Constructor, get/set-methods, and toString method
    // as described in the project text
	
	/**
	 * Konstruktør som oppretter en CreateTopicMsg
	 * @param user
	 * @param topic
	 */
	public CreateTopicMsg(String user, String topic) {
		super(MessageType.CREATETOPIC, user);
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
		return "[CreateTopicMsg]: Topic: " + topic + super.toString();
	}

	
}
