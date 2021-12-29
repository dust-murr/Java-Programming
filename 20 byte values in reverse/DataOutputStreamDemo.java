import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {

	public static void main(String[] args){
		try {
			
		try(DataOutputStream output = new DataOutputStream(new FileOutputStream("temp2.dat"));) {
			output.writeUTF("Wednesday");
			output.writeInt(1);
			
			output.writeUTF("Thursday");
			output.writeInt(2);
			
			output.writeUTF("Friday");
			output.writeInt(3);
			
			output.writeUTF("Saturday");
			output.writeInt(4);
			
			output.writeUTF("Sunday");
			output.writeInt(5);
			
			output.writeUTF("Monday");
			output.writeInt(6);
			
			output.writeUTF("Tuesday");
			output.writeInt(7);
		}
		
		try(DataInputStream input = new DataInputStream(new FileInputStream("temp2.dat"));) {
			System.out.println(input.readUTF() + " " + input.readInt());
			System.out.println(input.readUTF() + " " + input.readInt());
			System.out.println(input.readUTF() + " " + input.readInt());
			System.out.println(input.readUTF() + " " + input.readInt());
			System.out.println(input.readUTF() + " " + input.readInt());
			System.out.println(input.readUTF() + " " + input.readInt());
			System.out.println(input.readUTF() + " " + input.readInt());
			System.out.println(input.readUTF() + " " + input.readInt());
		}
	}
		catch (EOFException ex) {
			System.out.println("All data was read");
		}
		
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
