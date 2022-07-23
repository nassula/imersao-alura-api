package curso.api.rest;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Entity;

@Entity
public class Linguagem {
	
    @Id
    private Long id;
    
    private String nome;
    private String urlImage;
    private int ranking;

    public Linguagem() {

    }

    public Linguagem(String nome, String urlImage, int ranking) {
        this.nome = nome;
        this.urlImage = urlImage;
        this.ranking = ranking;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getRanking() {
        return ranking;
    }

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
    
}
