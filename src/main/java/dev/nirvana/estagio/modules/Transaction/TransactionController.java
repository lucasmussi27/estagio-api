package dev.nirvana.estagio.modules.Transaction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.nirvana.estagio.modules.utils.GenericController;

@RestController
@RequestMapping("/transactions")
public class TransactionController extends GenericController<Transaction,TransactionService> {}
