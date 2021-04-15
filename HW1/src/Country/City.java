package Country;

import java.util.List;

import Location.Location;
import Population.Person;

public class City extends Settlement {

	public City(String name, Location location, List<Person> people, RamzorColor ramzorColor) {
		super(name, location, people, ramzorColor);
		// TODO Auto-generated constructor stub
	}

	public City() {
		// TODO Auto-generated constructor stub
	}
	
	//Calculates ramzor grade for City
	
	public RamzorColor calculateRamzorGrade() {
		this.setPercent(0.2*Math.pow(4, 1.25 * this.getP()));
		
		if(this.getPercent() < 0.4) {
			this.setRamzorColor(RamzorColor.Green);
		}
		if(this.getPercent() > 0.4 && this.getPercent() <= 0.6) {
			this.setRamzorColor(RamzorColor.Yellow);
		}
		if(this.getPercent() > 0.6 && this.getPercent() <= 0.8) {
			this.setRamzorColor(RamzorColor.Orange);
		}
		if(this.getPercent() > 0.8) {
			this.setRamzorColor(RamzorColor.Red);
		}
		
		return this.getRamzorColor();
	}

	@Override
	public String toString() {
		return "City [toString()=" + super.toString() + "] \n";
	}




}
