import People.AddToFile;
import People.PeopleClass;
import People.ReadingFile;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        PeopleClass peopleData = new PeopleClass("Bogdan", "Bukhalikhin", 2001, "Vladivostock");
        new AddToFile(peopleData, "people.ser");
        new ReadingFile("people.ser");
        PeopleClass personData1 = new PeopleClass("Alexander", "Kosilov", 2045, "Moscow");
        new AddToFile(personData1, "people.ser");
        new ReadingFile("people.ser");

        System.out.print(peopleData.getAddress());
        peopleData.setAddress("Kostroma");
        System.out.print(peopleData.getAddress());
        new AddToFile(peopleData, "people.ser");
        new ReadingFile("people.ser");
    }
}