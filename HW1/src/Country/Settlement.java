package Country;

import java.util.*;
import Location.Location;
import Location.Point;
import Population.Person;
import Population.Sick;

public class Settlement {
	private String name;
	private Location location;
	private List<Person> people;
	private RamzorColor ramzorColor;
	private int sick = 0;
	private double percent = 0.4;
	private double p = 0;
	
	//calcp updates the precentage of sick people in the city
	
	public void calcP() {
		this.setP(sick/people.size());
	}
	
	public boolean transferPerson(Settlement settle) {
		settle.people.add(people.get(0));
		this.people.remove(0);
		return true;
		
	}
	
	// returns a random location in the settlement
	
	public Point randomLocation() {
		Random rand = new Random();
		return new Point(this.location.getPosition().getX()+ rand.nextInt() % location.getSize().getHeight(),this.location.getPosition().getY()+ rand.nextInt() % location.getSize().getWidth());
	}
	
	public double getP() {
		return p;
	}


	public void setP(double p) {
		this.p = p;
	}


	public double getPercent() {
		return percent;
	}


	public void setPercent(double d) {
		this.percent = d;
	}


	public int getSick() {
		return sick;
	}


	public void setSick(int sick) {
		this.sick = sick;
	}


	public int calcSick() {
		int count = 0;
		for(int i=0; i < people.size(); i++) {
			if(people.get(i) instanceof Sick) {
				count++;
			}
		}
		sick = count;
		this.calcP();
		return sick;
	}
	
	
	public Settlement(String name, Location location, List<Person> people, RamzorColor ramzorColor) {
		super();
		this.name = name;
		this.location = location;
		this.people = people;
		this.ramzorColor = ramzorColor;
	}
	
	public Settlement() {
		this.name = "Ashdod";
		this.location = new Location();
		this.people = null;
		this.ramzorColor = RamzorColor.Green;
		
	}
	
	public boolean addPerson(Person person) {
		people.add(person);
		return true;
	}
	
	public boolean transferPerson(Person person,Settlement settlement) {
		settlement.addPerson(person);
		this.people.remove(person);
		return true;
	}

	public RamzorColor calculateRamzorGrade() {
		return ramzorColor;
	}
	
	public double contagiousPercent(Location location) {
		
		return 0;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		this.people = people;
	}

	public RamzorColor getRamzorColor() {
		return ramzorColor;
	}

	public void setRamzorColor(RamzorColor ramzorColor) {
		this.ramzorColor = ramzorColor;
	}

	@Override
	public String toString() {
		return "Settlement [name=" + name + ", location=" + location + ", people=" + people + ", ramzorColor="
				+ ramzorColor + ", sick=" + sick + ", percent=" + percent + ", p=" + p  + "] \n";
	}
	
}

