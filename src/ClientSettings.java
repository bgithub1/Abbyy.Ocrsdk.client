import java.net.*;
import java.util.Scanner;

/**
 * Authentication settings for Cloud OCR SDK client.

 * Please provide your application id and password here.
 */
public class ClientSettings {
	// Name of application you created
	public static String APPLICATION_ID = "";
	// Password should be sent to your e-mail after application was created
	public static String PASSWORD = "";
	
	public static void getAppIdPassword(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter APPLICATION_ID: ");
		ClientSettings.APPLICATION_ID = sc.nextLine();
		System.out.print("Enter PASSWORD: ");
		ClientSettings.PASSWORD = sc.nextLine();
		sc.close();		
	}
	
	public static void setupProxy()
	{
		// Uncomment this if you are behind a proxy
		/*
		String host = "";
		String port = "";
		final String user = "";
		final String password = "";

		Authenticator.setDefault(
			new Authenticator() {
		 		public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication( user, password.toCharArray());
				}
 			}
		);

		System.getProperties().put("http.proxyHost", host );
		System.getProperties().put("https.proxyHost", host );
		System.getProperties().put("http.proxyPort", port);
		System.getProperties().put("https.proxyPort", port);
		System.getProperties().put("http.proxyUser", user);
		System.getProperties().put("https.proxyUser", user);
		System.getProperties().put("http.proxyPassword", password);
		System.getProperties().put("https.proxyPassword", password);
		*/
	}
}
