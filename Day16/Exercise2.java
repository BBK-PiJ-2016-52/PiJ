import java.io.IOException;
import java.io.File;

public class Exercise2{
	
	public static void main(String[] args){
		String nameOfFolder = ".\\" + args[0];
		System.out.println(nameOfFolder);
		File file = new File(nameOfFolder);
		// try {
			boolean result = file.mkdir();
			if (!result){
				System.out.println("File was not created.");
			}
		// }catch(ex){
		//	ex.printStackTrace();
		// }
	}
}