package bg.tu_varna.sit.a3.f21621547;

import java.io.FileWriter;
import java.io.IOException;

class MetadataFile implements IFile {
    private String filename;
    private String author;

    public MetadataFile(String filename, String author) {
        this.filename = filename;
        this.author = author;
    }

    @Override
    public void create() throws IOException {
        String filePath = "./meta/" + filename;
        FileWriter writer = new FileWriter(filePath);
        writer.write("Author: " + author);
        writer.close();
    }
}
