package MachineCafeAvecMaster;

public class GivePossible implements Mstate{

	
public static GivePossible state = new GivePossible(0);
	
	static int solde;
	
	
	private GivePossible(int solde) {
		super();
		GivePossible.solde = solde;
	}
	
	public static GivePossible getInstance(int solde){
		GivePossible.solde=solde;
		return GivePossible.state;
		
	} 
	@Override
	public void askCoffee(Machine m) {
		System.out.println("OK");
		GivePossible.solde-=10;
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
				  m.setState(GivePossible.getInstance(solde));
			  }
		}

	@Override
	public int getRefund(Machine m) throws SaisieErroneeException {
		  m.setState((Mstate)GiveImpossible.getInstance(solde));
			int sol = solde;
			GivePossible.solde=0;
			return sol;
	}

}
