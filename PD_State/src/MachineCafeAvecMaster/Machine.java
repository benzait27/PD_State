package MachineCafeAvecMaster;

public class Machine {
	
	public Mstate  state;
	
	
	public Mstate getState() {
		return state;
	}
	public void setState(Mstate state) {
		this.state = state;
	}
	public Machine() {
		super();
		this.state = new GiveImpossible(0);
	}
	public void askCoffee() throws SaisieErroneeException { state.askCoffee(this) ; };
	public void askTea() throws SaisieErroneeException{ state.askTea(this); };
	public void give(int argent) throws SaisieErroneeException{ state.give(argent,this); };
	public int getRefund() throws SaisieErroneeException{ return  state.getRefund(this); }


}

