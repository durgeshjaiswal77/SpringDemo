package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
	Resource resource=new ClassPathResource("applicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

	ConstStu student=(ConstStu)context.getBean("studentbean");
	Student students=(Student)factory.getBean("studentbeans");
	student.show();
	students.displayInfo();
}
}
