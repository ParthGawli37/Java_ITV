package iostream;

import java.io.*;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException  {
		
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader("config.txt"));
			String line;
		
			while((line=br.readLine())!=null) {
				System.out.println(line);
		}
			System.out.println("File content read completely");
			br.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
