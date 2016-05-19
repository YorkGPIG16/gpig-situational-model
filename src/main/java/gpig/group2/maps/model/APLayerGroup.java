package gpig.group2.maps.model;

/**
 * Created by james on 19/05/2016.
 */
public class APLayerGroup extends LayerGroup {



    public APLayerGroup(AutonomousPlatform platform) {

        this.layers.add(new APObjectivesLayer());
        this.layers.add(new APStatusReportingLayer());
    }
}
