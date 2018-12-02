package ru.itpark.domain;

import java.util.List;

public class User {
    private int id;
    private String login;
    private String password;
    private List<String> permission;

    public User(int id, String login, String password, List<String> permission) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.permission = permission;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getPermission() {
        return permission;
    }

    public void setPermission(List<String> permission) {
        this.permission = permission;
    }
}
