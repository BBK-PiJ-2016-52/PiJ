import java.io.File;
public class Exercise1 {
	
	public static void main(String[] args){
			
			// According to Stephen we should check if the list is null 
			//before trying to print out the elements 
			//(it isn't necessary if using the 2nd 'for' loop)
			
			File file = new File(".");
			String[] files = file.list();
			for (int i = 0; i < files.length; i++){
				System.out.println(files[i]);
			}
			
			/** Another way of going through the list of files
			for (String file1 : files){
				System.out.println(file1);
			}
			*/
	}
		
}