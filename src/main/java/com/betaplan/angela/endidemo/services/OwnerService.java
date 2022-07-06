package com.betaplan.angela.endidemo.services;


import com.betaplan.angela.endidemo.models.Owner;
import com.betaplan.angela.endidemo.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {
    @Autowired
    private OwnerRepository ownerRepo;

    public List<Owner>getAll(){
        return ownerRepo.findAll();
    }
}
