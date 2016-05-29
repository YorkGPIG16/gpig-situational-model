package gpig.group2.model.collection;

import gpig.group2.model.sensor.StrandedPerson;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

/**
 * Created by james on 29/05/2016.
 */
@XmlRootElement(name="StrandedPersonCollection")
public class StrandedPersonCollection {


    @XmlElement(name="StrandedPerson")
    public Set<StrandedPerson> strandedPersons;
}
