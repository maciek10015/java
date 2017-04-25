import java.util.Scanner;
import java.lang.String;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class foreach {
	public static void main(String[] args) throws FileNotFoundException {
		int licz=1;
		File plik = new File("ala.txt");
		Scanner ada = new Scanner(plik);
		PrintWriter nada = new PrintWriter("ala.txt");
		Scanner increment = new Scanner(System.in);
		Scanner value = new Scanner(System.in);
		System.out.print("Podaj wielkoœæ tablicy\n");
		int zm = increment.nextInt();
		String [] tablica = new String[zm];
		for(int i=0; i<tablica.length; i++){
			System.out.printf("Podaj wartoœæ dla elementu nr %d\n", (i+1));
			tablica[i]=value.nextLine();
			nada.print(tablica[i]+":");
			
		}
		nada.close();
		System.out.print("Zapisano do pliku\n");
		String [] wczytanie = (ada.nextLine()).split(":");
		System.out.print("Teraz zadzia³a pentla foreach\n");
		for(String x:wczytanie){
			
			System.out.printf("Elemet %d to: %s\n",licz,x);
			licz++;
		}
	}
}
