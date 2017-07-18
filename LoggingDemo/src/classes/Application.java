package classes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

	private static Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		logger.trace("I am inside Application main method !!!");
		logger.debug("I am inside Application main method !!!");
		logger.info("I am inside Application main method !!!");
		logger.warn("I am inside Application main method !!!");
		logger.error("I am inside Application main method !!!");
	}
}
