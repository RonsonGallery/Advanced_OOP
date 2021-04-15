package Country;

import java.util.List;

public class Map {
	private List<Settlement> settlements;
	
	
	public Map(List<Settlement> settlements) {
		super();
		this.settlements = settlements;
	}
	public boolean addSettlements(Settlement settlement) {
		this.settlements.add(settlement);
		return true;
	}

	/**
	 * @return the settlements
	 */
	public List<Settlement> getSettlements() {
		return settlements;
	}
	/**
	 * @param settlements the settlements to set
	 */
	public void setSettlements(List<Settlement> settlements) {
		this.settlements = settlements;
	}
	@Override
	public String toString() {
		return "Map [settlements=" + settlements + "]";
	}
	
	

}
