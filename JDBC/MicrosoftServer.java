package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MicrosoftServer {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=mydb"; // I am using example url of SQL Servver Database
        String username = "your_username";
        String password = "your_password";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM orders";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int orderId = resultSet.getInt("order_id");
                String orderDate = resultSet.getString("order_date");
                System.out.println("Order ID: " + orderId + ", Date: " + orderDate);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

