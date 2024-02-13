package services;

import entities.Contract;

public class ContractService {
	
	//Atributo=======================
	private OnlinePaymentService onlinePaymentService;

	
	//Construtor======================================
	public ContractService(OnlinePaymentService onlinePaymentService) {
		super();
		this.onlinePaymentService = onlinePaymentService;
	}

	
	//Método==========================
	public void processContract(Contract contract, int months){
		
	}
	
	
	
}
