package phones;
import messages.Message;
import protocols.MessageProtocol;
import storage.StorageProvider;
import storage.ICloud;

public final class IPhone extends Phone implements MessageProtocol {

	public IPhone() { 
		super(new ICloud());
		}
	public boolean send(Message message){
		System.out.println("Sending "+message.toString());
		return storage.save(message);
		}
	
	public boolean receive(Message message) {
		System.out.println("Received "+message.toString());
		return storage.save(message);
		}
}
