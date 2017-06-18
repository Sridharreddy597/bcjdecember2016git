package com.bcj.corejava.oops.inheritance.lab4;

public class Student {
	void display(){
		System.out.println("student class");
	}

}
class  UnderGraduate extends Student
{
	 void display(){
		System.out.println("undergarduate class extends student class ");
	}
}
class Fresher extends UnderGraduate
{
	void display(){
		System.out.println("Fresher class extends undergraduate class ");
	}
}
class Junior extends UnderGraduate
{
	
	void display(){
		System.out.println(" Junior class extends undergraduate class ");
	}
	}
class Sophomore extends UnderGraduate
{
	void display(){
		System.out.println(" Sophomore class extends undergraduate class ");
	}
}
class Senior extends UnderGraduate{
	void display(){
		System.out.println(" Senior  class extends undergraduate class ");
	}
}
class GraduateStudent extends Student
{
	void display(){
		System.out.println(" GraduateStudent class extends undergraduate class ");
	}
	}

class MastersStudent extends GraduateStudent
{
	void display(){
		System.out.println(" MastersStudent class extends GraduateStudent class ");
	}
	
	}
class DoctoralStudent extends GraduateStudent
{
	void display(){
		System.out.println(" DoctoralStudent class extends GraduateStudent class ");
	}
	
	}