package gpig.group2.model.sensor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.joda.time.DateTime;

import gpig.group2.maps.geographic.Point;
import gpig.group2.model.adaptors.JodaDateTimeAdaptor;

@XmlRootElement
public class StrandedPerson {

	@XmlElement
	private Point location;

	@XmlElement
	private int estimatedNumber;

	@XmlJavaTypeAdapter(type = DateTime.class, value = JodaDateTimeAdaptor.class)
	@XmlElement
	private DateTime timeIdentified;

	private String imageUrl;

	@XmlTransient
	public String getImageUrl() {

		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {

		this.imageUrl = imageUrl;
	}

	public StrandedPerson() {
	}

	public StrandedPerson(Point location, int estimatedNumber, DateTime timeIdentified) {
		this.location = location;
		this.estimatedNumber = estimatedNumber;
		this.timeIdentified = timeIdentified;
	}

	@XmlTransient
	public Point getLocation() {

		return location;
	}

	public void setLocation(Point location) {

		this.location = location;
	}

	@XmlTransient
	public int getEstimatedNumber() {

		return estimatedNumber;
	}

	public void setEstimatedNumber(int estimatedNumber) {

		this.estimatedNumber = estimatedNumber;
	}

	@XmlTransient
	public DateTime getTimeIdentified() {

		return timeIdentified;
	}

	public void setTimeIdentified(DateTime timeIdentified) {

		this.timeIdentified = timeIdentified;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + estimatedNumber;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((timeIdentified == null) ? 0 : timeIdentified.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StrandedPerson other = (StrandedPerson) obj;
		if (estimatedNumber != other.estimatedNumber)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (timeIdentified == null) {
			if (other.timeIdentified != null)
				return false;
		} else if (!timeIdentified.equals(other.timeIdentified))
			return false;
		return true;
	}
}
