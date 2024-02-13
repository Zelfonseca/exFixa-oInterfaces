package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Contract {
	
	
	//Atributos=========================
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	
	//esse comando é devido que cada contrato tem várias parcelas, por isso a criação de uma lista da classe "Installment"
	private List<Installment> instalments = new ArrayList<>();
	
	//Construtores====================
	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}


	
	//Get and Set========================
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	
	public List<Installment> getInstallments(){
		return instalments;
	}
	
	/*public void setInstalments(List<Installment> instalments) {
		this.instalments = instalments;
	}*/
	//o SET Installment é retirado para não se correr o risco de se manipular as parcelas
	
	

}
