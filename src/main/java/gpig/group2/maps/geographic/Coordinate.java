package gpig.group2.maps.geographic;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "coordinate")
public class Coordinate {
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

	public Coordinate(float latitude, float longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}
}
