package com.baeldung.spring.jdbc.template.inclause;

import java.sql.Blob;

public class Employee {
    public Blob getSourceMessage() {
		return sourceMessage;
	}

	public void setSourceMessage(Blob sourceMessage) {
		this.sourceMessage = sourceMessage;
	}

	private int id;

    private String firstName;

    private String lastName;
    
    private Blob sourceMessage;


    public Employee(int id, String firstName, String lastName,Blob sourceMessage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sourceMessage= sourceMessage;
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
