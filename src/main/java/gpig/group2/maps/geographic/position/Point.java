package gpig.group2.maps.geographic.position;

import gpig.group2.maps.geographic.Coordinate;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 19/05/2016.
 */
@XmlRootElement(name="point")
public class Point extends CoordinateList {
    @XmlElement(name="coordinate")
    private Coordinate coordinate;

    public Coordinate getPoint() {
        return coordinate;
    }


}
