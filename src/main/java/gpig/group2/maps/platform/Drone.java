package gpig.group2.maps.platform;

import gpig.group2.maps.geographic.Point;
import gpig.group2.maps.geographic.position.CoordinateList;

import java.util.HashSet;
import java.util.Set;

public class Drone implements DroneUpdating {

	Set<GivesObjectives> subscribesToObjectives;

	private int id;
	private CoordinateList waypoints;
	private CoordinateList history;
	private Point position;

	public Drone() {
		subscribesToObjectives = new HashSet<>();

		waypoints = new CoordinateList();
		history = new CoordinateList();
		position = null;

	}

	public void addSubscriptionToObjective(GivesObjectives layer) {

		subscribesToObjectives.add(layer);
	}

	@Override
	public void updateLocation(Point newPosition) {

		position = newPosition;
		history.addCoordinate(position);

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

	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Drone other = (Drone) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
