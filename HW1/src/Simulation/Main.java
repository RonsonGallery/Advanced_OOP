/**
 * 
 */
package Simulation;

import java.util.Random;

import Country.Map;
import Country.Settlement;
import IO.SimulationFile;
import Population.Person;
import Population.Sick;
import Virus.ChineseVariant;

/**
 * @author Roni Gerkerov 316583145,Niv_Tal 207992975
 *
 */
public class Main {

	/**
	 * 
	 * public Main() {
		// TODO Auto-generated constructor stub
	}
	 */
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand1 = new Random();
		Person p;
		Sick t;
		
		SimulationFile s = new SimulationFile();
		Map m = s.Loadfile();
		//System.out.println(m);
		//System.out.println(m.getSettlements().get(0).getPeople().get(0));
		
		for (int i = 0; i < m.getSettlements().size(); i++) {
			int j = 0;
			//System.out.println((3/m.getSettlements().size()) < 0.01);
			while ((m.getSettlements().get(i).getSick()/m.getSettlements().size()) <= 0.01){
				//System.out.println(m.getSettlements().get(i).getPeople().size());
				if(j > m.getSettlements().get(i).getPeople().size()-1) {
					break;
				}
				if(m.getSettlements().get(i).getPeople().get(j) instanceof Sick) {
					continue;
				}
				p = m.getSettlements().get(i).getPeople().get(j);
				t = new Sick(p.getAge(), p.getLocation(), p.getSettlement(), 0, new ChineseVariant());
				m.getSettlements().get(i).getPeople().set(j,t);
				m.getSettlements().get(i).calcSick();
				
				//System.out.println(m.getSettlements().get(i).getPeople().get(j));
				//System.out.println("Infected");
				j++;
			}
				
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < m.getSettlements().size(); j++) {
				for(int z = 0; z < 6;z++) {
					
					if(m.getSettlements().get(j).getPeople().size() < z) {
						continue;
					}
					

					int rand11 = rand1.nextInt(m.getSettlements().get(j).getPeople().size()-1);
					if(new ChineseVariant().tryToContagion(m.getSettlements().get(j).getPeople().get(z), m.getSettlements().get(j).getPeople().get(rand11))) {
						p = m.getSettlements().get(j).getPeople().get(z);
						t = new Sick(p.getAge(), p.getLocation(), p.getSettlement(), 0, new ChineseVariant());
						m.getSettlements().get(j).getPeople().set(z,t);
						m.getSettlements().get(j).calcSick();
					}
					
				}
				
			}
			for (int j = 0; j < m.getSettlements().size(); j++) {
				((Settlement) m.getSettlements().get(j)).calculateRamzorGrade();
				for(int z = 0; z < m.getSettlements().get(j).getPeople().size();z++) {
					if(m.getSettlements().get(j).getPeople().get(z) instanceof Sick) {
						((Sick) m.getSettlements().get(j).getPeople().get(z)).updateTime();
					}
				}
			}
			
			System.out.println(Clock.time);
			Clock.nextTick();
			
		}
		
		System.out.println(m);
		
		//System.out.println(m);

	}

}
