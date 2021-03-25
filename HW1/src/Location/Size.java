package Location;

public class Size {
	private int width;
	private int height;
	
	public Size(int width, int height) {
		if(width >= 0 && this.height >= 0) {
			this.width = width;
			this.height = height;
		} else {
			this.width = 0;
			this.height = 0;
			System.out.println("Wrong input setting default values of 0");
		}
	}
	public Size() {
		this.width = 0;
		this.height = 0;
	}
		
	public int getWidth() {
		return width;
	}
	
	public boolean setWidth(int width) {
		
		if(width > 0) {
			this.width = width;
			return true;
		}
		return false;
		
	}
	


	public int getHeight() {
		return height;
	}
	
	public boolean setHeight(int height) {
		
		if(height > 0) {
			this.height = height;
			return true;
		}
		return false;	
	}
	
	@Override
	public String toString() {
		return "Size [width=" + width + ", height=" + height + "]";
	}

}
