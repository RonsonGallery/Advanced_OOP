package Virus;

import Population.Person;

public interface IVirus {
	double contagionProbability(Person person);
	boolean tryToContagion(Person person1,Person person2);
	
	public default boolean tryToKill(Person person) {
		
		return false;
		
	}
	
}
