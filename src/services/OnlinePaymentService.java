package services;

public interface OnlinePaymentService {
	
	// essa classe só possui métodos
	
		double paymentFee(double amount);
		
		double interest(double amount, int months);

}
