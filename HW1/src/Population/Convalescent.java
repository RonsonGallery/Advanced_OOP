package Population;

import Virus.IVirus;

public class Convalescent extends Person {
	
	private IVirus virus;

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
		
			return 0.2;
			
	}

	public IVirus getVirus() {
		return virus;
	}

	public void setVirus(IVirus virus) {
		this.virus = virus;
	}

}
