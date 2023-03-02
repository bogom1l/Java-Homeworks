package bg.tu_varna.sit.a3.f21621547;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LocalErrors {
    private static final String ERROR_FILE = "./LocalErrors.txt";

    public void saveError(Exception e) {
        try {
            File errorFile = new File(ERROR_FILE);
            FileWriter writer = new FileWriter(errorFile);
            writer.write(e.toString());
            writer.close();
        } catch (IOException ioException) {
            System.out.println("Error!!! -> " + ioException.getMessage());
        }
    }
}
