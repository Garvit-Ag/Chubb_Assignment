import java.io.*;

public class WithoutFP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "D:\\Eclipse\\13NovAssignment\\input.txt"; 

        int count = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");
                
                for (String word : words) {
                    if (word.equalsIgnoreCase("India")) {
                        count++;
                    }
                }
            }

            reader.close();

            System.out.println("The word 'India' appears " + count + " times in the file.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
	}

}
