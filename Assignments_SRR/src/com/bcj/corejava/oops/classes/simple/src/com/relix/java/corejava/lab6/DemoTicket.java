package com.relix.java.corejava.lab6;

public class DemoTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ticket newTicket=new Ticket();
		Ticket newTicket1=new Ticket(18,1);
		Ticket newTicket2=new Ticket(2,18);
		System.out.println("amount of money to be paid for tiket 1 "+ newTicket.getTicketAmount());
		System.out.println("amount of money to be paid for tiket 2 "+ newTicket1.getTicketAmount());
		System.out.println("amount of money to be paid for tiket 3 "+ newTicket2.getTicketAmount());
	}

}
