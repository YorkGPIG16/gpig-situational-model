package gpig.group2.maps.geographic.position;

import gpig.group2.maps.geographic.Point;
import gpig.group2.maps.geographic.Position;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by james on 19/05/2016.
 */

@XmlRootElement(name="coordinate-list")
public class CoordinateList extends Position {

    public CoordinateList() {
        coordinates = new ArrayList<>();
    }

    @XmlElement(name="coordinate")
    protected List<Point> coordinates;

    public void addCoordinate(Point position) {
        coordinates.add(position);
    }

	public List<Point> getCoordinates() {
		return coordinates;
	}
}
