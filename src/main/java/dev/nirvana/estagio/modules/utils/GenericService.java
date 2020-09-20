package dev.nirvana.estagio.modules.utils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class GenericService<E,R extends JpaRepository> {
  @Autowired
  private R repository;

  public List<E> getAll() {
    return this.repository.findAll();
  }

  public E getOne(int id) {
    return (E) this.repository.getOne(id);
  }

  public void addOne(E obj) {
    this.repository.save(obj);
  }

  public void removeOne(int id) {
    this.repository.deleteById(id);
  }
}
