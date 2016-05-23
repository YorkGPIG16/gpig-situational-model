package gpig.group2.maps.geographic.position;

import gpig.group2.maps.geographic.Point;
import gpig.group2.maps.geographic.Position;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 19/05/2016.
 */

@XmlRootElement(name="bounding-box")
public class BoundingBox extends Position {

    @XmlElement(name="topleft")
    protected Point topLeft;

    @XmlElement(name="topright")
    protected Point bottomRight;

    public BoundingBox() {

    }

    public BoundingBox(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Point getTopLeftX() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Point getBottomRightX() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }
}
