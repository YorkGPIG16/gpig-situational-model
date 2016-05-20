package gpig.group2.maps.geographic.position;

import gpig.group2.maps.geographic.Point;
import gpig.group2.maps.geographic.Position;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 19/05/2016.
 */

@XmlRootElement(name="bounding-box")
public class BoundingBox extends Position {

    @XmlElement(name="topleft")
    private Point topLeft;

    @XmlElement(name="topright")
    private Point bottomRight;
}
