import java.util.Scanner;
import java.lang.String;
public class tablice {
	public static void main(String[] args){
		int [][] tablica = new int [2][3];
		int zm=0;
		for(int i=0; i<tablica.length; i++){
			for(int j=0;j<tablica[i].length;j++){
				tablica[i][j]=zm;
				zm++;
				System.out.print(tablica.length+"\n");
				System.out.print(tablica[i].length+"\n");
				System.out.print(tablica[i][j]+"\n");
			}
		}
	}
}
