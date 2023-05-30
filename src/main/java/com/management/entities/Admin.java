package com.management.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdmin;
    private String username;
    private String password;

    public Admin(String login, String password) {
        super();
        this.username = login;
        this.password = password;
    }

    public Admin() {super();}

    public String getUsername() {
        return username;
    }

    public void setUsername(String login) {
        this.username = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Long idAdmin) {
        this.idAdmin = idAdmin;
    }

    @Override
    public String toString() {
        return "AdminEntitie{" +
                "idAdmin='"+ idAdmin + '\''+
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
