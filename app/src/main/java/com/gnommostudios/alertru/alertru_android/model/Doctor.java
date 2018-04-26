package com.gnommostudios.alertru.alertru_android.model;

public class Doctor {
    private String name;
    private String surname;
    private String username;
    private String email;
    private boolean emailVerified;
    private String id;
    private String province;

    public Doctor(String name, String surname, String username, String email, boolean emailVerified, String id, String province) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.email = email;
        this.emailVerified = emailVerified;
        this.id = id;
        this.province = province;
    }

    public Doctor(String name, String surname, String username, String email, String id, String province) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.email = email;
        this.id = id;
        this.province = province;
    }

    public Doctor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", emailVerified=" + emailVerified +
                ", id='" + id + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
