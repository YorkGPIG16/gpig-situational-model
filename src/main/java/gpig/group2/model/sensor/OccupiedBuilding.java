package gpig.group2.model.sensor;

import org.joda.time.DateTime;

import gpig.group2.maps.geographic.Point;

public class OccupiedBuilding {

	private Point location;
	private int estimatedOccupancy;
	private DateTime timeIdentified;

	public OccupiedBuilding(Point location, int estimatedOccupancy, DateTime timeIdentified) {
		super();
		this.location = location;
		this.estimatedOccupancy = estimatedOccupancy;
		this.timeIdentified = timeIdentified;
	}

	public Point getLocation() {

		return location;
	}

	public void setLocation(Point location) {

		this.location = location;
	}

	public int getEstimatedOccupancy() {

		return estimatedOccupancy;
	}

	public void setEstimatedOccupancy(int estimatedOccupancy) {

		this.estimatedOccupancy = estimatedOccupancy;
	}

	public DateTime getTimeIdentified() {

		return timeIdentified;
	}

	public void setTimeIdentified(DateTime timeIdentified) {

		this.timeIdentified = timeIdentified;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + estimatedOccupancy;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((timeIdentified == null) ? 0 : timeIdentified.hashCode());
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
		OccupiedBuilding other = (OccupiedBuilding) obj;
		if (estimatedOccupancy != other.estimatedOccupancy)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (timeIdentified == null) {
			if (other.timeIdentified != null)
				return false;
		} else if (!timeIdentified.equals(other.timeIdentified))
			return false;
		return true;
	}
}
