package ThucHanh2;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandler {
    public boolean writeData(String data, String fileName) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(data.getBytes());
            return true;
        } catch (IOException e) {
            throw e;
        }
    }
}
