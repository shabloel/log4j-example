package rohit.A;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import rohit.MainApp;

public class ClazzA {
	
	private static Logger logger = LogManager.getLogger(ClazzA.class);
	
	public void doIt( ) {
		logger.info("ClazzA do");
	}

}
