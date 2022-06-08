package RAMNA;

import java.lang.Math;
public class circles {
private double pi;
private double radius;

circles(double pi, int radius) 
{
	this.pi = pi;
	this.radius =radius;
	
}

public double getPi() 
{
	return pi;
}
public void setPi(double pi) 
{
	this.pi = pi;
}

public double getRadius() 
{
	return radius; 
}
public void setRadius(double radius) 
{
	this.radius =radius;
}
	


public static void main(String[] args) 
{
	System.out.println("Old values");
	circles obj = new circles(3.142,8);
	circles obj1 = new circles(3.142,100);
	System.out.println("VOLUME " + 4/3* obj.getPi() *Math.pow(obj.getRadius(),3) );
	System.out.println("Surface area " + 4* obj.getPi() *Math.pow(obj.getRadius(),2) );

	
	

 
// update the name, this object is mutable
	System.out.println("New values");
	obj.setPi(3.14);
	obj1.setRadius(4);
	System.out.println("VOLUME " + 4/3* obj.getPi() *Math.pow(obj.getRadius(),3) );
	System.out.println("Surface area " + 4* obj.getPi() *Math.pow(obj.getRadius(),2) );
	
	
	
 
}
}
