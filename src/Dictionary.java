import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Dictionary{
	private String dictionaryPath;	
	
	public Dictionary(String filePath) throws FileNotFoundException {
		if(! doesFileExist(filePath)) {
			throw new FileNotFoundException();
		}
		dictionaryPath = filePath;
	}
	
	private static boolean doesFileExist(String filePath) {
		Path path = FileSystems.getDefault().getPath(filePath);
		if (Files.exists(path)) {
			return true;
		}
		return false;
	}
	
	public void PrintDefinitions() throws FileNotFoundException, IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(dictionaryPath))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	//System.out.println(line);
		    	String[] parts = line.split("-");
		    	String part1 = parts[0];
		    	String part2 = parts[1];
		    	System.out.println(part1);
		    	String[] definitions = part2.split(",");
		    	
		    	for (int i = 0; i < definitions.length; i++) {
		    		System.out.println(definitions[i]);
		    	} 
		    }
		}
	}
	
}