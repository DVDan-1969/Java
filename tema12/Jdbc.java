package tema12;
import java.sql.*;

public class Jdbc {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String password = "Elektroniker.1969";

        ResultSet result = null;
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database");

            //create statement
            Statement statement = connection.createStatement();
            String query =
                    "SELECT Name, Continent, Population " +
                            "FROM country " +
                            "WHERE Population > 100000000 " +
                            "ORDER BY Population DESC";
            result = statement.executeQuery(query);




            while (result.next()) {
                    String countryName = result.getString("Name");
                    String continent = result.getString("Continent");
                    long population = result.getLong("Population");

                    System.out.println(
                            countryName + " " +
                                    continent + " " +
                                    population
                    );

            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }
}




