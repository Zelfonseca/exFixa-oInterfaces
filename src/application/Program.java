package application;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		LocalDate d01 = LocalDate.now();
		
		System.out.println("Entre com os dados do contrato:");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.nextLine());
		System.out.print("Valor do contrato: ");
		double valor = sc.nextDouble();
		System.out.println();
		System.out.println("Entre com o número de parcelas: ");
		int parcelas = sc.nextInt();
		System.out.println("Parcelas:");
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}
}
