package edu.kiet.springfirst;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("edu/kiet/springfirst/studentbean.xml");
    	Student s1 = context.getBean("student",Student.class);
    	Faculty f1= context.getBean("faculty",Faculty.class);
    	f1.displayInfo();
        System.out.println( s1 );
        Resource resource =new ClassPathResource("edu/kiet/springfirst/studentbean.xml");
        BeanFactory factory =new XmlBeanFactory(resource);
        Student s2 = factory.getBean("student",Student.class);
        System.out.println( s2 );
        Car ca =context.getBean("car",Car.class);
        ca.display();
    }
}
