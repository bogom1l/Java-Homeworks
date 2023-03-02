package bg.tu_varna.sit.a3.f21621547;

import java.io.FileWriter;
import java.io.IOException;

class TextFile implements IFile {
    private String filename;
    private String content;

    public TextFile(String filename, String content) {
        this.filename = filename;
        this.content = content;
    }

    @Override
    public void create() throws IOException {
        String filePath = "./" + filename;
        FileWriter writer = new FileWriter(filePath);
        writer.write(content);
        writer.close();
    }
}

