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
	 * @param t title of song as a String
	 * @param a artist name as a String
	 * @param l length (Seconds) as an int
	 */
	public Song(String t, String a, int l){
		title = t;
		artist = a;
		length = l;
	}
	
	/**
	 * Sets the title of the song.
	 * @param t title of the song as a String
	 */
	public void setTitle(String t){
		title = t;
	}
	
	/**
	 * Returns a String representation of the song.
	 * @return returns the title, artist, and length as 
	 *         a nicely formatted String.
	 */
	public String toString(){
		String song = title + " by " + artist + ", Length: " + getLength();
		return song;
	}
	
	/**
	 * Sets the artist's name.
	 * @param a name of artist as a String.
	 */
	public void setArtist(String a){
		artist = a;
	}
	
	/**
	 * Method to get the artist's name.
	 * @return name of artist as a String.
	 */
	public String getArtist(){
		return artist;
	}
	
	/**
	 * Sets the length of the song.
	 * @param l length of the song as a String.
	 */
	public void setLength(int l){
		length = l;
	}
	
	/**
	 * Method to get the length of the song.
	 * @return returns the length of the song formatted nicely.
	 */
	public String getLength(){
		return length / 60 + ":" + (length % 60);
	}
}
