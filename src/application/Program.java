package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Criando um objeto "DateTimeFormatter" para formatar a data que será ser digitada.
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy");
		
		System.out.println("Entre com os dados do contrato:");
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		//os dados acima se referem ao contrato, por isso abaixo vou criar o objeto contrato abaixo com os dados do construtor
		Contract contract = new Contract(number, date, totalValue);
				//no esquema no lugar do contract está 'obj'
		
		System.out.println();
		System.out.print("Entre com o número de parcelas: ");
		int parcelas = sc.nextInt();
		System.out.println("Parcelas:");
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}
}
