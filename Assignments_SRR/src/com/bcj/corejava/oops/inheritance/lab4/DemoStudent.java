package com.bcj.corejava.oops.inheritance.lab4;

public class DemoStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student s1=new Student();
		s1.display();
		Student s2=new  UnderGraduate();
		s2.display();
		Student s3= new Fresher();
		s3.display();
		Student s4= new Junior();
		s4.display();
		Student s5= new Senior();
		s5.display();
		Student s6=new Sophomore();
		s6.display();
		
		System.out.println();
		System.out.println();
		UnderGraduate ug1= new Fresher();
		ug1.display();
		UnderGraduate ug2= new Junior();
		ug2.display();
		UnderGraduate ug3=new Senior();
		ug3.display();
		UnderGraduate ug4= new Sophomore();
		ug4.display();
		System.out.println();
		System.out.println();
		Student s7= new GraduateStudent();
		s7.display();
		Student s8= new MastersStudent();
		s8.display();
		Student s9=new DoctoralStudent();
		s9.display();
		System.out.println();
		System.out.println();
		GraduateStudent gs1=new MastersStudent();
		gs1.display();
		GraduateStudent gs2=new DoctoralStudent();
		gs2.display();
		
		
				
	}

}
