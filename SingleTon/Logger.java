package SingleTon;

public class Logger {

   // This is single instance of the logger
  private static Logger instance;
  
  // It is the private constructor that initializes the logger
  private Logger() {}
  
  // The public static method that returns the single instance of the logger
  public static Logger getInstance() {
    //Now I am Creating the instance if it does not exist
    if (instance == null) {
      instance = new Logger();
    }
    return instance;
  }
  
  // Here are the methods to write different levels of messages
  public void info(String message) {}
  
  public void warn(String message) {}
  
  public void error(String message) {} 
}
