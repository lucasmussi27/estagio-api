package dev.nirvana.estagio.modules.Transaction;
import java.sql.Date;
import dev.nirvana.estagio.modules.Product.Product;
import dev.nirvana.estagio.modules.utils.Status;
import lombok.*;

@Data
@Builder
public class TransactionDTO {
  private int id;
  private Product product;
  private int quantity;
  private Date date;
  private Status status;
}
