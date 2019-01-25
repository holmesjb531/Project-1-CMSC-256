
public class Song extends DigitalMedia {

	private String artist; //instance variable called artist
	private String album; //instance variable called album
	
	//default constructor inheriting the super class's instance variables
	public Song(String name, long size) {
		super(name, size);

	}
	
	//default constructor with constructors
	public Song(String name, long size, String album, String artist) {
		super(name, size);
		this.album = album;
		this.artist = artist;
	}
	
	//getter method. gets the title
	public String getTitle() {
		return getName();
	}

	//getter method. gets the artist
	public String getArtist() {
		return artist;
	}
	
	//getter method. gets the album
	public String getAlbum() {
		return album;
	}
	
	//setter method. sets the title 
	public void setTitle(String newTitle) {
		setName(newTitle);
	}
	
	//setter method. sets newArtist to artist
	public void setArtist(String newArtist) {
		artist = newArtist;
	}
	
	//setter method. sets newAlbum to album
	public void setAlbum(String newAlbum) {
		album = newAlbum;
	}
	
	//equals method to check if data members are transitive, symmetric, or consistent
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if(!(o instanceof Song)) {
			return false;
		}
		
		 Song s = (Song) o;  
		 return (s.album == album && s.artist == artist && s.getName() == getName() && s.getSize() == getSize());
	}
	
	public String toString() {
		return ("Title: " + getTitle() + "\nArtist: " + artist + "\nAlbum: " + album);
	}
}
