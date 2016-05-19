package gpig.group2.maps.platform;

import gpig.group2.maps.objective.ObjectivesLayer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by james on 19/05/2016.
 */
public class AutonomousPlatform {

    Set<ObjectivesLayer> subscribesToObjectives;


    public AutonomousPlatform() {
        subscribesToObjectives = new HashSet<>();
    }

    public void addSubscriptionToObjective(ObjectivesLayer layer) {
        subscribesToObjectives.add(layer);
    }
}
