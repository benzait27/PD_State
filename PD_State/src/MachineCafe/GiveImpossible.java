package MachineCafe;


public class GiveImpossible implements Mstate{
	
	int solde;
	
	
	public GiveImpossible(int solde) {
		super();
		this.solde = solde;
	}

	@Override
	public Mstate askCoffee() throws SaisieErroneeException {	
	  try {
		  throw new SaisieErroneeException("Impossible");
		  } catch (SaisieErroneeException e) {
			  System.out.println("Impossible");
			  return this;
		  }
	}

	@Override
	public Mstate askTea() {
		 try {
			  throw new SaisieErroneeException("Impossible");
			  } catch (SaisieErroneeException e) {
				  System.out.println("Impossible");
				  return this;
			  }
		}
	

	@Override
	public Mstate give(int argent) {
		solde+=argent;
		if (solde>10) return (Mstate) ((GivePossible) new GivePossible(solde));	
		else return ((Mstate) new GiveImpossible(solde));
	}


}
