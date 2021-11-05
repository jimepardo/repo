package models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name="event_type")
public class EventType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name", nullable=false)
	private String name;

	@OneToMany(mappedBy="eventType", cascade= CascadeType.ALL, orphanRemoval = true)
    private List<Event> events;

	public EventType() {
		super();
	}

	public EventType(String name) {
		this.name = name;
		this.events = new ArrayList<>();
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
