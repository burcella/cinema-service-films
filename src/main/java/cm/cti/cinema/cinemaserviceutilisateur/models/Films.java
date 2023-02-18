package cm.cti.cinema.cinemaserviceutilisateur.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="films")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Films {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String dateSortie;
	private String acteurs;
	private String resume;
	private int age;
	private String image;
	private String dateDiffusion;
	private String heureDiffusion;
	
	
	public Films() {
		super();
	}
	public Films(Long id, String title, String dateSortie, String acteurs, String resume, int age, String image,
			String dateDiffusion, String heureDiffusion) {
		super();
		this.id = id;
		this.title = title;
		this.dateSortie = dateSortie;
		this.acteurs = acteurs;
		this.resume = resume;
		this.age = age;
		this.image = image;
		this.dateDiffusion = dateDiffusion;
		this.heureDiffusion = heureDiffusion;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(String dateSortie) {
		this.dateSortie = dateSortie;
	}
	public String getActeurs() {
		return acteurs;
	}
	public void setActeurs(String acteurs) {
		this.acteurs = acteurs;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDateDiffusion() {
		return dateDiffusion;
	}
	public void setDateDiffusion(String dateDiffusion) {
		this.dateDiffusion = dateDiffusion;
	}
	public String getHeureDiffusion() {
		return heureDiffusion;
	}
	public void setHeureDiffusion(String heureDiffusion) {
		this.heureDiffusion = heureDiffusion;
	}
	
	
	
	

}
