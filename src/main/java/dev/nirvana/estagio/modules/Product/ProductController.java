package dev.nirvana.estagio.modules.Product;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {
  @Autowired
  Logger logger = LoggerFactory.getLogger(ProductController.class);
  @Autowired
  private ProductService service;

  @GetMapping
  public ArrayList<Product> listProducts() {
    logger.info("Listing All Products");
    return this.service.findAll();
  }

  @PostMapping
  public void addNewProduct(@RequestBody Product product) {
    logger.info("Adding new product: ", product);
    this.service.addOne(product);
  }
}
