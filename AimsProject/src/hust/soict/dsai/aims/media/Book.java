package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

	private List<String> authors = new ArrayList<String>();

	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) {
			return;
		} else {
			authors.add(authorName);
		}
	}

	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
		}
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

}
