package Population;

import Virus.IVirus;

public class Healthy extends Person {

	@Override
	public double contagionProbability() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Person contagion(IVirus ivirus) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public double propabilityToGetSick() {
		
		return 1;
	}
	
	public Person vaccinate() {
		return new Vaccintaed();
	}

}
