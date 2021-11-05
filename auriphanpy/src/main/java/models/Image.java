package models;
import javax.persistence.*;

@Entity
@Table (name="image")
public class Image {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="path", nullable=false)
	private String path;
	
	@ManyToOne()
    @JoinColumn(name = "serviceId")
    private Service service;

	public Image() {
		super();
	}

	public Image(String name, String path, Service service) {
		this.name = name;
		this.path = path;
		this.service = service;
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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
}
