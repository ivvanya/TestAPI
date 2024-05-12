package com.example.demo;

import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		SessionFactory sessionFactory = new Configuration().addAnnotatedClass(User.class).buildSessionFactory();
//		Session session = sessionFactory.getCurrentSession();
//		session.beginTransaction();
//		User user = new User(1, "admin", "admin", true, new Date("01-01-2000"), true);
//		session.save(user);
//		session.getTransaction().commit();
//		session.close();
	}
}
