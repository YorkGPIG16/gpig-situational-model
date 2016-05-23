package gpig.group2.maps.geographic;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 19/05/2016.
 */

@XmlRootElement(name="point")
public class Point extends Position {
	@XmlAttribute(name = "latitude")
	private float latitude;
	@XmlAttribute(name = "longitude")
	private float longitude;

	public float getLatitude() {
		return latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	//Required for XML bindings!
	public Point() {

	}


	public Point(float latitude, float longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(latitude);
		result = prime * result + Float.floatToIntBits(longitude);
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
		Point other = (Point) obj;
		if (Float.floatToIntBits(latitude) != Float.floatToIntBits(other.latitude))
			return false;
		if (Float.floatToIntBits(longitude) != Float.floatToIntBits(other.longitude))
			return false;
		return true;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
}