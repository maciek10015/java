import java.math.BigInteger;
import java.util.Scanner;
import java.lang.String;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Hello {
	public static void main(String[] args) throws FileNotFoundException{
		File plik= new File("ala.txt");
		Scanner odczyt= new Scanner(plik);
		String zdanie=odczyt.nextLine();
		System.out.print(zdanie);
		System.out.print("\nCzy chcesz zmienic to zdanie?\n");
		Scanner odczyt_1= new Scanner(System.in);
		String zm= odczyt_1.nextLine();
		
		if(zm.equals("tak")) {
			System.out.print("\nPodaj nowe zdanie\n");
			Scanner odczyt_2=new Scanner(System.in);
			String zdanie_1=odczyt_2.nextLine();
			PrintWriter zapis= new PrintWriter("ala.txt");
			zapis.println(zdanie_1);
			zapis.close();
			System.out.print("\nZapisa³em zdanie: \""+zdanie_1+"\"");
		}
		else{
			System.out.print("Nic nie zmieniam");
		}
	}
}