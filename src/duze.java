import java.math.BigInteger;
import java.util.Scanner;
import java.lang.String;
public class duze {
	public static void main(String[] args){
		System.out.print("Podaj du¿¹ liczbê: \n");
		Scanner a= new Scanner(System.in);
		String liczba_1=a.nextLine();
		BigInteger licz_1= new BigInteger(liczba_1);
		System.out.print("Podaj drug¹ du¿¹ liczbê: \n");
		Scanner b= new Scanner(System.in);
		String liczba_2=b.nextLine();
		BigInteger licz_2= new BigInteger(liczba_2);
		System.out.print("Wynik dodawania du¿ych liczb to: "+(licz_1.add(licz_2)));
	}
}
