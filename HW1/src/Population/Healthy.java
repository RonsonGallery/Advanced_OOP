package Population;

import Country.Settlement;
import Location.Point;
import Virus.IVirus;

public class Healthy extends Person {

	public Healthy(int age, Point location, Settlement settlement) {
		super(age,location,settlement);
	}

	@Override
	public double contagionProbability() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Person contagion(IVirus ivirus) {
		// TODO Auto-generated method stub
		return new Sick(this.getAge(),this.getLocation(),this.getSettlement(),0,ivirus);
	}
	
	public double propabilityToGetSick() {
		
		return 1;
	}
	
	public Person vaccinate() {
		return new Vaccintaed(this.getAge(),this.getLocation(),this.getSettlement(),0);
	}
	
	public void updateTime() {
		
	}
	
	

}
