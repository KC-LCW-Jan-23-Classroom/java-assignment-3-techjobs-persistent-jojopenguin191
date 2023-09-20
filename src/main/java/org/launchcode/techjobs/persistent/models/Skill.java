package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {


    @NotBlank (message = "Field cannot be blank")
    @Size(min = 1, max = 500, message = "Must contain between 1 and 500 characters")
    private String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    public Skill() {
    }

    //getter
    public List getJobs() {
        return jobs;
    }

    public void setJobs(List jobs) {
        this.jobs = jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}