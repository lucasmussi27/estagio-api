package dev.nirvana.estagio.modules.Transaction;
import java.sql.Date;
import javax.persistence.*;
import dev.nirvana.estagio.modules.Product.Product;
import dev.nirvana.estagio.modules.utils.Status;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transaction")
@EqualsAndHashCode(of = "id")
@ToString(of = "id")
public class Transaction {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "tst_product")
  private Product product;
  @Column(name = "tst_quantity")
  private int quantity;
  @Column(name = "tst_date")
  private Date date;
  @Column(name = "tst_status")
  private Status status;
}
