package models;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name="Service")
public class Service {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name", nullable=false)
    private String name;
	
	@Column(name="description", nullable=false)
    private String description;
	
	@Column(name="website")
    private String website;
	
	@Column(name="phone", nullable=false)
    private String phone;
	
	@Column(name="instagram")
    private String instagram;
	
	@Column(name="twitter")
    private String twitter;
    
	@ManyToOne()
    @JoinColumn(name = "userId")
    private User user;
	
	@ManyToOne()
    @JoinColumn(name = "typeId")
    private ServiceType serviceType;
	
	@OneToMany(mappedBy = "service", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Score> scores;

	@OneToMany(mappedBy = "service", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Image> images;

	@OneToMany(mappedBy = "service", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reservation> reservations;

	public Service() {
		super();
	}

	public Service(String name, String description, String website, String phone, String instagram, String twitter, User user, ServiceType serviceType) {
		this.name = name;
		this.description = description;
		this.website = website;
		this.phone = phone;
		this.instagram = instagram;
		this.twitter = twitter;
		this.user = user;
		this.serviceType = serviceType;
		this.scores = new ArrayList<>();
		this.images = new ArrayList<>();
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ServiceType getServiceType() {
		return serviceType;
	}

	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}

//	public List<Score> getScores() {
//		return scores;
//	}
//
//	public void setScores(List<Score> scores) {
//		this.scores = scores;
//	}
//
//	public List<Image> getImages() {
//		return images;
//	}
//
//	public void setImages(List<Image> images) {
//		this.images = images;
//	}
//
//	public List<Reservation> getReservations() {
//		return reservations;
//	}
//
//	public void setReservations(List<Reservation> reservations) {
//		this.reservations = reservations;
//	}
}
