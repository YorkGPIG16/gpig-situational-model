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
		result = prime * result + ((history == null) ? 0 : history.hashCode());
		result = prime * result + id;
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + ((waypoints == null) ? 0 : waypoints.hashCode());
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
		if (history == null) {
			if (other.history != null)
				return false;
		} else if (!history.equals(other.history))
			return false;
		if (id != other.id)
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (waypoints == null) {
			if (other.waypoints != null)
				return false;
		} else if (!waypoints.equals(other.waypoints))
			return false;
		return true;
	}
}
