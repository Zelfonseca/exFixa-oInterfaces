package entities;

import java.time.LocalDate;


public class Installment {
	
	//Atributos========================
	private LocalDate date;
	private Double amount;
	
	
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
	
	
	
	

}
