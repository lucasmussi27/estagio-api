package dev.nirvana.estagio.modules.Transaction;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
  @Autowired
  private TransactionService service;
  @Autowired
  Logger logger = LoggerFactory.getLogger(TransactionController.class);

  @GetMapping
  public List<Transaction> listTransactions() {
    try {
      logger.info("Listing all transactions");
    } catch(Exception ex) {
      logger.error("Error during listing all transactions");
    }
    return this.service.getAll();
  }

  @GetMapping("/{id}")
  public Transaction getTransactionById(int id) {
    try {
      logger.info("Getting transaction by Id");
    } catch(Exception ex) {
      logger.error("Error during getting transaction by id");
    }
    return this.service.findById(id);
  }

  @PostMapping
  public void newTransaction(Transaction newTst) {
    try {
      this.service.addTransaction(newTst);
      logger.info("New transaction were added!");
    } catch(Exception ex) {
      logger.error("Error during adding new transaction!");
    }
  }

  @DeleteMapping("/{id}")
  public void delTransaction(int id) {
    try {
      this.service.removeTransaction(id);
      logger.info("A transaction were removed!");
    } catch(Exception ex) {
      logger.error("Error during removing new transaction!");
    }
  }
}
