import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class binary {
	public static void main(String[] args) throws FileNotFoundException{
		DataOutputStream strumien = null;
		DataInputStream strum = null;
		int iloscSczytanychBajtow = 0;
		try {
			strumien = new DataOutputStream(new FileOutputStream("ala.txt"));
			strum = new DataInputStream(new FileInputStream("ala.txt"));
		} catch(FileNotFoundException e){
			System.out.println("Nie znaleziono pliku");
		}
		
		try {
			strumien.writeUTF("Maciek");
			strumien.writeInt(2014);
			strumien.writeDouble(50/4);
            while (strum.read() != -1)
                iloscSczytanychBajtow++;
		} catch (IOException e){
			System.out.print("B³¹d");
		}
		try {
			strumien.close();
		} catch (IOException e){
			System.out.print("B³¹d");
		}
		System.out.println("Iloœæ bajtów wynosi: " + iloscSczytanychBajtow);
	}
}
