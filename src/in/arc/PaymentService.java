package in.arc;

public class PaymentService {

	private IPayment payment;
	
	public PaymentService(IPayment payment) {
		this.payment=payment;
	}
	
	public void setPaymentMethod(IPayment payment) {
		this.payment=payment;
	}

	public void doPayment() {
		boolean status = payment.processPayment();
		if(status) {
			System.out.println("Your PaymentService.doPayment() through "+payment.toString()+" is Success!!");
		}else {
			System.out.println("Filed PaymentService.doPayment() through "+payment.toString()+" is Failed!!");
		}
	}
}
