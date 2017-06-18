package com.bcj.spring;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

public class DrawingApp {
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("applicationContext.xml");  
		BeanFactory factory=new XmlBeanFactory(resource);
	   Triangle triangle =	(Triangle)factory.getBean("triangle");
		triangle.draw();
		
	}

}
