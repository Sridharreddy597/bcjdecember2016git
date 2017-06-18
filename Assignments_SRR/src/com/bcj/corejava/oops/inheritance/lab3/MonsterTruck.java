package com.bcj.corejava.oops.inheritance.lab3;
/**
 * @author Bootcamp User 005
 * this class is defined to call the methods present in the parent class 
 * it extends the Truck class
 *
 */
public class MonsterTruck  extends Truck{
	 public void m1()
		{
	 		System.out.println("monster 1");
	 		
		}
	 public void m2()
	 {
		 super.m1();
	 }
	 public String toString() {
	        return "monster "+super.toString() ;
	    }
			
	public static void main(String[] args) {
	    MonsterTruck mt= new MonsterTruck();
		mt.m1();
		mt.m2();
		System.out.println(mt);
		
		
		
		
	

	}
	
	}
 /**
 * @author Bootcamp User 005
 * this class has some methods which are usefull for the  other class 
 *
 */
class Car {
    public void m1() {
        System.out.println("car 1");
    }

    public void m2() {
        System.out.println("car 2");
    }

    public String toString() {
        return "vroom";
    }
}

 /**
 * @author Bootcamp User 005
 *this class is defined to call the super class method in the other method m1()
 */
class Truck extends Car {
    public void m1() {
        System.out.println("truck 1");
        super.m1();
    }
     
    public void m2() {
        super.m1();
    }
     
    public String toString() {
        return super.toString() + super.toString();
    }
}