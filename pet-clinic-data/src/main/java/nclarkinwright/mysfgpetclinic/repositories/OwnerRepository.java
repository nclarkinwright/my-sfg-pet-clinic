package nclarkinwright.mysfgpetclinic.repositories;

import nclarkinwright.mysfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
