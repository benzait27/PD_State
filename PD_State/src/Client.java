

import MachineCafeAvecMaster.*;

public class Client {

	public static void main(String[] args) throws SaisieErroneeException {
		Machine m = new Machine();
		m.askCoffee();
		m.give(5);
		m.askCoffee();
		m.give(10);
		m.askCoffee();
		System.out.println(m.getRefund());
		System.out.println(m.getRefund());
	}

}
