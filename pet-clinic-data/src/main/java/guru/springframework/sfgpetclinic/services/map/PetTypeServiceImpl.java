package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeServiceImpl extends AbstractMapService<PetType, Long> implements PetTypeService {
  @Override
  public Set<PetType> findAll() {
    return super.findAll();
  }

  @Override
  public PetType findByID(Long id) {
    return super.findByID(id);
  }

  @Override
  public PetType save(PetType object) {
    return super.save(object);
  }

  @Override
  public void delete(PetType object) {
    super.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }
}
