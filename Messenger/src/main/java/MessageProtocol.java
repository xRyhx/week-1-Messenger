
public interface MessageProtocol {
	
	public boolean send(Message message);
	
	public boolean receive(Message message);
}
