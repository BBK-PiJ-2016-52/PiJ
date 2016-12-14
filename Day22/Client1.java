import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.Remote;
import java.rmi.NotBoundException;

class Client1 {
	
	public static void main(String[] args) {
		Client1 launcher = new Client1();
		launcher.launch();
	}

	private void launch() {
		try {
	String registryAddress = "127.0.0.1";
	Remote service = Naming.lookup("//" + registryAddress + ":1099/echo");
	EchoService echoService = (EchoService) service;

	// Send Hello to the server and then receive it back by displaying it.
	String receivedEcho = echoService.echo("Hello!");
	System.out.println(receivedEcho);

			} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		} catch (NotBoundException ex) {
			ex.printStackTrace();
		}
	}
}