import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class XMLHandler<T> {
    private final Class<T> type;
    private File file;

    public XMLHandler(Class<T> type) {
        this.type = type;
    }

    public void open(String filePath) throws IOException {
        file = new File(filePath);
        if (!file.exists()) {
            throw new IOException("File does not exist.");
        }
    }

    public void close() {
        file = null;
    }

    public T read() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(type);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        T object = (T) unmarshaller.unmarshal(file);
        return object;
    }

    public void save(T object) throws JAXBException, IOException {
        JAXBContext jaxbContext = JAXBContext.newInstance(type);
        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        FileOutputStream fos = new FileOutputStream(file);
        marshaller.marshal(object, fos);

        fos.close();
    }
}
