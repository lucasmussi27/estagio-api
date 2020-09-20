package dev.nirvana.estagio.modules.Transaction;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
  @Autowired
  private TransactionRepository repository;

  public List<Transaction> getAll() {
    return this.repository.findAll();
  }

  public Transaction findById(int id) {
    return this.repository.getOne(id);
  }

  public void addTransaction(Transaction tst) {
    this.repository.save(tst);
  }

  public void removeTransaction(int id) {
    this.repository.deleteById(id);
  }
}
