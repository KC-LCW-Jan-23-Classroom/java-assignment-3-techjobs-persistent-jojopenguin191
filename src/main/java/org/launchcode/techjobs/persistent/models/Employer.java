package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank (message = "Field cannot be blank")
    @Size(min = 1, max = 100, message = "Must contain between 1 and 100 characters")
    private String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    public Employer() {
    }

    //getter
    public String getLocation() {

        return location;
    }

    //setter
    public void setLocation(String location) {

        this.location = location;
    }

}

