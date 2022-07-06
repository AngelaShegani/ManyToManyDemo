package com.betaplan.angela.endidemo.services;

import com.betaplan.angela.endidemo.models.Art;
import com.betaplan.angela.endidemo.models.Designer;
import com.betaplan.angela.endidemo.repositories.ArtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtService {

    @Autowired
    private ArtRepository artRepo;

//constructor
    // public ArtService(ArtRepository artRepo) {
    //     this.artRepo = artRepo;
    // }

    public List<Art> getAllArts(){
        //Business Logic
        return artRepo.findAll();
    }
    //dependency injectioin
    // Find all arts
    //create new art
    public void createArt(Art art){
        artRepo.save(art); //goes into art repo and sees if the method is there if not it will go to the parent interface CRUD and search there
        //we go into the controller to call this method
    }
    //update new arts
    public void updateArt(Art art){
        artRepo.save(art);
    }

    //delete art
    public void deleteArt(Long id){
        artRepo.deleteById(id);
    }

    //Get Art details
    public Art artDetails(Long id){
      return  artRepo.findById(id).orElse(null);
    }

    //Createa method
    public void assignDesigner(Art art, Designer designer){
        //take the list of designers to that art and one more designer to that
        List<Designer> designers=art.getDesigners();
        designers.add(designer);
        artRepo.save(art);
        //go to the controller and continue with the method
    }
}
