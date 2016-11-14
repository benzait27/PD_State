package MachineCafeAvecMaster;

public class GivePossible implements Mstate{

	
	int solde;
	
	
	public GivePossible(int solde) {
		super();
		this.solde = solde;
	}

	@Override
	public void askCoffee(Machine m) {
		System.out.println("OK");
		this.solde-=10;
		m.setState((Mstate)new State2(this.solde));
	}

	@Override
	public void askTea(Machine m) {
		System.out.println("OK");
		this.solde-=10;
		m.setState((Mstate)new State2(this.solde));
		
	}

	@Override
	public void  give(int argent,Machine m) {
		 try {
			  throw new SaisieErroneeException("Impossible");
			  } catch (SaisieErroneeException e) {
				  System.out.println("Impossible");
				  m.setState((Mstate)this);
			  }
		}

	@Override
	public int getRefund(Machine m) throws SaisieErroneeException {
		  m.setState((Mstate)new GiveImpossible(solde));
			int sol = solde;
			this.solde=0;
			return sol;
	}

}
