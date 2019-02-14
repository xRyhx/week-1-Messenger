import java.util.List;

public abstract class StorageProvider {

	private List<Message> message;
	
	public boolean save(Message message)
	{
		return false;
		
	}
	
	public List<Message> retrieveAll()
	{
		return null;
		
	}

	public List<Message> getMessage() {
		return message;
	}

	public void setMessage(List<Message> message) {
		this.message = message;
	}
}
