import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("kowser.txt");
		try {
			file.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		while(true) {
			InputStream inputStream;
			try {
				URL url = new URL("http://localhost/xampp/");
				URLConnection connection = url.openConnection();
				inputStream = connection.getInputStream();
				throw new Exception("simple exception");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
