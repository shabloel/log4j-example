package rohit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import rohit.A.ClazzA;
import rohit.B.ClazzB;

public class MainApp {

	private static Logger logger = LogManager.getLogger(MainApp.class);

	public static void main(String[] args) {
		logger.info("MainApp started");
		
		ClazzA a = new ClazzA();
		ClazzB b = new ClazzB();

		for (int i = 0; i < 1000000; i++) {
			logger.info("MainApp: Rolling file appender example...");
			a.doIt();
			b.doIt();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
