package models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name="service_type")
public class ServiceType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name", nullable=false, unique=true)
	private String name;

	@OneToMany(mappedBy = "serviceType", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Service> services;

	@ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "service_ScoreCriterion",
            joinColumns = {@JoinColumn(name = "serviceType_id")},
            inverseJoinColumns = {@JoinColumn(name = "scoreCriterion_id")})
    private List<ScoreCriterion> criterion;

	public ServiceType() {
		super();
	}

	public ServiceType(String name) {
		this.name = name;
		this.services = new ArrayList<>();
		this.criterion = new ArrayList<>();
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