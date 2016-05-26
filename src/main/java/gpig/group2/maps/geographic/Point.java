package gpig.group2.maps.geographic;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 19/05/2016.
 */

@XmlRootElement(name="point")
public class Point extends Position {
	@XmlAttribute(name = "latitude")
	private Double latitude;
	@XmlAttribute(name = "longitude")
	private Double longitude;

	public Double getLatitudeX() {
		return latitude;
	}

	public Double getLongitudeX() {
		return longitude;
	}

	//Required for XML bindings!
	public Point() {

	}


	public Point(Double latitude, Double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		Long result = 1L;
		result = prime * result + Double.doubleToLongBits(latitude);
		result = prime * result + Double.doubleToLongBits(longitude);
		return result.intValue();
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (Double.doubleToLongBits(latitude) != Double.doubleToLongBits(other.latitude))
			return false;
		if (Double.doubleToLongBits(longitude) != Double.doubleToLongBits(other.longitude))
			return false;
		return true;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
}