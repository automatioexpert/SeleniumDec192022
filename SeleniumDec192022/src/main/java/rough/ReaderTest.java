package rough;

public class ReaderTest {

	public static void main(String[] args) {
		

		String browser=Reader.configReader("browser");
		System.out.println(browser);
		
		String url=Reader.configReader("url");
		System.out.println(url);

	}

}
