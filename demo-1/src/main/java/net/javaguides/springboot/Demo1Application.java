package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.Customer;
import net.javaguides.springboot.repository.CustomerRepository;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public void run(String...args)throws Exception{
		this.customerRepository.save(new Customer("kavya","kamalesh","kavyak@gmail.com"));
		this.customerRepository.save(new Customer("Davita","janet","davitaj@gmail.com"));
		this.customerRepository.save(new Customer("vishali","kumar","vishalik@gmail.com"));
		
	}

}