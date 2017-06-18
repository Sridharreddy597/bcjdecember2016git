package com.bcj.corejava.oops.inheritance.lab6;

public class DemoInherit {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address adr=new Address("8231 carpenter pkwy", "Irving", "Texas", 75038);
		Hostelite  hstl=new Hostelite("Aaradhya", 105,"double" , "Tommy", 75.6f, 'H',"CSE", adr, 4);
		
		System.out.println();
		
		
		System.out.println(" ----------------Permanent Address-----------");
		if(hstl.validateStudentName()){
			if(hstl.validatebranchName()&& hstl.validateExamMarks())
			{
				System.out.println(  "student name                : "
						+ hstl.getStudentName() + "\n" + "qualifyingExam Marks        : "
						+ hstl.getQualifyingExamMarks()+"\n" + "Residential status          : " + hstl.getResidentialStatus()
						+ "\n" + "current Year of engineering : " + hstl.getYearOfEngg() + "\n" + "Branch name                 : "
						+ hstl.getBranchName()+"\n"
						+"permanent address           : " +hstl.getPermanentAddress()+"\n"
						+"hostel Name                 : "+hstl.getHostelName()+"\n"
						+"Room No                     : "+hstl.getRoomNumber()+"\n"
						+"Room Type                   : "+hstl.getRoomType());
				
			}
			Address  residentialAddress =new Address("123 Greenway Dr", "Irving", "Texas", 75038);
			
			
			DayScholar dschlr= new DayScholar(residentialAddress, 10, "Timmy", 80.0f, 'D', "CSE", adr, 4);
			System.out.println();
			
			
			System.out.println(" ----------------Residential Address-----------");
			if(dschlr.validateStudentName()){
				if(dschlr.validatebranchName()&& dschlr.validateExamMarks())
				{
					System.out.println(  "student name                : "
							+ dschlr.getStudentName() + "\n" + "qualifyingExam Marks        : "
							+ dschlr.getQualifyingExamMarks()+"\n" + "Residential status          : " + dschlr.getResidentialStatus()
							+ "\n" + "current Year of engineering : " + dschlr.getYearOfEngg() + "\n" + "Branch name                 : "
							+ dschlr.getBranchName()+"\n"
							
							+"current year of engg        : "+dschlr.getYearOfEngg()+"\n"
							+"branch Name                 : "+dschlr.getBranchName()+"\n"
							+"residentialAddress          : "+dschlr.getResidentialAddress()+"\n"
							+"distance                    : "+dschlr.getDistance()+"\n"
							+"permanent address           : "+dschlr.getPermanentAddress()+"\n"
						);
					
				}

	}
	}

	}}
