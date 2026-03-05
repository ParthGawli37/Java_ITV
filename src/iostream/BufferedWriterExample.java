package iostream;

import java.io.*;

public class BufferedWriterExample {

	public static void main(String[] args) {
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt",true));
			bw.write("\nAutomation executed started\n");
			bw.write("Test case 1 passed.\n");
			bw.write("Test case 2 fialed.");
			bw.close();
			System.out.println("content written to file successfully.");
		

	} catch (IOException e) {
		e.printStackTrace();
	}

}
	
}
