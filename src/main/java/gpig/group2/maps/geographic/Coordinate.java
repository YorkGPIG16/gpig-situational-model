package gpig.group2.maps.geographic;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 19/05/2016.
 */

@XmlRootElement(name="coordinate")
public class Coordinate {
    @XmlAttribute(name="latitude")
    private float latitude;
    @XmlAttribute(name="longitude")
    private float longitude;
}
