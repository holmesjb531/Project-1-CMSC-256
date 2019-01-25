
public class Image extends DigitalMedia {

	private int width, height;
	
	public Image(String name, long size, int width, int height) {
		super(name, size);
		this.height = height;
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	
	public boolean equals(Object ob) {
		if(ob == this) {
			return true;
		}
		if(!(ob instanceof Image)) {
			return false;
		}
		
		Image i = (Image) ob;
		return (i.height == height && i.width == width && i.getName() == getName() && i.getSize() == getSize());
	}
	
	public String toString() {
		return ("Title: " + getName() + "\nWidth: " + width + "\nHeight: " + height);
	}
}
