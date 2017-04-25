import java.util.Scanner;
import java.lang.String;
public class petle {
	public static void main(String[] args){
/*		String[] imie= new String[5];
		Scanner zm= new Scanner(System.in);
		for(int i=0; i<5; i++){
			System.out.print("Podaj imiê osoby nr."+(i+1)+"\n");
			imie[i]=zm.nextLine();
		}
		for(int i=0; i<5; i++){
			System.out.print("Witaj "+imie[i]+"\n");
		}
*/
		Scanner zm= new Scanner(System.in);
		Scanner zm_1= new Scanner(System.in);
		System.out.print("Podaj liczbê\n");
		int liczba=zm.nextInt();
		int[] tablica=new int[liczba];
		for(int i=0; i<liczba; i++){
			System.out.print("Podaj wartoœæ dla liczby "+(i+1)+"\n");
			tablica[i]=zm_1.nextInt();
		}
		int i=0;
		while(i<liczba){
			System.out.print("Wartoœæ dla liczby "+(i+1)+" to "+(tablica[i])+"\n");
			i++;
		}
	}
}
