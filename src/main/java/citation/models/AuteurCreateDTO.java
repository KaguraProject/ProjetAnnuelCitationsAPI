package citation.models;

import java.util.List;

import citation.domain.Book;

public class AuteurCreateDTO {
	public int id;
	public String prenom;
	public String nom;
	public String dateNaissance;
	
	public List<Book> books;

}
