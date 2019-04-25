package utilpack;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyDemo {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("config.properties");
		FileOutputStream fos = new FileOutputStream("copy.txt");
		int i = 0;
		byte b[] = new byte[4];
		while((i=fis.read(b)) != -1) {
			String s = new String(b,0,i);
			System.out.println(s);
			fos.write(b, 0 ,i);
		}
	}
}
