package com.management.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;


@Entity
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private String cin;
    private String nom;
    private String prenom;
    private String tel;
    //private String mail;
    private String adresse;

    private String login;
    private String password;

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", cin=" + cin +
                ", nom='" + nom + '\'' +
                ", prenom=" + prenom +
                ", tel=" + tel +
                //", email=" + mail +
                ", adresse=" + adresse+
                ", login=" + login+ ", " +
                "password=" + password+

                '}';
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }
    public Client(String cin, String nom, String prenom,String tel, String adresse,String login, String password) {
        super();
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        //this.mail = mail;
        this.tel = tel;
        this.adresse = adresse;
        this.login = login;
        this.password = password;
    }

    public Client() {
        super();
    }

    public String getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }
    public String getLogin() { return login; }

    public String getTel() {
        return tel;
    }

    public String getPassword() {
        return password;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
