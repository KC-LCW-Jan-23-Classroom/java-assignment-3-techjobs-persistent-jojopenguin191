package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank (message = "Field cannot be blank")
    @Size(max = 100, message = "Must contain 100 or fewer characters")
    private String location;

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

