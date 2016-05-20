package gpig.group2.maps.platform;

import gpig.group2.maps.geographic.Point;
import gpig.group2.maps.geographic.position.CoordinateList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by james on 19/05/2016.
 */
public class Drone implements DroneUpdating {

    Set<GivesObjectives> subscribesToObjectives;


    CoordinateList waypoints;
    CoordinateList history;
    Point position;


    public Drone() {
        subscribesToObjectives = new HashSet<>();

        waypoints = new CoordinateList();
        history = new CoordinateList();
        position = new Point();
    }

    public void addSubscriptionToObjective(GivesObjectives layer) {
        subscribesToObjectives.add(layer);
    }

    @Override
    public void updateLocation(Point newPosition) {
        history.addCoordinate(position);
        position = newPosition;

    }
}
