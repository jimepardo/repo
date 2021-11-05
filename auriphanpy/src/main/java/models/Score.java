package models;
import org.hibernate.Criteria;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name="score")
public class Score {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User userId;

	@Column(name="score", nullable=false)
	private int score;

	@ManyToOne()
    @JoinColumn(name = "service_id")
    private Service service;

	@ManyToOne()
    @JoinColumn(name = "scoreCriterion_id")
    private ScoreCriterion scoreCriterion;

	public Score() {
		super();
	}

	public Score(int score, Service service, ScoreCriterion scoreCriterion) {
		this.score = score;
		this.service = service;
		this.scoreCriterion = scoreCriterion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
