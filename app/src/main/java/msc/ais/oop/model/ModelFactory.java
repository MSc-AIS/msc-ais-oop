package msc.ais.oop.model;

import com.helger.commons.datetime.PDTFactory;
import com.helger.commons.mime.CMimeType;
import eu.toop.edm.EDMRequest;
import eu.toop.edm.model.*;

import java.time.Month;
import java.util.Locale;

/**
 * @author Konstantinos Raptis [kraptis at unipi.gr] on 11/6/21.
 * @author Stavros Labrinos [stalab at linuxmail.org] on 11/6/21.
 */
public class ModelFactory {

    public static EDMRequest createBirthCertRequest() {

        return EDMRequest.builderDocumentsByDistribution()
            .randomID()
            .issueDateTimeNow()
            .procedure(Locale.ENGLISH, "University Student Enrollment")
            .datasetIdentifier("BIRTH_CERTIFICATE_TYPE")
            .dataConsumer(AgentPojo.builder()
                .name("University of Piraeus")
                .id("730757727")
                .idSchemeID(EToopIdentifierType.VATREGISTRATION)
                .address(AddressPojo.builder()
                    .fullAddress("Karaoli k Dimitriou 80")
                    .streetName("Karaoli k Dimitriou")
                    .buildingNumber("15") // Should be 80, but according to guidelines it is 15
                    .postalCode("18534")
                    .town("Piraeus")
                    .countryCode("GR")
                    .build())
                .build())
            .dataSubject(PersonPojo.builder()
                .id("GR/GR/12345678")
                .idSchemeID(EToopIdentifierType.EIDAS)
                .familyName("Petrou")
                .givenName("Petros")
                .genderCode(EToopGenderCode.M)
                .birthName("Petros Petrou")
                .birthDate(PDTFactory.createLocalDate(2000, Month.JANUARY, 1))
                .birthTown("Athens")
                .address(AddressPojo.builder()
                    .fullAddress("Od. Androutsoy 150")
                    .streetName("Od. Androutsou")
                    .buildingNumber("150")
                    .town("Piraeus")
                    .countryCode("GR")
                    .postalCode("18534")
                    .build())
                .build())
            .authorizedRepresentative(PersonPojo.builder()
                .id("GR/GR/87654321")
                .idSchemeID(EToopIdentifierType.EIDAS)
                .familyName("Dimitriou")
                .givenName("Dimitrios")
                .genderCode(EToopGenderCode.M)
                .birthName("Dimitrios Dimitriou")
                .birthDate(PDTFactory.createLocalDate(1980, Month.FEBRUARY, 2))
                .birthTown("Athens")
                .address(AddressPojo.builder()
                    .fullAddress("Od. Androutsoy 150")
                    .streetName("Od. Androutsou")
                    .buildingNumber("150")
                    .postalCode("18534")
                    .town("Piraeus")
                    .countryCode("GR")
                    .build())
                .build())
            .distribution(DistributionPojo.builder()
                .format(EToopDistributionFormat.UNSTRUCTURED)
                .mediaType(CMimeType.APPLICATION_PDF)
                .build())
            .build();
    }

    public static EDMRequest createTaxClearanceCertRequest() {

        return EDMRequest.builderDocumentsByDistribution()
            .randomID()
            .issueDateTimeNow()
            .procedure(Locale.ENGLISH, "eProcurement Procedure")
            .datasetIdentifier("TAX_CLEARANCE_CERTIFICATE_TYPE")
            .dataConsumer(AgentPojo.builder()
                .name("University of Piraeus")
                .id("730757727")
                .idSchemeID(EToopIdentifierType.VATREGISTRATION)
                .address(AddressPojo.builder()
                    .fullAddress("Karaoli k Dimitriou 80")
                    .streetName("Karaoli k Dimitriou")
                    .buildingNumber("15") // Should be 80, but according to guidelines it is 15
                    .town("Piraeus")
                    .countryCode("GR")
                    .postalCode("18534")
                    .build())
                .build())
            .dataSubject(BusinessPojo.builder()
                .id("GR/GR/78945612")
                .idSchemeID(EToopIdentifierType.EIDAS)
                .legalID("543210000")
                .legalIDSchemeID(EToopIdentifierType.VATREGISTRATION)
                .legalName("Perakis Ltd")
                .address(AddressPojo.builder()
                    .fullAddress("Od. Androutsou 150")
                    .streetName("Od. Androutsou")
                    .buildingNumber("150")
                    .town("Piraeus")
                    .countryCode("GR")
                    .postalCode("18534")
                    .build())
                .build())
            .authorizedRepresentative(PersonPojo.builder()
                .id("GR/GR/87654321")
                .idSchemeID(EToopIdentifierType.EIDAS)
                .familyName("Dimitriou")
                .givenName("Dimitrios")
                .genderCode(EToopGenderCode.M)
                .birthName("Dimitrios Dimitriou")
                .birthDate(PDTFactory.createLocalDate(1980, Month.FEBRUARY, 2))
                .birthTown("Athens")
                .address(AddressPojo.builder()
                    .fullAddress("Od. Androutsoy 150")
                    .streetName("Od. Androutsou")
                    .buildingNumber("150")
                    .town("Piraeus")
                    .countryCode("GR")
                    .postalCode("18534")
                    .build())
                .build())
            .distribution(DistributionPojo.builder()
                .format(EToopDistributionFormat.UNSTRUCTURED)
                .mediaType(CMimeType.APPLICATION_PDF)
                .build())
            .build();
    }

}
