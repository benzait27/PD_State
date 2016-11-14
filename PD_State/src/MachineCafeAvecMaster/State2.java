package MachineCafeAvecMaster;

public class State2 implements Mstate {
    int solde;
    
    
    
	public State2(int solde) {
		super();
		this.solde = solde;
	}

	@Override
	public void askCoffee(Machine m) throws SaisieErroneeException {
		 try {
			  throw new SaisieErroneeException("Impossible");
			  } catch (SaisieErroneeException e) {
				  System.out.println("Impossible");
				  m.setState((Mstate)this);
			  }
		}

	@Override
	public void askTea(Machine m) throws SaisieErroneeException {
		 try {
			  throw new SaisieErroneeException("Impossible");
			  } catch (SaisieErroneeException e) {
				  System.out.println("Impossible");
				  m.setState((Mstate)this);
			  }
	}

	@Override
	public void give(int argent, Machine m) throws SaisieErroneeException {
		 try {
			  throw new SaisieErroneeException("Impossible");
			  } catch (SaisieErroneeException e) {
				  System.out.println("Impossible");
				  m.setState((Mstate)this);
			  }
	}

	@Override
	public int getRefund(Machine m) throws SaisieErroneeException {
			int sol = solde;
			this.solde=0;
			m.setState((Mstate)new GiveImpossible(solde));
			return sol;
	}

}
