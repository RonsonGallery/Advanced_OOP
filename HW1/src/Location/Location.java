package Location;

public class Location {
	private Point position;
	private Size size;
	
	public double distance(Point per1,Point per2) {
		if(per1.getX() > per2.getX()) {
			return Math.sqrt((per1.getX() - per2.getX())*(per1.getX() - per2.getX()) + (per1.getY() - per2.getY()) * (per1.getY() - per2.getY()));
		}
		
		return Math.sqrt((per2.getX() - per1.getX())*(per2.getX() - per1.getX()) + (per2.getY() - per1.getY()) * (per2.getY() - per1.getY()));
	}
	

	public Point getPosition() {
		return position;
	}
	public void setPosition(Point position) {
		this.position = position;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public Location(Point position, Size size) {
		this.position = new Point(position.getX(),position.getY());
		this.size = new Size(size.getWidth(),size.getHeight());
	}
	public Location() {
		this.position = new Point();
		this.size = new Size();
	}


	@Override
	public String toString() {
		return "Location [" + (position != null ? "position=" + position + ", " : "")
				+ (size != null ? "size=" + size : "") + "]";
	}

}
