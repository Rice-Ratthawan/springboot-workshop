package com.example.demo;

public class UsersResponse {
    private int id;
    private String name;
    private int page;

    public UsersResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // PO (Plain Old Java Object: property,getter,setter)
    // Getter/Setter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
