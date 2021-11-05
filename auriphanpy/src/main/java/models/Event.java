package models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name="event")
public class Event {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="address", nullable=false)
	private String address;
	
	@Column(name="zipCode", nullable=false)
	private String zipCode;
	
	@Column(name="province", nullable=false)
	private String province;
	
	@Column(name="longitude", nullable=false)
	private Double longitude;
	
	@Column(name="latitude", nullable=false)
	private Double latitude;
	
	@Column(name="plannedFor", nullable=false)
	private String plannedFor;
	
	@Column(name="description", nullable=false)
	private String description;

	@ManyToOne()
	@JoinColumn(name = "userId")
	private User user;
	
    @ManyToOne()
    @JoinColumn(name = "eventTypeId")
    private EventType eventType;
	
	@OneToMany(mappedBy="event", cascade = CascadeType.MERGE)
    private List<Reservation> reservations;

	public Event() {
		super();
	}

	public Event(String name, String address, String zipCode, String province, Double longitude, Double latitude, String plannedFor, String description, EventType eventType, User user) {
		this.name = name;
		this.address = address;
		this.zipCode = zipCode;
		this.province = province;
		this.longitude = longitude;
		this.latitude = latitude;
		this.plannedFor = plannedFor;
		this.description = description;
		this.eventType = eventType;
		this.user = user;
		this.reservations = new ArrayList<>();
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getPlannedFor() {
		return plannedFor;
	}

	public void setPlannedFor(String plannedFor) {
		this.plannedFor = plannedFor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

}