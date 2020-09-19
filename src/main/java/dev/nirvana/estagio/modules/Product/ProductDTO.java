package dev.nirvana.estagio.modules.Product;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDTO {
  private int id;
  private String name;

  public static ProductDTO of (Product request) {
    return ProductDTO.builder()
            .id(request.getId())
            .name(request.getName())
            .build();
  }
}
