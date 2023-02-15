package com.kvnp.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.kvnp.demo.dao.UserRepository;
import com.kvnp.demo.entities.User;


@SpringBootApplication
//@ComponentScan("com.kvnp.demo")
public class MachaTestProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(MachaTestProjectApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		User user=new User();
		user.setName("KVNP");
		user.setCity("hyd");
		user.setStatus("programmer");
		
		User user2=new User();
		user2.setName("KVNP");
		user2.setCity("hyd");
		user2.setStatus("programmer");
		
		List<User> users = List.of(user,user2);
		
		User resultUser = userRepository.save(user);
		System.out.println(resultUser);
		//create object of user
		
	}

}
