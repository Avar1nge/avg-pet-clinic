package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by jt on 7/18/18.
 */
public interface VetService extends CrudService<Vet, Long> {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
