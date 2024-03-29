package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Installment {
	
	
	
	
	//Atributos========================
	private LocalDate date;
	private Double amount;
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy");// linha inserida para formatar o "toString"
	
	//Construtores=================================
	public Installment() {
		
	}
	
	public Installment(LocalDate date, Double amount) {
		this.date = date;
		this.amount = amount;
	}


	//Get and Set===================================
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	//toString===================
	@Override
	public String toString() {
		return  date.format(fmt) + " - " + String.format("%.2f", amount);
	}
	
	
	
	

}
