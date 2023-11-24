package pr1;
import java.util.Scanner;
public class kamata {

	public static void main(String[] args) {
		Scanner tastatura=new Scanner(System.in);
		System.out.println("Vnesi niza");
		int size=tastatura.nextInt();
		int [] n=new int[size];
		System.out.println("Vnesi " + size + " broevi:");
		for(int i=1;i<size;i++) {
			n[i]=tastatura.nextInt();
			if(n[i]%7==0 && n[i]%4==0){
			System.out.println(n[i]);
		}}
}}
