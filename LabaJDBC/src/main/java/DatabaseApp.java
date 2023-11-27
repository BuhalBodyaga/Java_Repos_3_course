import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseApp {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bogdan"; // Замените "yourdatabase" на имя вашей базы данных
        String user = "root"; // Замените "yourusername" на ваше имя пользователя
        String password = "312001312001b"; // Замените "yourpassword" на ваш пароль

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            // Создаем таблицу, если она не существует
            String createTableQuery = "CREATE TABLE IF NOT EXISTS ExampleTable (id INT PRIMARY KEY, name VARCHAR(255))";
            statement.executeUpdate(createTableQuery);

            // Вставляем данные
            String insertDataQuery = "INSERT INTO ExampleTable (id, name) VALUES (3, 'Johnb')";
            statement.executeUpdate(insertDataQuery);

            // Выполняем SELECT-запрос и выводим результат
            String selectDataQuery = "SELECT * FROM ExampleTable";
            ResultSet resultSet = statement.executeQuery(selectDataQuery);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
