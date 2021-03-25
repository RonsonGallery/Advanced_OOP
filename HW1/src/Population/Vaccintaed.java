package Population;

import Virus.IVirus;

public class Vaccintaed extends Person {
	
	private long vaccinationTime;
	

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
