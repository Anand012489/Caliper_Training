package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class COnnectingSQL {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/mydb"; // Here I am just using Example of the database URL
        String username = "your_username";
        String password = "your_password";

        try {
            //Here I am Loading the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Now I have to Establish a connection
            Connection connection = DriverManager.getConnection(url, username, password);

            //Here I am Creating a statement
            Statement statement = connection.createStatement();

            // Its time to execute a query
            String query = "SELECT * FROM employees";
            ResultSet resultSet = statement.executeQuery(query);

            // here now I am processing the results
            while (resultSet.next()) {
                int empId = resultSet.getInt("employee_id");
                String empName = resultSet.getString("employee_name");
                System.out.println("Employee ID: " + empId + ", Name: " + empName);
            }

            // Now finally i Clean up the resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
