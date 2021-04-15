package Virus;

import Location.Point;
import Population.Person;
import Population.Sick;

public class BritishVariant implements IVirus {

	@Override
	public double contagionProbability(Person person) {
		return 0.7;
	}
	
	public double distance(Point per1,Point per2) {
		if(per1.getX() > per2.getX()) {
			return Math.sqrt((per1.getX() - per2.getX())*(per1.getX() - per2.getX()) + (per1.getY() - per2.getY()) * (per1.getY() - per2.getY()));
		}
		
		return Math.sqrt((per2.getX() - per1.getX())*(per2.getX() - per1.getX()) + (per2.getY() - per1.getY()) * (per2.getY() - per1.getY()));
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
	
public boolean tryToKill(Sick person) {
		
		double chance = 0;
		if(person.getAge() < 18) {
			
			chance = Math.max(0,0.01-0.01*0.01*((person.getContagiousTime()-15)*(person.getContagiousTime()-15)));
			
		}
		
		if(person.getAge() >= 18) {
			
			chance = Math.max(0,0.1-0.01*0.1*((person.getContagiousTime()-15)*(person.getContagiousTime()-15)));
		}
		

		//chance = Math.max(0,);
		if(Math.random() <= chance) {
			return true;
		}
			
		return false;
		
	}

	public BritishVariant() {
		super();
		// TODO Auto-generated constructor stub
	}

}
