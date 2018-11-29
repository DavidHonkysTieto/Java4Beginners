package j4b.blog.object;

public class Text {
	
	private Author author;
	private String content;
	
	public Text(Author author, String content) {
		super();
		this.author = author;
		this.content = content;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Text [author=" + author + ", content=" + content + "]";
	}	

}
