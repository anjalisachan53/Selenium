package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerDemo {

	static Logger logger = LogManager.getLogger(LoggerDemo.class);
	
	public static void main(String[] args) {
		System.out.println("\n Hello... \n");
		
		logger.info("This is a info message");
		
		System.out.println("\n Completed");
	}
}
