package com.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.to.Student;

public class SpringMain {

	public static void main(String[] args) {

		 Resource resource=new ClassPathResource("applicationContext.xml");  
		    BeanFactory factory=new XmlBeanFactory(resource);  
		      
		    Student student=(Student)factory.getBean("studentbean");  
		    student.displayInfo();  
	}

}
