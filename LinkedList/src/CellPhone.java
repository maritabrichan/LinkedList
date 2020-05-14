//-----------------------------------------------------
//Assignment 4
//-----------------------------------------------------
import java.util.Scanner;

/**
*
* @author  Marita Brichan
*<br>
*<br> 
*
*This program will take a list of cell phones stored in a file or created in the program and 
*it will put them in a linked list and create it and then show it to the user, and then give him the option
*to search for a cell phone with a certain serial Number. After that a lot of methods of the linked list would be tested in order to 
*make sure the understanding of linked list is at its best.
*
*/
public class CellPhone {
	//serialNum represents the serial number of the cell phone
	private long serialNum;
	//brand represents the brand of the cell phone
	private String brand;
	//the year represents the year in which the cell phone was released
	private int year;
	//the price represents the price of the cellphone
	private double price;
	
	/**
	 * 
	 * Defines the parameterized constructor that takes two double in the argument
	 * @param serialNum attribute
	 * @param brand attribute
	 * @param year attribute
	 * @param price attribute
	 * 
	 */
	public CellPhone(long serialNum, String brand, int year, double price) {
		this.serialNum = serialNum;
		this.brand = brand;
		this.year = year;
		this.price = price;
	}
	
	/**
	 * 
	 * Defines the copy constructor that takes an objects and copy it
	 * @param c attribute
	 * @param serialNum attribute
	 * 
	 */
	public CellPhone(CellPhone c, long serialNum) {
		this.brand = c.brand;
		this.year = c.year;
		this.price = c.price;
		this.serialNum = serialNum;
	}
	
	/**
	 * clone method to clone the cell phone of the serial number entered by the user
	 */
	protected Object clone(){
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Enter the serial number wanted:");
        long serialNum = keyIn.nextLong();
        keyIn.close();
        return new CellPhone(this, serialNum);
    }
	
	/**
	 * getter method to return the value of the serial number
	 * @return attribute
	 */
	public long getSerialNum() {
		return serialNum;
	}
	/**
	 * setter meethod to change the serial number
	 * @param serialNum attribute
	 */
	public void setSerialNum(long serialNum) {
		this.serialNum = serialNum;
	}
	/**
	 * getter method to get the value of the brand
	 * @return attribute
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * setter method to set a new value to the brand
	 * @param brand attribute
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * getter method to get the value of the year
	 * @return attribute
	 */
	public int getYear() {
		return year;
	}
	/**
	 * setter method to set a new value to the year
	 * @param year attribute
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * getter method to get the value of the price
	 * @return attribute
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * setter method to set the value of the price
	 * @param price attribute
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * equals() method to verify if 2 objects are the equals
	 */
	public boolean equals(Object o) {
		if(o==null||this.getClass()!=o.getClass()) {
            return false;
		}
        else{
            CellPhone cell = (CellPhone) o;
            return (this.year == cell.year&&this.price==cell.price&&this.brand.equals(cell.brand));
        }	
	}
	/**
	 * toString() method to return the values of the object
	 */
	public String toString() {
        return "[" + this.serialNum + ": " + this.brand + " " + this.price + "$ " + this.year + "]";
	}
	
	

}
