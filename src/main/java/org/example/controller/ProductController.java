package org.example.controller;


import org.example.domain.Product;
import org.example.service.ProducerService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api")
public class ProductController {
 

//	@Autowired
//	ProducerService  PRODUCER_SERVICE ;

	@PostMapping(path = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
	public Product save(@RequestBody Product product) {
		String productname = product.getName();
		System.out.println("productname="+productname);
		return product;
	}

	@GetMapping(path = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
	public Product get(HttpServletResponse response){
		response.addHeader("Access-Control-Allow-Origin", "*");
		Product product = new Product();
		product.setId(3L);
		product.setName("lucas");
		System.out.println("productname="+product.getName());
		return product;
	}

	
 
}