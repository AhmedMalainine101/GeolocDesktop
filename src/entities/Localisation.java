package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Position
 *
 */
@Entity

public class Localisation implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String latitude;
	private String longitude;
	@Temporal(TemporalType.DATE)
	private Date date;
	@ManyToOne
	private Telephone telephone;
	private static final long serialVersionUID = 1L;

	public Localisation() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public Localisation(String latitude, String longitude, Date date, Telephone telephone) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.date = date;
		this.telephone = telephone;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Telephone getSmartphone() {
		return telephone;
	}

	public void setSmartphone(Telephone telephone) {
		this.telephone = telephone;
	}

}
