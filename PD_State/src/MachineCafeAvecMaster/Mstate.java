package MachineCafeAvecMaster;

public interface Mstate {
	
	void  askCoffee(Machine m) throws SaisieErroneeException;
	void  askTea(Machine m) throws SaisieErroneeException ;
	void  give(int argent,Machine m)throws SaisieErroneeException ;
	int    getRefund(Machine m)throws SaisieErroneeException;

}
