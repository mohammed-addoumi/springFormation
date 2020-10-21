package org.spring.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {



	public static void main(String[] args) {    
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Inwi sim=context.getBean("sim",Inwi.class);
        System.out.println(sim.getName());
        System.out.println(sim.getId());
        System.out.println(sim.getUser().getId());
        System.out.println(sim.getUser().getName());
        
	}
}
