/*
@Author: David Niculita
@Student No: C20513979
A Java Program to attempt to create and number of different metanodes using processing. 
*/

package ie.tudublin;

import processing.core.PApplet; //import files to generate the nematodes.
import processing.data.TableRow;


//Create new nematode class
public class Nematode extends PApplet {
    // create fields
	private String name;
	private int length;
	private boolean limbs;
	private String gender;
	private boolean eyes;
    
    // toString function for each field genetrated with source action
    @Override
    public String toString() {
        return "Nematode [eyes=" + eyes + ", gender=" + gender + ", length=" + length + ", limbs=" + limbs
                + ", name=" + name + "]";
    }
    
	public Nematode(TableRow tr) // get table row information
	{
		this(
			tr.getString("name"), 
			tr.getInt("length"), 
			tr.getInt("limbs") == 1, 
			tr.getString("gender"), 
			tr.getInt("eyes") == 1)
        ;
	}

	public Nematode(String name, int length, boolean limbs, String gender, boolean eyes) { // constructor for the fields created 
		this.name = name;
		this.length = length;
		this.limbs = limbs;
		this.gender = gender;
		this.eyes = eyes;
	}


	// getters and setters automatically generated with source action
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public boolean isLimbs() {
		return limbs;
	}
	public void setLimbs(boolean limbs) {
		this.limbs = limbs;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isEyes() {
		return eyes;
	}
	public void setEyes(boolean eyes) {
		this.eyes = eyes;
	}

	public void render(Nematode pa)
	{
		float x = map(length, 0, 255, 0, 800);
		float y = map(length, 0, 255, 800, 0);

		text(name, 400, 200);
		circle(400, 400, length);
		stroke(x, y, 0);
		noFill();
	}

}