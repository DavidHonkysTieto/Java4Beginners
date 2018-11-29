package j4b.blog.object;

import java.time.LocalDateTime;
import java.util.List;

public class Author extends User{
	
	private LocalDateTime lastModifiedDate;
	private List articles;
	
	public Author(int id, String fullName, String userName) {
		super(id, fullName, userName);
	}
	
	public LocalDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	
	public List getArticles() {
		return articles;
	}
	public void setArticles(List articles) {
		this.articles = articles;
	}	

}
