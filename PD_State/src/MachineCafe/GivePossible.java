package MachineCafe;

public class GivePossible implements Mstate{

	
	int solde;
	
	
	public GivePossible(int solde) {
		super();
		this.solde = solde;
	}

	@Override
	public Mstate askCoffee() {
		System.out.println("OK");
		return (Mstate) new GiveImpossible(0);
	}

	@Override
	public Mstate askTea() {
		System.out.println("OK");
		return (Mstate) new GiveImpossible(0);
		
	}

	@Override
	public Mstate give(int argent) {
		solde+=argent;
		if (solde>10) return (Mstate) new GivePossible(solde);	
		else return (Mstate) new GiveImpossible(solde);
	}

}
