package Virus;

import Location.Point;
import Population.Person;
import Population.Sick;

public class SouthAfricanVariant implements IVirus {

	@Override
	public double contagionProbability(Person person) {
		if(person.getAge() < 18) {
			return 0.6;
		}
		if(person.getAge() >= 18) {
			return 0.5;
		}
		return 1;
			
	}

	@Override
	public boolean tryToContagion(Person person1, Person person2) {
		double chance = 0;
		double d = distance(person1.getLocation(), person2.getLocation());
		chance = Math.min(1,0.14 * Math.pow(2.718,2-0.25*d));
		
		if(Math.random() <= chance) {
			
			return true;
		}
				
		return false;
	}
	
	public double distance(Point per1,Point per2) {
		if(per1.getX() > per2.getX()) {
			return Math.sqrt((per1.getX() - per2.getX())*(per1.getX() - per2.getX()) + (per1.getY() - per2.getY()) * (per1.getY() - per2.getY()));
		}
		
		return Math.sqrt((per2.getX() - per1.getX())*(per2.getX() - per1.getX()) + (per2.getY() - per1.getY()) * (per2.getY() - per1.getY()));
	}
	
public boolean tryToKill(Sick person) {
		
		double chance = 0;
		if(person.getAge() < 18) {
			
			chance = Math.max(0,0.05-0.01*0.05*((person.getContagiousTime()-15)*(person.getContagiousTime()-15)));
			
		}
		
		if(person.getAge() >= 18 && person.getAge() <= 55) {
			
			chance = Math.max(0,0.08-0.01*0.08*((person.getContagiousTime()-15)*(person.getContagiousTime()-15)));
		}
		
		
		if(Math.random() <= chance) {
			return true;
		}
			
		return false;

	}
}
