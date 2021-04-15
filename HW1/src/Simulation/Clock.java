/**
 * 
 */
package Simulation;




/**
 * @author Owner
 *
 */
public abstract class Clock {
	
	public static long time = 0;
	
	
	
	public long now() {
		return time;
	}
	
	public static void nextTick() {
		time = time + 1;
	}

	/**
	 * 
	 */
	public Clock() {
		// TODO Auto-generated constructor stub
	}

}
