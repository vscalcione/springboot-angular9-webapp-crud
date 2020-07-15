package it.vscalcione.springboot.angular.crudapplication.beans;

import java.io.Serializable;

public class EmployeeDto implements Serializable {

    private static final long serialVersionUID = -923610875895985880L;
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String role;

    public EmployeeDto() {
    }

    public EmployeeDto(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
