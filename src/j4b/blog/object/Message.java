package j4b.blog.object;

public class Message extends Text{
	
	private long messageID;

	public Message(Author author, String content) {
		super(author, content);
		this.messageID = generateID();
	}
	
	private long generateID() {
		return System.currentTimeMillis();
	}

	@Override
	public String toString() {
		return "Message [messageID=" + messageID + ", Author=" + getAuthor() + ", Content=" + getContent()
				+ "]";
	}	

}
