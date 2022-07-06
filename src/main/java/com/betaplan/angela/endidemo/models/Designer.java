package com.betaplan.angela.endidemo.models;


import javax.persistence.*;
import java.util.List;
import java.util.Locale;

@Entity
@Table(name = "designers")
public class Designer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String speciality;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "arts_designers",
            joinColumns = @JoinColumn(name = "designer_id"),
            inverseJoinColumns = @JoinColumn(name = "art_id")
    )
    private List<Art> arts ;

    public Designer(Long id, String name, String speciality, List<Locale.Category> categories) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;

    }

    public Designer() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Designer(List<Art> arts) {
        this.arts = arts;
    }
}
