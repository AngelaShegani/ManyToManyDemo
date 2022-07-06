package com.betaplan.angela.endidemo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

//responsible to create new entities or tables into our db
@Entity
@Table(name="arts")
public class Art {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 2, max = 200)
    private String title;

    @NotBlank
    @Size(min = 2, max = 200)
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="owner_id")
    private Owner owner;

    //Many to many relationship
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "arts_designers",
            joinColumns = @JoinColumn(name = "art_id"),
            inverseJoinColumns = @JoinColumn(name = "designer_id")
    )
    private List<Designer> designers ;
    private String url;

    public List<Designer> getDesigners() {
        return designers;
    }

    public void setDesigners(List<Designer> designers) {
        this.designers = designers;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Art() {

    }

    public Long getId() {
        return id;
    }

    public Art(Long id, String title, String description, Owner owner, String url) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.owner = owner;
        this.url = url;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

