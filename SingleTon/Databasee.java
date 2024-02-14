package SingleTon;

public class Databasee {
    // The single instance of the database
    private static Databasee instance;
    
    // The private constructor that creates the connection
    private Databasee() {
      
    }
    
    // The public static method that returns the single instance of the database
    public static Databasee getInstance() {
      // Create the instance if it does not exist
      if (instance == null) {
        instance = new Databasee();
      }
      // Return the instance
      return instance;
    }
    
    // The methods to access the database
    public ResultSet executeQuery(String query) {
      // Code to execute a query and return the result set
    }
    
    public int updateData(String query) {
    }
    
    public void closeConnection() {
    }
    
    
  }
  
