package com.bcj.corejava.oops.classes.medium.lab5;

/**
 * @author Bootcamp User 005
 * this class is a demo class it uses all the methods defined 
 *in Point class 
 */
public class DemoPoint {
public static void main(String[] args) {
	

	Point point1=new Point();
	point1.setxCoordinate(10);
	point1.setyCoordinate(12);
	Point point2= new Point();
	point2.setxCoordinate(50);
	point2.setyCoordinate(42);
	System.out.println("distance :"+Point.distanceFromAnotherPoint(point1, point2));
	System.out.println("slope with other point   : "+point1.slopeWithAnotherPoint(point1, point2));
	midPoint(point1, point2);
	System.out.println();
	System.out.println("distance : "+distanceFromOrigin(point1));
	if(isVertical(point1))
		System.out.println("given points are parallel to y-axis ");
	else 
		System.out.println("given points are not parallel to y axis ");
	
	
	if(isHorizontal(point1))
	System.out.println("given points are parallel to x-axis ");
	else 
		System.out.println("given points are not parallel to x axis ");
	
	
	
}


/**
 * @param p1
 * @return
 * this method is defined to check the given point is horizontal
 */
private static boolean isHorizontal(Point p1) {
	// TODO Auto-generated method stub
	if(p1.getxCoordinate()==0)
		return true;
		else 
			return false;
	
	
}


/**
 * @param p1
 * @return
 * this method is defined  to check the given point is vertical
 */
private static boolean isVertical(Point p1) {
	// TODO Auto-generated method stub
	if(p1.getyCoordinate()==0)
		return 
				true;
		else 
			return false;
	
	
	
}


/**
 * @param p1
 * @param p2
 * this method is used to calculate the midpoint of two given points 
 */
private static void midPoint(Point p1, Point p2) {
	// TODO Auto-generated method stub
	double yMidPoint=(p1.getyCoordinate()+p2.getyCoordinate())/2;
	double xMidPoint=(p1.getxCoordinate()+p2.getxCoordinate())/2;
	System.out.printf("mid point of two given points is : ("+yMidPoint+","+xMidPoint+")");
	}
/**
 * @param p1
 * @return
 * this method is used to calculate the distance from the origin from a given point  
 */
private static double distanceFromOrigin(Point p1) {
	// TODO Auto-generated method stub
	
	 double distance = Math.sqrt(Math.pow(p1.getxCoordinate(), 2)+Math.pow(p1.getxCoordinate(), 2));
      return distance ;

}
}
