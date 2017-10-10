/**
 * This class represents a song with a title, artist,
 * and length.  Included are getters and setters for 
 * each of the variables.
 * @author rich8125
 * @version 10/10/2017
 */
public class Song {
	
	private String title;
	private String artist;
	private int length;
	
	/**
	 * Constructor method that sets the song's data.
	 * @param title
	 * @param artist
	 * @param length (Seconds)
	 */
	public Song(String t, String a, int l){
		title = t;
		artist = a;
		length = l;
	}
	
	/**
	 * 
	 * @param Title
	 */
	public void setTitle(String t){
		title = t;
	}
	
	/**
	 * Returns a String representation of the song.
	 * @return returns the title, artist, and length.
	 */
	public String toString(){
		String song = title + " by " + artist + ", Length: " + getLength();
		return song;
	}
	
	public void setArtist(String a){
		artist = a;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public void setLength(int l){
		length = l;
	}
	
	public String getLength(){
		return length / 60 + ":" + (length % 60);
	}
}
