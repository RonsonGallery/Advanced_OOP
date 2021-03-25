package Country;

import java.util.*;
import Location.Location;
import Population.Person;

public class Settlement {
	private String name;
	private Location location;
	private List<Person> people;
	private RamzorColor ramzorColor;
	
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
	
	
	
}

