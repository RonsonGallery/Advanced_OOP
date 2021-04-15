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

			this.x = x;
			this.y = y;

		}
		
	
	 public boolean equals(Point other)
	 {
		 if(x==other.x && y==other.y) {
			 System.out.println("is equals");
			 return true; 
		 } 
		System.out.println("Not equals ");
	    return false; 	
	}
	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
}