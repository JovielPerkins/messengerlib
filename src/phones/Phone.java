package phones;

import storage.StorageProvider;
import java.util.List;
import messages.TextMessage;
//import messages.PhotoMessage;
import messages.Message;

public abstract class Phone {
	private StorageProvider storage;

	public Phone(StorageProvider s) {
		storage = s;
	}

	public void viewAllMessages() {
		List<Message> messages = storage.retrieveAll();

		for (Message m : messages) {
			System.out.println(m);
			if(m instanceof TextMessage){
				System.out.println("this is a text message");
				TextMessage textMessage = (TextMessage) m;
			}
		}
		messages.forEach(System.out::println);
	}

}
