package Location;

public class Location {
	private Point position;
	private Size size;
	
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
		
}
