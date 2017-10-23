/**
 * This class represents a name with a First, middle, and last part.
 * It includes methods to return different arrangements of the name
 * and its length.
 * @author Cade
 * @version 10/22/17
 */
public class Name {
	private String first, middle, last;
	
	/**
	 * Constructor method for Name class
	 * @param f - First name
	 * @param m - Middle name
	 * @param l - Last name
	 */
	public Name(String f, String m, String l){
		first = f;
		middle = m;
		last = l;
	}
	
	/**
	 * Method to get the First name
	 * @return First name
	 */
	public String getfirst(){
		return first;
	}
	
	/**
	 * Method to get the Middle name
	 * @return Middle name
	 */
	public String getMiddle(){
		return middle;
	}
	
	/**
	 * Method to get the Last name
	 * @return Last name
	 */
	public String getLast(){
		return last;
	}
	
	/**
	 * Method to get the full name in first, middle, last
	 * order.
	 * @return the name in order of first, middle, and last
	 */
	public String firstMiddleLast(){
		return first + " " + middle + " " + last;
	}
	
	/**
	 * Method to get the full name in last, first middle order.
	 * @return the name in order of last, first, middle
	 */
	public String lastFirstMiddle(){
		return last + ", " + first + " " + middle;
	}
	
	/**
	 * Method to check if this Name is equal to another Name
	 * @param otherName - Another Name object
	 * @return true if this name equals the other Name object
	 */
	public boolean equals(Name otherName){
		return this.firstMiddleLast().equals(otherName.firstMiddleLast());
	}
	
	/**
	 * Method to get the Name's initials, all uppercase.
	 * @return the initials of the name
	 */
	public String initials(){
		return "" + first.toUpperCase().charAt(0) + middle.toUpperCase().charAt(0) + last.toUpperCase().charAt(0);
	}
	
	/**
	 * Method to get the length of the name, excluding spaces.
	 * @return the length of the name
	 */
	public int length(){
		return first.length() + middle.length() + last.length();
	}
}
