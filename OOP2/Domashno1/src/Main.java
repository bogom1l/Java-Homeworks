package bg.tu_varna.sit.a3.f21621547;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) {
        FileCreator fileCreator = new FileCreator();

        TextFile textFile = new TextFile("myTextFile.txt", "HelloWorld! 123 test 456");
        fileCreator.addFile(textFile);

        MetadataFile metadataFile = new MetadataFile("myMetadataFile.txt", "Ivan Vazov");
        fileCreator.addFile(metadataFile);

        try {
            Path baseDir = Paths.get("./");
            Files.createDirectories(baseDir);

            Path metaDir = Paths.get("./meta/");
            Files.createDirectories(metaDir);
        } catch (IOException e) {
            LocalErrors localErrors = new LocalErrors();
            localErrors.saveError(e);
        }

        fileCreator.createFiles();
    }
}