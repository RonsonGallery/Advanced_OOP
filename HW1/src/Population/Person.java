package Population;

import Country.Settlement;
import Location.Point;
import Population.Person;
import Virus.IVirus;

public abstract class Person {
	private int age;
	private Point location;
	private Settlement settlement;
	public abstract double contagionProbability();
	public abstract Person contagion(IVirus ivirus);

	
	public Person(int age, Point location, Settlement settlement) {
		// TODO Auto-generated constructor stub
		this.age=age;
		this.location=location;
		this.settlement=settlement;	
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Point getLocation() {
		return location;
	}
	
	public void setLocation(Point location) {
		this.location = location;
	}
	
	public Settlement getSettlement() {
		return settlement;
	}
	
	public void setSettlement(Settlement settlement) {
		this.settlement = settlement;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", location=" + location +"Settelment: " +this.settlement.getName() +"] \n";
	}


	}
		

