package models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table (name="ScoreCriterion")
public class ScoreCriterion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name", nullable=false)
	private String name;

	@ManyToMany(mappedBy = "criterion")
    private List<ServiceType> serviceType;

	@OneToMany(mappedBy = "scoreCriterion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Score> scores;

	public ScoreCriterion() {
		super();
	}

	public ScoreCriterion(String name) {
		this.name = name;
		this.serviceType = new ArrayList<>();
		this.scores = new ArrayList<>();
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}