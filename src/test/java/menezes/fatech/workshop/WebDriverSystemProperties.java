package menezes.fatech.workshop;

public class WebDriverSystemProperties {
	
	
	public static void setWebDriverProperties(String osName) {
		if (osName.contains("Windows")) {
			setWindowsWebDriver();
		}else if( osName.contains("Mac")) {
			setMacWebDriver();
		}else {
			System.out.println("Dont have suport for this SO : " + osName);
			System.exit(1);
		}
	}
	
	private static void setWindowsWebDriver() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	}
	
	private static void setMacWebDriver() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
	}
}
