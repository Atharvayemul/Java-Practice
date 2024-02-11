import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username ="root";
        String password ="Atharva@123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();


            int affected = statement.executeUpdate("INSERT INTO students(idStudents,Name,Age) VALUES(4,'Shivaji',50)");
            System.out.println(affected);

            boolean isresult = statement.execute("SELECT * FROM students");
            if (isresult)
            {
                ResultSet resultSet = statement.getResultSet();
            while (resultSet.next())
            {
                System.out.println(resultSet.getInt(1)+ " " + resultSet.getString(2) + " " + resultSet.getInt(3));
            }
            }
            else {
                int rowsafft = statement.getUpdateCount();
            }


            connection.close();

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}