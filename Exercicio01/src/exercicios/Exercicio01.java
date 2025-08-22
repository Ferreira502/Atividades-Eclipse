package exercicios;
import java.util.Scanner;

public class Exercicio01 
{
	public static void main (String[] args)
	{
		int a = 0;
		int b = 0;
		int resultado = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite valor de a: ");
		a = sc.nextInt();
		System.out.println("Digite valor de b: ");
		b = sc.nextInt();
		
		resultado = a + b;
		
		System.out.println("resultado: " + resultado);
				
	   
	}
}
