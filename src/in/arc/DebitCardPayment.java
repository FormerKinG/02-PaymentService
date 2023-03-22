package in.arc;

public class DebitCardPayment implements IPayment {

	@Override
	public boolean processPayment() {

		System.out.println("Initializing payment through DebitCardPayment.processPayment()");
		return true;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+DebitCardPayment.class;
	}

}
