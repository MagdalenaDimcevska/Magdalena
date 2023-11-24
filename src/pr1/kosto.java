package pr1;
import java.util.Scanner;
public class kosto {

	public static void main(String[] args) {
		Scanner tastatura=new Scanner(System.in);
		int k=tastatura.nextInt();
		int a=100,b=40;
		if(k<a && k>b)
		{
			System.out.println("Kosto e vozrasen covek");
		}
		else if(k<b && k>10)
			System.out.println("Kosto e mlad covek");
	
	else if (k>0 && k<10)
		System.out.println("Kosto e bebe");
	else 
		System.out.println("Kosto e prestar covek");

	}
	
	
}
