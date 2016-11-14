package MachineCafe;

public interface Mstate {
	
	Mstate  askCoffee() throws SaisieErroneeException;
	Mstate  askTea() throws SaisieErroneeException ;
	Mstate  give(int argent)throws SaisieErroneeException ;

}
