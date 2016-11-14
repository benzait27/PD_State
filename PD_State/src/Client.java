

import MachineCafe.Machine;
import MachineCafe.SaisieErroneeException;

public class Client {

	public static void main(String[] args) throws SaisieErroneeException {
		Machine m = new Machine();
		m.askCoffee();
		m.give(5);
		m.askCoffee();
		m.give(30);
		m.askCoffee();
		m.give(1);
		m.askCoffee();

	}

}
