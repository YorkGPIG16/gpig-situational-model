package gpig.group2.maps.platform;

import java.util.HashSet;
import java.util.Set;

import gpig.group2.maps.geographic.position.CoordinateList;
import gpig.group2.maps.geographic.position.Point;

public class Drone implements DroneUpdating {

	Set<GivesObjectives> subscribesToObjectives;

	private CoordinateList waypoints;
	private CoordinateList history;
	private Point position;

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

	public CoordinateList getWaypoints() {
		return waypoints;
	}

	public void setWaypoints(CoordinateList waypoints) {
		this.waypoints = waypoints;
	}

	public CoordinateList getHistory() {
		return history;
	}

	public void setHistory(CoordinateList history) {
		this.history = history;
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}
}
