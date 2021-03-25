package Population;

import Virus.IVirus;

public class Sick extends Person {
	
	private long contagiousTime;
	private IVirus virus;
	
	@Override
	public double contagionProbability() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Person contagion(IVirus ivirus) {
		// TODO Auto-generated method stub
		return this;
	}
	
	public Person recover() {
		return new Vaccintaed();
	}

	public long getContagiousTime() {
		return contagiousTime;
	}

	public void setContagiousTime(long contagiousTime) {
		this.contagiousTime = contagiousTime;
	}

	public IVirus getVirus() {
		return virus;
	}

	public void setVirus(IVirus virus) {
		this.virus = virus;
	}
	
}
