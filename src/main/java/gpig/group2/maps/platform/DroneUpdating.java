package gpig.group2.maps.platform;

import gpig.group2.maps.geographic.Coordinate;
import gpig.group2.maps.geographic.position.Point;

/**
 * Created by james on 20/05/2016.
 */
public interface DroneUpdating {
     void updateLocation(Point newPosition);
}
