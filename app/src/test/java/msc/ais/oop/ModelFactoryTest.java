package msc.ais.oop;

import com.helger.commons.state.ESuccess;
import eu.toop.edm.EDMRequest;
import msc.ais.oop.model.ModelFactory;
import org.apache.commons.lang3.SystemUtils;
import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author Konstantinos Raptis [kraptis at unipi.gr] on 11/6/21.
 * @author Stavros Labrinos [stalab at linuxmail.org] on 11/6/21.
 */
public class ModelFactoryTest {

    @Test
    public void testCreateBirthCertRequest() {

        EDMRequest request = ModelFactory.createBirthCertRequest();

        // export EDM request as String
        String requestXML = request.getWriter().getAsString();

        // Print to console
        System.out.println(requestXML);

        // Export file to Downloads folder
        String fileName = "birthCertRequest.xml";
        exportFile(fileName, request);
    }

    @Test
    public void testCreateTaxClearanceCertRequest() {

        EDMRequest request = ModelFactory.createTaxClearanceCertRequest();

        // export EDM request as String
        String requestXML = request.getWriter().getAsString();

        // Print to console
        System.out.println(requestXML);

        // Export file to Downloads folder
        String fileName = "taxClearanceCertRequest.xml";
        exportFile(fileName, request);
    }

    private void exportFile(String fileName, EDMRequest request) {

        String path = SystemUtils.getUserHome() + "/Downloads/" + fileName;
        ESuccess result = request.getWriter().write(new File(path));
        if (result.isSuccess()) {
            System.out.println("XML File exported successfully to: " + path);
        } else {
            System.out.println("Error... XML File failed to be exported to: " + path);
        }
    }
}
