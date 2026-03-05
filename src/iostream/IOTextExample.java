package iostream;

import java.io.*;


public class IOTextExample {

	public static void main(String[] args) throws IOException {
		
		String str = "\n Hi this line is appended to the existing content.";
		try {
			FileOutputStream fos = new FileOutputStream("log.txt",true);
			fos.write(str.getBytes());
			System.out.println("File created and content written successfully.");
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
