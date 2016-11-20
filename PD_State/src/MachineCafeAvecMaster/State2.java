package MachineCafeAvecMaster;

public class State2 implements Mstate {
public static State2 state = new State2(0);
	
	static int solde;
	
	
	private State2(int solde) {
		super();
		State2.solde = solde;
	}
	
	public static State2 getInstance(int solde){
		State2.solde=solde;
		return State2.state;
		
	} 

	@Override
	public void askCoffee(Machine m) throws SaisieErroneeException {
		 try {
			  throw new SaisieErroneeException("Impossible");
			  } catch (SaisieErroneeException e) {
				  System.out.println("Impossible");
				  m.setState(State2.getInstance(solde));
			  }
		}

	@Override
	public void askTea(Machine m) throws SaisieErroneeException {
		 try {
			  throw new SaisieErroneeException("Impossible");
			  } catch (SaisieErroneeException e) {
				  System.out.println("Impossible");
				  m.setState(State2.getInstance(solde));
			  }
	}

	@Override
	public void give(int argent, Machine m) throws SaisieErroneeException {
		 try {
			  throw new SaisieErroneeException("Impossible");
			  } catch (SaisieErroneeException e) {
				  System.out.println("Impossible");
				  m.setState(State2.getInstance(solde));
			  }
	}

	@Override
	public int getRefund(Machine m) throws SaisieErroneeException {
			int sol = solde;
			State2.solde=0;
			m.setState(GiveImpossible.getInstance(solde));
			return sol;
	}

}
