import java.io.File;

public class Exercise3 {
	
	public static void main(String[] args){
		
		//String file = ".\\" + args[0];
		String file1 = args[0];
		System.out.println(file1);
		
		File file = new File(".");
		String[] files = file.list();
		for (int i = 0; i < files.length; i++){
			if(files[i].equals(file1)) {
				System.out.println("File " + file1 + " exists." );
			}
			System.out.println(files[i]);
		}
			
	}
	
}