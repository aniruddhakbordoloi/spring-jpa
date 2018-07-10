package com.codesmack.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Aniruddha on 10-07-2018.
 */
@Entity
public class Employee {
    public Employee() {

    }

    @Id
    private long id;

    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
