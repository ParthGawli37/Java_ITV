package iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOImageExample {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fis = new FileInputStream("image1.png");
			FileOutputStream fos = new FileOutputStream("image2.png");
		
			int data;
			while((data=fis.read())!=-1){
				fos.write(data);
			}
			System.out.println("Image copied successfully.");
			fis.close();
			fos.close();
		
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
