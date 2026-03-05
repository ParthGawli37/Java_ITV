package enums;

enum Browser {
	CHROME,
	FIREFOX,
	EDGE
}
public class EnumExample {
	public static void main(String[] args) {
		launchBrowser(Browser.CHROME);
	}
	public static void launchBrowser(Browser browserName) {
		switch(browserName) {
		case CHROME:
			System.out.println("Launching Chrome Browser");
			break;
		case FIREFOX:
			System.out.println("Launching FireFox Browser");
			break;
		case EDGE:
			System.out.println("Launching Edge Browser");
			break;
		default:
			System.out.println("Invalid browser name");
		
		}
	}

}
