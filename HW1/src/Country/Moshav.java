package Country;

import java.util.List;

import Location.Location;
import Population.Person;

public class Moshav extends Settlement {
	

	public Moshav() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moshav(String name, Location location, List<Person> people, RamzorColor ramzorColor) {
		super(name, location, people, ramzorColor);
		// TODO Auto-generated constructor stub
	}
	
	//Calculates ramzor grade for Moshav

	@Override
	public RamzorColor calculateRamzorGrade() {
		this.setPercent(0.3 + 3*(Math.pow(1.2, getPercent())*Math.pow(this.getP() - 0.35,5)));
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
		return "Moshav []" + super.toString() + "] \n";
	}
	

}	
