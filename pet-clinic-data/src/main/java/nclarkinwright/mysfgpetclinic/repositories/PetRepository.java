package nclarkinwright.mysfgpetclinic.repositories;

import nclarkinwright.mysfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
