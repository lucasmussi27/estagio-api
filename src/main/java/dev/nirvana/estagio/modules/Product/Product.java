package dev.nirvana.estagio.modules.Product;
import javax.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString(of = "id")
@Table(name = "product")
public class Product {
  @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id;

  @Column(name="prod_name", unique=true)
  private String name;
}