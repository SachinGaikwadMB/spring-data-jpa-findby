package com.mb.api.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.mb.api.persistance.repository.ProductRepository;

@Component
public class TestRunner implements CommandLineRunner
{
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception
	{
		//productRepository.save(new Product(1l,"BTL", 2.2, "NIT"));
		
		//productRepository.findByProductCode("PEN").forEach(System.out::println);
		//productRepository.findByProductCode("PEN").forEach(System.out::println);;
		//productRepository.findByProductCostGreaterThan(2.2).forEach(System.out::println);
		//productRepository.findByProductCostGreaterThanEqual(2.2).forEach(System.out::println);
		//productRepository.findByProductCostLessThan(3.2).forEach(System.out::println);
		//productRepository.findByProductCostLessThanEqual(3.4).forEach(System.out::println);
		//productRepository.findAll().forEach(System.out::println);
		
		//productRepository.findByProductVenderIsNull().forEach(System.out::println);
		
		//productRepository.findByProductCostAndProductVender(2.2, "NIT").forEach(System.out::println);
		
		
		//Starting with B
		//productRepository.findByProductCodeLike("B%").forEach(System.out::println);
		
		//Ending with T
		//productRepository.findByProductVenderLike("%T").forEach(System.out::println);
		
		//atleast one letter
		//productRepository.findByProductVenderLike("%T%").forEach(System.out::println);
		
	
		//productRepository.findByProductCodeStartingWith("B").forEach(System.out::println);
	
		//productRepository.findByProductVenderEndingWith("T").forEach(System.out::println);
		
		//productRepository.findByProductVenderContaining("T").forEach(System.out::println);
	
		/* 
		 * ****************CUSTOM QUERY METHODS******************************
		 * 1. findBy() (Only Select Operation)
		 * 2. @Query()	(Only Select + Non Select Operation)
		 
		 * 
		 * 
		 * 
		 * 
		 * */
	
	
	}

}
