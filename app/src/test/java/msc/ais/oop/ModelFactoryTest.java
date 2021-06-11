package msc.ais.oop;

import eu.toop.edm.EDMRequest;
import msc.ais.oop.model.ModelFactory;
import org.junit.jupiter.api.Test;

/**
 * @author Konstantinos Raptis [kraptis at unipi.gr] on 11/6/21.
 */
public class ModelFactoryTest {

    @Test
    public void testCreateBirthCertRequest() {

        EDMRequest request = ModelFactory.createBirthCertRequest();

        // export EDM request as String
        String requestXML = request.getWriter().getAsString();

        // Print to console
        System.out.println(requestXML);
    }

    @Test
    public void testCreateTaxClearanceCertRequest() {

        EDMRequest request = ModelFactory.createTaxClearanceCertRequest();

        // export EDM request as String
        String requestXML = request.getWriter().getAsString();

        // Print to console
        System.out.println(requestXML);
    }

}
