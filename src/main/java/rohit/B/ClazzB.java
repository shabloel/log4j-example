package rohit.B;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClazzB {

	private static Logger logger = LogManager.getLogger(ClazzB.class);
	
	public void doIt( ) {
		logger.info("ClazzB do");
	}
	
}
