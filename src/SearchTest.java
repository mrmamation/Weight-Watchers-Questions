import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SearchTest {
	@Test
	public void TestObjectCreation() throws FileNotFoundException {
			Dictionary dict = new Dictionary("bob.txt");
	}
	
	@Test(expected = FileNotFoundException.class)
	public void testFileNotFound() throws FileNotFoundException {
			Dictionary dict = new Dictionary("notfound.txt");
	}
	
	@Test
	public void testPrintDefinition() throws FileNotFoundException, IOException {
		Dictionary dict = new Dictionary("bob.txt");
		dict.PrintDefinitions();
	}
}
