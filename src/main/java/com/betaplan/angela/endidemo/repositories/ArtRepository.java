package com.betaplan.angela.endidemo.repositories;


import com.betaplan.angela.endidemo.models.Art;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
//interacts with our model to create,update our queries
@Repository
public interface ArtRepository extends CrudRepository<Art, Long> {
    List<Art> findAll();
}

