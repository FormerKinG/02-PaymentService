package in.arc;

public class SodexoPayment implements IPayment {

	@Override
	public boolean processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Initializing Payment through SodexoPayment.processPayment()");
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+SodexoPayment.class;
	}
}
