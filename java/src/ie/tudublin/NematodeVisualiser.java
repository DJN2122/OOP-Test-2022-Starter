/*
@Author: David Niculita
@Student No: C20513979
A Java Program to attempt to create and number of different metanodes using processing.
*/

package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;
	
public class NematodeVisualiser extends PApplet
{
	float height = 800;
	float width = 800;

	ArrayList<Nematode> nematodes = new ArrayList<Nematode>(); // array list for the nematodes

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{


		}	
		
		if (keyCode == RIGHT)
		{
			

		}
	}
	
	public void draw() // can not draw shapes.
	{	
		stroke(255, 0, 0);
		strokeWeight(3);

		// left arrow
		line(width - 650, height / 2 , width - 550, height / 2);
		line(width - 650, height / 2, width - 630, height - 420);
		line(width - 650, height / 2, width - 630, height - 380);

		// right arrow
		line(width - 150, height / 2, width - 250, height / 2);
		line(width - 150, height / 2, width - 170, height - 380);
		line(width - 150, height / 2, width - 170, height - 420);

		for(Nematode n:nematodes)
		{
			n.render(this);
		}

	}
	
	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "header"); // calling loadTable function to read in csv file

		for(TableRow r:table.rows())
		{
			Nematode n = new Nematode(r);
			nematodes.add(n);
		}
	}
	
	public void settings()
	{
		size(800, 800);
	}

	public void setup() //setup for visuals
	{
		colorMode(RGB);
		background(0);
		smooth();	
		loadNematodes();		
	}

}