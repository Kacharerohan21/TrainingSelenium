package Log4j2Tutorial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import sun.util.logging.resources.logging;

public class Loggingdemo {

	private static final Logger log=LogManager.getLogger(Loggingdemo.class.getClass());
	
	public static void main(String[] args) {
	log.debug("Debug Message Logged");
	log.error("Error Message Logged");
	log.fatal("Fatal Message Logged");
	}

}
