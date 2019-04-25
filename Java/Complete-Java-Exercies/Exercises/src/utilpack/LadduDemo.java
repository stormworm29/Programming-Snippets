package utilpack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class LadduDemo {
	public static void main(String[] args) throws Exception{
		WriteObject write = new WriteObject();
		write.write();
		
		ReadObject read = new ReadObject();
		read.read();
	}
}
class Laddu implements Serializable {
	int size;
	public Laddu(int size) {
		this.size = size;
	}
	public String toString() {
		return "size..:"+size;
	}
}
class WriteObject {
	public void write() throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("laddu.dat"));
		Laddu laddu = new Laddu(10);
		oos.writeObject(laddu);
		System.out.println("Object laddu's receipe is in laddu.dat : " + laddu.size);
	}
}

class ReadObject {
	public void read() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("laddu.dat"));
		Laddu laddu = (Laddu)ois.readObject();
		System.out.println("Object laddu's receipe retrived from laddu.dat : " + laddu.size);
		laddu.size = 1;
		System.out.println("Modified laddu receipe : " + laddu.size);
		ois = new ObjectInputStream(new FileInputStream("laddu.dat"));
		laddu = (Laddu)ois.readObject();
		System.out.println("Object laddu's receipe after time travel from laddu.dat : " + laddu.size);
		
		
		
	}
}