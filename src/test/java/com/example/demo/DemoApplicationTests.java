package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
class DemoApplicationTests {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplicationTests.class, args);
		System.out.println(context.getClass().getName());
		String[] beanNames = context.getBeanDefinitionNames();
		//확인해보기
		for(String beanName : beanNames){
			if(!beanName.startsWith("org.") && !beanName.startsWith("spring."))
			{
				System.out.println(beanName);
			}
		}
		MyBean myBean = (MyBean) context.getBean("myBean");
////		Person person = (Person) context.getBean("person");
//		Person person = (Person) context.getBean(Person.class);
		var person = (Person) context.getBean("helloMyPerson");
		System.out.println(person);
	}
}
