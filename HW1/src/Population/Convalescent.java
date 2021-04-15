package Population;

import Country.Settlement;
import Location.Point;
import Virus.IVirus;

public class Convalescent extends Person {
	
	public Convalescent(int age, Point location, Settlement settlement) {
		super(age, location, settlement);
		// TODO Auto-generated constructor stub
	}

	private IVirus virus;

	@Override
	public double contagionProbability() {
		// TODO Auto-generated method stub
		return 0.2;
	}

	@Override
	public Person contagion(IVirus ivirus) {
		// TODO Auto-generated method stub
		return null;
	}
	

	public IVirus getVirus() {
		return virus;
	}

	public void setVirus(IVirus virus) {
		this.virus = virus;
	}
	
	public void updateTime() {
		
	}

}
