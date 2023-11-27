package People;
import java.io.*;
public class AddToFile {
    public AddToFile(PeopleClass peopleData, String path) throws IOException {

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(peopleData); // сохраняем в файл
        objectOutputStream.close();                 // закрываем поток и освобождаем ресурсы
    }
}

