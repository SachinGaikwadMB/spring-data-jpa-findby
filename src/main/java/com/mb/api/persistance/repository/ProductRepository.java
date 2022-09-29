package com.mb.api.persistance.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mb.api.persistance.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>
{
	//List<Product> findByProductCode(String productCode);
	
	//List<Product> findByProductCostGreaterThanEqual(Double productCost);
	
	//List<Product> findByProductCostLessThan(Double productCost);
	
	//List<Product>  findByProductCostLessThanEqual(Double productCost);
	
	//All the Data except null values
	//select * from products where product_vender is not null
	//List<Product> findByProductVenderIsNull();
	
	//List<Product> findByProductCostAndProductVender(Double productCost, String productVender);
	
	
	//List<Product> findByProductCodeLike(String productCode);
	//List<Product> findByProductVenderLike(String productVender);
	
	//STARTINGWITH WITHOUT SPECIFYING %
	//List<Product> findByProductCodeStartingWith(String productCode);
	
	//ENDING WITH WITHOUT SPECIFYING %
	//List<Product> findByProductVenderEndingWith(String productVender);
	
	//Containing without specifying  the %
	
	//List<Product> findByProductVenderContaining(String productVender);
	
	
	
}
