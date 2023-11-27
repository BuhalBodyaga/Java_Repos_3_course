package People;
import java.io.*;
public class ReadingFile {
    public ReadingFile(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        PeopleClass peopleData = (PeopleClass) objectInputStream.readObject();
        System.out.println(peopleData);
    }
}
