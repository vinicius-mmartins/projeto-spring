package one.digitalinoovation.projetospring.repository;

import one.digitalinoovation.projetospring.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}