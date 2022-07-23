package curso.api.rest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinguagemRepository extends CrudRepository<Linguagem, String>{

}
