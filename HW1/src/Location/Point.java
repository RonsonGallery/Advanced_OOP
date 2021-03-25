package Location;

public class Point {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public boolean setX(int x) {
		if(x > 0) {
			this.x = x;	
			
			return true;
		}
		System.out.println("failed to set x");
		
		return false;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean setY(int y) {
		if(y > 0) {
			this.y = y;
			
			return true;
		}
		System.out.println("failed to set y");
		
		return false;
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) {
		if(x >= 0 && y >= 0) {
			this.x = x;
			this.y = y;
		} else {
			this.x = 0;
			this.y = 0;
			System.out.println("Wrong input setting default values of 0");
		}
	}

	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
}