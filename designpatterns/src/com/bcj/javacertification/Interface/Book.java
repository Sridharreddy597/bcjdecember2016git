package com.bcj.javacertification.Interface;

interface Readable{
	public void readBook();
	public void setBookMark();
}

 abstract class Book implements Readable{
	public  void readBook(){
		
	}
	
}

class EBook extends Book{

	@Override
	public void setBookMark() {
		
		
	}
	
}
