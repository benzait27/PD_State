package MachineCafeAvecMaster;

public class GiveImpossible implements Mstate{
	public static GiveImpossible state = new GiveImpossible(0);
	
	static int solde;
	
	
	private GiveImpossible(int solde) {
		super();
		GiveImpossible.solde = solde;
	}
	
	public static GiveImpossible getInstance(int solde){
		GiveImpossible.solde=solde;
		return GiveImpossible.state;
		
	} 
	
	@Override
	public void askCoffee(Machine m) throws SaisieErroneeException  {	
	try {
       throw new SaisieErroneeException("Impossible");
	} catch (SaisieErroneeException e) {
		    System.out.println("Impossible");
		    m.setState(GiveImpossible.state);
	 }
	}

	@Override
	public void askTea(Machine m) {
		 try {
			  throw new SaisieErroneeException("Impossible");
			  } catch (SaisieErroneeException e) {
				  System.out.println("Impossible");
				  m.setState(GiveImpossible.state);
			  }
		}
	

	@Override
	public void give(int argent,Machine m) {
		solde+=argent;
		if (solde>10)  m.setState((Mstate) GivePossible.getInstance(solde));	
		else  m.setState(GiveImpossible.getInstance(solde));
	}

	@Override
	public int getRefund(Machine m) {
		 m.setState((Mstate)new GiveImpossible(solde));
		int sol = solde;
		GiveImpossible.solde=0;
		return sol;
	}
}
