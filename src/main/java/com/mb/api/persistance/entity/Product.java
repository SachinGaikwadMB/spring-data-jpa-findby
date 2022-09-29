package com.mb.api.persistance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "product_code")
	private String productCode;
	
	@Column(name = "product_cost")
	private Double productCost;
	
	
	@Column(name = "product_vender")
	private String productVender;
}
