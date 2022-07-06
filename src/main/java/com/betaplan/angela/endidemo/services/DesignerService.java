package com.betaplan.angela.endidemo.services;


import com.betaplan.angela.endidemo.models.Designer;
import com.betaplan.angela.endidemo.repositories.DesignerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignerService {
    @Autowired
    private DesignerRepository designerRepo;

    public List<Designer>getAll(){
        return designerRepo.findAll();
    }
    //for the trainers that are already added method replace the above line with
    //public List<Designer>getAll(Art art){
    //        return designerRepo.findByArtsNotContains(art);
    //    }


    public Designer getById(Long id){
        return designerRepo.findAById(id).orElse(null);
    }



}
