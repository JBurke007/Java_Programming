package Applet;

import processing.core.*;


// Using the processing package https://processing.org/reference/
public class AppletDraw extends PApplet{
		
	private PImage backgroundImg;
	private String URL = "https://images.trvl-media.com/media/content/shared/images/travelguides/destination/178279/Big-Ben-20648.jpg";
	
	
	public void setup() {
		size(900, 500);
		backgroundImg = loadImage(URL, "jpg");					
	}
	
	public void draw() {
		backgroundImg.resize(0, height);
		image(backgroundImg,0,0);
		stroke(0);		
		// Setting the dynamic sun color
		int[] color = sunColorSec(second());		//calculate color code for sun
		fill(color[0],color[1],color[2]);	//set sun color
		// Creating an ellipse for the sun
		ellipse(width/4,height/5,width/4,height/5);	//draw sun
	}
	
	public int[] sunColorSec(float seconds)
	{
		int[] rgb = new int[3];
		// Scale the brightness of the yellow based on the seconds.  0 seconds 
		// is black.  30 seconds is bright yellow.
		float diffFrom30 = Math.abs(30-seconds);
		
		float ratio = diffFrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		
		//System.out.println("R" + rgb[0] + " G" + rgb[1] + " B" + rgb[2]);
		return rgb;
	}


}