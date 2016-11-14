package MachineCafeAvecMaster;

public class GiveImpossible implements Mstate{
	
	
	int solde;
	
	
	public GiveImpossible(int solde) {
		super();
		this.solde = solde;
	}
	
	@Override
	public void askCoffee(Machine m) throws SaisieErroneeException  {	
	// try {
      //  throw new SaisieErroneeException("Impossible");
	// } catch (SaisieErroneeException e) {
		    System.out.println("Impossible");
		    m.setState(this);
		 // }
	}

	@Override
	public void askTea(Machine m) {
		 try {
			  throw new SaisieErroneeException("Impossible");
			  } catch (SaisieErroneeException e) {
				  System.out.println("Impossible");
				  m.setState((Mstate)this);
			  }
		}
	

	@Override
	public void give(int argent,Machine m) {
		solde+=argent;
		if (solde>10)  m.setState((Mstate)new GivePossible(solde));	
		else  m.setState((Mstate)new GiveImpossible(solde));
	}

	@Override
	public int getRefund(Machine m) {
		 m.setState((Mstate)new GiveImpossible(solde));
		int sol = solde;
		this.solde=0;
		return sol;
	}
}
