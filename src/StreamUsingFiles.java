import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamUsingFiles {

    String fileName;

    public StreamUsingFiles(){};

    public StreamUsingFiles(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void showStreamUsingFiles(String fName) {

        try (Stream<String> stream = Files.lines(Paths.get(fName))) {
            stream.forEach(System.out :: println);
        } catch(IOException io) {
            io.printStackTrace();
        }
    }

}
