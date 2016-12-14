import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.RemoteException;

public class EchoServerLauncher{

	private void launch() {
		try {
// 1. Create the registry if there is not one
			LocateRegistry.createRegistry(1099);
// 2. Create the server object
			EchoServer server = new EchoServer();
// 3. Register (bind) the server object on the registy.
// The registry may be on a different machine
			String registryAddress = "localhost";
			String registryUrl = "//" + registryAddress + "/";
			String serviceName = "echo";
			Naming.rebind(registryUrl + serviceName, server);
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		}
	}
}