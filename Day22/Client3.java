import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.Remote;
import java.rmi.NotBoundException;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

class Client3 {
	
	public static void main(String[] args) {
		Client3 launcher = new Client3();
		launcher.launch();
	}

	private void launch() {
		try {
	String registryAddress = "127.0.0.1";
	Remote service = Naming.lookup("//" + registryAddress + ":1099/echo");
	EchoService echoService = (EchoService) service;

	//Showing the whole complete list of items that the package calendar has, currently deprecated
	Calendar rightNow = Calendar.getInstance();
	System.out.println(rightNow);

	//Using the most recent way to get the current time
	LocalDateTime currentTime = LocalDateTime.now();
	System.out.println("Current DateTime: " + currentTime);

			} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		} catch (NotBoundException ex) {
			ex.printStackTrace();
		}
	}
}