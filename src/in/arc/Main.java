package in.arc;

public class Main {

	public static void main(String[] args) {

		IPayment payment = new SodexoPayment();
		PaymentService service = new PaymentService(payment);
		
		service.setPaymentMethod(new CreditCardPayment());
		
		service.doPayment();
	}

}
