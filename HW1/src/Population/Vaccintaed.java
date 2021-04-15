package Population;

import Country.Settlement;
import Location.Point;
import Virus.IVirus;

public class Vaccintaed extends Person {
	private long vaccinationTime;
	
	public Vaccintaed(int age, Point location, Settlement settlement,long vaccinationTime) {
		super(age, location, settlement);
		// TODO Auto-generated constructor stub
		this.vaccinationTime=vaccinationTime;
	}
	
	public Vaccintaed() {
		super(18,new Point(),new Settlement());
		this.vaccinationTime = 0;
	}
	
	public void updateTime() {
		
	}

	@Override
	public double contagionProbability() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Person contagion(IVirus ivirus) {
		// TODO Auto-generated method stub
		return null;
	}
	public double propabilityToGetSick() {
		if (vaccinationTime < 21) {
			return Math.min(1, 0.56+0.15*Math.pow(21 - vaccinationTime, 0.5));
			
			}
		else {
			return Math.max(0.05, (1.05 /vaccinationTime-14));
		}
	}

}
