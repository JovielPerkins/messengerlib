package storage;

import messages.Message;
import java.util.List;
import java.util.ArrayList;

public abstract class StorageProvider {
	protected List<Message> messages;

	public StorageProvider() {
		messages = new ArrayList<Message>();
	}

	public boolean save(Message message){
	messages.add(message);
	return true;
	}
	
	public List<Message> retrieveAll()
	{
		return messages;
	}
}
