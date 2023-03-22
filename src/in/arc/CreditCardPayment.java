package in.arc;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Initializing Payment through CreditCardPayment.processPayment()");
		return true;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return ""+CreditCardPayment.class;
}
}
