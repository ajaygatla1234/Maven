import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DeptDataReader {

    public static void main(String[] args) {

        try {
            // Establish a connection to the MySQL database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");

            // Create a PreparedStatement to execute SQL queries
            PreparedStatement preparedStatement = conn.prepareStatement("select * from dept");

            // Execute the query and obtain the ResultSet
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Dept No \t\t Dept Name \t\t Location\n");

            // Iterate through the ResultSet and print the results
            while (resultSet.next()) {
                int deptno = resultSet.getInt("deptno");
                String dname = resultSet.getString("dname");
                String location = resultSet.getString("loc");
                System.out.println(deptno + "\t\t" + dname + "\t\t" + location);
            }
        } catch (Exception e) {
            // Handle any exceptions that might occur during database operations
            System.err.println(e.getMessage());
        }
    }
}
