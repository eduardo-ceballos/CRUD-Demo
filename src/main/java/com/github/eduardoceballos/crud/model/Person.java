package com.github.eduardoceballos.crud.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TBL_PERSON")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long Id;

    @NotBlank(message = "Name is mandatory")
    @Size(min=2, max=100, message = "Name should be 2 to 100 chars in length")
    @Column(name = "NAME")
    private String Name;

    @NotNull
    @Column(name = "DOC_NUMBER")
    private String Document;

    @NotBlank(message = "Birth date is mandatory")
    @Column(name = "BIRTH_DATE")
    private String BirthDate;

    @NotBlank(message = "Email is mandatory")
    @Column(name = "EMAIL")
    private String EMail;

    @NotBlank(message = "Telephone is mandatory")
    @Column(name = "TELEPHONE_NUMBER")
    private String Telephone;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDocument() {
        return Document;
    }

    public void setDocument(String document) {
        Document = document;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public Person() {
    }

    public Person(long id, String name, String document, String birthDate, String EMail, String telephone) {
        Id = id;
        Name = name;
        Document = document;
        BirthDate = birthDate;
        this.EMail = EMail;
        Telephone = telephone;
    }
}
