package models;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table (name="reservation")
public class Reservation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="wasAccepted", nullable=false)
	private int wasAccepted;
	
	@ManyToOne()
    @JoinColumn(name = "paymentMethodId")
    private PaymentMethod paymentMethod;
	
	@ManyToOne()
    @JoinColumn(name = "serviceId")
    private Service service;
	
	@ManyToOne()
    @JoinColumn(name = "userId")
    private User user;
	
	@ManyToOne()
    @JoinColumn(name = "reasonId")
    private RejectedReason rejectedReason;
	
	@ManyToOne
    @JoinColumn(name = "eventId")
	private Event event;
	
	public Reservation() {
		super();
	}

	public Reservation(int wasAccepted, PaymentMethod paymentMethod, Service service, User user, RejectedReason rejectedReason, Event event) {
		this.wasAccepted = wasAccepted;
		this.paymentMethod = paymentMethod;
		this.service = service;
		this.user = user;
		this.rejectedReason = rejectedReason;
		this.event = event;
	}

	public Reservation(int wasAccepted, PaymentMethod paymentMethod, Service service, User user, Event event) {
		this.wasAccepted = wasAccepted;
		this.paymentMethod = paymentMethod;
		this.service = service;
		this.user = user;
		this.event = event;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getWasAccepted() {
		return wasAccepted;
	}

	public void setWasAccepted(int wasAccepted) {
		this.wasAccepted = wasAccepted;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public RejectedReason getRejectedReason() {
		return rejectedReason;
	}

	public void setRejectedReason(RejectedReason rejectedReason) {
		this.rejectedReason = rejectedReason;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
}
