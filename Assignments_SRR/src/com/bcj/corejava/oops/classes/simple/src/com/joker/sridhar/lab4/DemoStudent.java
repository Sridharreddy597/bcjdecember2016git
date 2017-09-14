<<<<<<< HEAD
package com.bcj.corejava.oops.classes.simple.src.com.joker.sridhar.lab4;
=======
package com.joker.sridhar.lab4;
>>>>>>> 96b5c57366ad685b6446a1c0f5a3f59608861971

class DemoStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		
		student.setStudentId(1001);
		student.setQualifyingExamMarks(95.0f);
		student.setResidentialStatus('D');
		student.setYearOfEngg(2);
		System.out.println("studentid : "+student.getStudentId());
		System.out.println("qualifying Exam Marks :"+student.getQualifyingExamMarks());
		System.out.println("residential status : "+student.getResidentialStatus());
		System.out.println("current year of engg"+student.getYearOfEngg());
		
		

	}

}
