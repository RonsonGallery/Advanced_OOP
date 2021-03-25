package Virus;

import Population.Person;

public class ChineseVariant implements IVirus {
	
	public double contagionProbability(Person person) {
		return 0;
		
	}
	
	public boolean tryToContagion(Person person1,Person person2) {
		return false;
		
	}
	
	public boolean tryToKill(Person person) {
		
		return false;
		
	}
}
