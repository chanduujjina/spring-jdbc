package com.baeldung.spring.jdbc.template.testing;

import java.sql.Blob;

public class Employee {
    

	private int id;

    private String firstName;

    private String lastName;
    
    private Blob sourceMessage;


    public Employee(int id, String firstName, String lastName,Blob sourceMessage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sourceMessage = sourceMessage;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }


}
