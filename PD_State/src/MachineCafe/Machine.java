package MachineCafe;

public class Machine {
	
	private Mstate  state;
	
	
	public Machine() {
		super();
		this.state = new GiveImpossible(0);
	}
	public void askCoffee() throws SaisieErroneeException{ state = state.askCoffee() ; };
	public void askTea() throws SaisieErroneeException{ state = state.askTea(); };
	public void give(int argent) throws SaisieErroneeException{ state = state.give(argent); };
}
