package com.joker.sridhar.lab3;

public class Employee {
		int Employeeid	;
	    char gender ;
	 	float  Allowances;
	 	double basicSalary;
		
		public void setGender(char gender) {
			this.gender = gender;
		}
		public char getGender() {
			return gender;
		}


		public float getAllowances() {
			return Allowances;
		}

		public void setAllowances(float allowances) {
			Allowances = allowances;
		}

		public double getBasicSalary() {
			return basicSalary;
		}

		public void setBasicSalary(double basicSalary) {
			this.basicSalary = basicSalary;
		}

		 
Employee(int id){
	this.Employeeid=id;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e=new Employee(1);


e.setBasicSalary(5000.71582);
e.setAllowances(500.45f);
e.setGender('M');
System.out.println("employee id :"+e.Employeeid);
System.out.println("gender:"+e.gender);
System.out.println("basic salary :"+e.basicSalary);
System.out.println("allowances: "+e.Allowances);

	}

}
