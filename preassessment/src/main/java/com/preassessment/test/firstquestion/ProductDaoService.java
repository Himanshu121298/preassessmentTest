package com.preassessment.test.firstquestion;

import java.util.Comparator;
import java.util.List;


import org.springframework.stereotype.Component;


@Component
public class ProductDaoService {
	public List<Product> getSortedProduct(List<Product> product) {
		
		/*Use of Comparator,lambda and Method Reference*/
		
		product.sort(Comparator.comparing(Product::getProductId).thenComparing(Product::getLaunchDate).reversed());
		return product;
	}

}
