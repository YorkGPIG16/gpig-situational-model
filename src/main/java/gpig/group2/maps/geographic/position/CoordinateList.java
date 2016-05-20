package gpig.group2.maps.geographic.position;

import gpig.group2.maps.geographic.Coordinate;
import gpig.group2.maps.geographic.Position;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by james on 19/05/2016.
 */

@XmlRootElement(name="coordinate-list")
public class CoordinateList extends Position {

    @XmlElement(name="coordinate")
    protected List<Coordinate> coordinates;
}
