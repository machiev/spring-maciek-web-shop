package com.machiev.domain;

public class User {

    public static User newUser(Long id, String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);

        return user;
    }

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
