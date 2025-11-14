import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class WithFP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get("D:\\Eclipse\\13NovAssignment\\input.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        var wordsStream = lines.stream().map(a->a.toLowerCase()).map(line -> line.split("[^a-z]+"));   
        
        long count = wordsStream
                .flatMap(Arrays::stream)
                .filter(word -> word.equals("india"))
                .count();

        System.out.println("Total occurrences of 'India': " + count);
	}

}
