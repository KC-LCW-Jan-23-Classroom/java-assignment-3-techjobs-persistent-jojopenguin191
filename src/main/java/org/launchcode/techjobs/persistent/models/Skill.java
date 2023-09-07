package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {


    @NotBlank (message = "Field cannot be blank")
    @Size(min = 1, max = 500, message = "Must contain between 1 and 500 characters")
    private String description;

    public Skill() {
    }

    //getter
    public String getDescription() {
        return description;
    }

    //setter
    public void setDescription(String location) {
        this.description = location;
    }
}