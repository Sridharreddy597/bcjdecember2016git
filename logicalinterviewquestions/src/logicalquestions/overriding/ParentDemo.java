package logicalquestions.overriding;

public class ParentDemo {

	
	
	
	public static void main(String[] args) {
		Parent p =new Parent();
		p.m1(10);
		System.out.println("@@@@@@"+p.a);
		
		
		Child ch =new Child();
		ch.m1(20);
		System.out.println("$$$$$$$"+ch.a);
		
		Parent p1=new Child();
		p1.m1(43);
		System.out.println("%%%%%%%"+p1.a);
	}
}
