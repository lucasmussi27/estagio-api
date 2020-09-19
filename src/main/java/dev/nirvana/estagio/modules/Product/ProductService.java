package dev.nirvana.estagio.modules.Product;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
  @Autowired
  private ProductRepository repository;

  public void addOne(Product product) {
    this.repository.save(product);
  }

  public ArrayList<Product> findAll() {
    return (ArrayList<Product>) this.repository.findAll();
  }
}
