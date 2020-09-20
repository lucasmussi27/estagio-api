package dev.nirvana.estagio.modules.Product;
import lombok.*;

@Data
@Builder
public class ProductDTO {
  private int id;
  private String name;
  private float price;
}
