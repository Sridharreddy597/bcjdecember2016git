package com.relix.java.corejava.lab6;

public class Ticket {
private int startPoint;
private int endPoint;
private int ticketAmount;

public Ticket(){
	
}
public Ticket(int startPoint, int endPoint){
	this.startPoint=startPoint;
	this.endPoint=endPoint;
			
	
}

public void  calculateTicketAmt (){
	this.ticketAmount=(endPoint-startPoint)*20;
}

	public int getStartPoint() {
	return startPoint;
}
public int getEndPoint() {
	return endPoint;
}
public int getTicketAmount() {
	if(validateTravelPoints())
		calculateTicketAmt();
	return ticketAmount;
}
	

		
	public boolean	validateTravelPoints() {
		if(startPoint>0&&startPoint<endPoint)
			return true;
		else
			return false;
	}

	

}
