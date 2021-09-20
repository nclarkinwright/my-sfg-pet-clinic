package nclarkinwright.mysfgpetclinic.repositories;

import nclarkinwright.mysfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
