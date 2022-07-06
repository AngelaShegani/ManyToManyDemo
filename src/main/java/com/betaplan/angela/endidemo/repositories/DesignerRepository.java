package com.betaplan.angela.endidemo.repositories;

import com.betaplan.angela.endidemo.models.Art;
import com.betaplan.angela.endidemo.models.Designer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DesignerRepository extends CrudRepository<Designer,Long> {
    List<Designer> findAll();

    Optional<Designer> findAById(Long id);

    // Retrieves a list of any art a particular designer
    // does not belong to.
    List<Designer> findByArtsNotContains(Art art);
    //go to the service


}
