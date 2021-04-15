package Population;

import Country.Settlement;
import Location.Point;
import Virus.IVirus;

public class Sick extends Person {
	
	private long contagiousTime;
	private IVirus virus;
	public Sick(int age,Point location,Settlement settlement,long contagiousTime,IVirus virus) {
		super(age,location,settlement);
		this.contagiousTime=contagiousTime;
		this.virus=virus;
		
	}
	@Override
	public double contagionProbability() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Person contagion(IVirus ivirus) {
		Person copy=new Sick(super.getAge(), super.getLocation(),super.getSettlement() , this.contagiousTime, this.virus);
		return copy;
	}
	
	public Person recover() {
		return new Vaccintaed(this.getAge(),this.getLocation(),this.getSettlement(),0);
	}

	public long getContagiousTime() {
		return contagiousTime;
	}
	
	public void updateTime() {
		this.contagiousTime++;
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
	@Override
	public String toString() {
		return "Sick [contagiousTime=" + contagiousTime + ", virus=" + virus.getClass() + "] \n";
	}

}
	

