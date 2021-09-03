package nclarkinwright.mysfgpetclinic.services;

import nclarkinwright.mysfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
