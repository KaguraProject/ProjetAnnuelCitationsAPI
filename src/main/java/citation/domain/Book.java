package citation.domain;

import lombok.Data;

@Data
public class Book {
	
	public int id;
	public String titre;
	public String imageUrl;
	public int auteurId;
	public int anneeParution;
}
