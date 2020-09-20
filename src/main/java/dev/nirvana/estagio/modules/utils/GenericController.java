package dev.nirvana.estagio.modules.utils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class GenericController<E,S extends GenericService> {
  @Autowired
  private S service;

  @GetMapping
  public List<E> listTransactions() {
    return this.service.getAll();
  }

  @GetMapping("/{id}")
  public E findById(@PathVariable("id") int id) {
    return (E) this.service.getOne(id);
  }

  @PostMapping
  public void addProduct(@RequestBody E obj) {
    this.service.addOne(obj);
  }

  @DeleteMapping
  public void removeProduct(@PathVariable("id") int id) {
    this.service.removeOne(id);
  }
}
