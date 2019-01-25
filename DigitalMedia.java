
public class DigitalMedia {

	
	private String name; //instance variable called name
	private long size; //instance variable called size
	
	//default constructor
	public DigitalMedia() {
		
	}
	
	//default constructor with parameters
	public DigitalMedia(String name, long size) {
		this.name = name;
		this.size = size;
		
	}
	
	//getter method. gets name
	public String getName() {
		return name;
	}
	
	//getter method. gets size
	public long getSize() {
		return size;
	}
	
	//setter method. sets newName to name
	public void setName(String newName) {
		name = newName;
	}
	
	//method to check if the name is valid or not. 
	private boolean isValidName(String wordName) {
		boolean valid = true;
		
		if(wordName == "") {
			valid = false;
		}
		
		if(wordName == null) {
			valid = false;
		}
		return true;
	}
	
	//setter method. sets newSize to size
	public void setSize(long newSize) {
		size = newSize;
	}
	
	//equals method to check if data members are transitive, symmetric, or consistent
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		
		if(!(obj instanceof DigitalMedia)) {
			return false;
		}
		DigitalMedia d = (DigitalMedia) obj;
		return (d.size == size && d.name == name);
		
	}
	
	//toString method
	public String toString() {
		return ("Name: " + name + "\nSize: " + size);
	}
}

