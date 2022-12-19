package rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Reader {
	
	public static String configReader(String key) {
		Properties config = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./src/test/resources/properties/config.properties");
		} catch (FileNotFoundException e) {

		}
		try {
			config.load(fis);
		} catch (IOException e) {

		}

		return (config.getProperty(key));
	}

}
