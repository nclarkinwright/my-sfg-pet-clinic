package nclarkinwright.mysfgpetclinic.repositories;

import nclarkinwright.mysfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
