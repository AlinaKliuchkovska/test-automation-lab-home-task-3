package utils;

import model.RozetkaFilter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XMLToObject {
    public static RozetkaFilter readXMLToObject() {
        try {

            File file = new File("src/main/resources/rozetkaFilter.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(RozetkaFilter.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            return (RozetkaFilter) jaxbUnmarshaller.unmarshal(file);

        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }
}