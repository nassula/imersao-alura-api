package curso.api.rest;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;

@Entity
public class Linguagem {
	
    @Id
    private String id;
    
    private String title;
    private String image;
    private int ranking;

    public Linguagem() {

    }

    public Linguagem(String title, String image, int ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public String getImage() {
        return image;
    }
    public int getRanking() {
        return ranking;
    }
	
}
