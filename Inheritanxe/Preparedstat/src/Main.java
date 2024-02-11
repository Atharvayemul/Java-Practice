import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username ="root";
        String password = "Atharva@123";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

//            int rowsdelte = statement.executeUpdate("DELETE FROM students where idStudents=3");
//
//            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO students(idStudents,Name,Age) VALUES(?,?,?)");
//            preparedStatement.setInt(1,8);
//            preparedStatement.setString(2,"Uma-ng");
//            preparedStatement.setInt(3,60);
//            int rowsaffted = preparedStatement.executeUpdate();
//            System.out.println(rowsaffted);



            ResultSet resultSet = statement.executeQuery("SELECT * from students");
            System.out.println(resultSet);
            while (resultSet.next())
            {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3));
            }

            CallableStatement callableStatement = connection.prepareCall("{call empname(?,?)}");
            callableStatement.setInt(1,1);
            callableStatement.registerOutParameter(2,Types.VARCHAR);
            callableStatement.execute();
            String name = callableStatement.getString(2);
            System.out.println(name);
            callableStatement.close();

            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            System.out.println(resultSetMetaData.getColumnCount());
           





            connection.close();



        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}