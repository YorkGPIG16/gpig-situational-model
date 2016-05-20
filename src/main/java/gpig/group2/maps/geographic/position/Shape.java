package gpig.group2.maps.geographic.position;

import gpig.group2.maps.geographic.Point;
import gpig.group2.maps.geographic.Position;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by james on 19/05/2016.
 */

@XmlRootElement(name="shape")

public class Shape extends Position {
    @XmlElement(name="coordinate")
    protected List<Point> coordinates;
}
