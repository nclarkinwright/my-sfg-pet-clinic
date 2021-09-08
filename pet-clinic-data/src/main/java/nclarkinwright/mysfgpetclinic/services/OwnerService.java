package nclarkinwright.mysfgpetclinic.services;

import nclarkinwright.mysfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
