package models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name="rejected_reason")
public class RejectedReason {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name", nullable=false)
	private String name;

	@OneToMany(mappedBy = "rejectedReason", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reservation> reservations;

	public RejectedReason() {
		super();
	}

	public RejectedReason(String name) {
		this.name = name;
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

}