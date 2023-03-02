package bg.tu_varna.sit.a3.f21621547;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCreator {
    private List<IFile> files = new ArrayList<>();

    public void addFile(IFile file) {
        files.add(file);
    }

    public void createFiles() {
        for (IFile file : files) {
            try {
                file.create();
            } catch (IOException e) {
                LocalErrors localErrors = new LocalErrors();
                localErrors.saveError(e);
            }
        }
    }
}
