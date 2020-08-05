package com.example.demo;

public class UsersResponse {
    private int id;
    private String name;

    public UsersResponse(int id, String name) {
        setId(id);
        setName(name);
    }

    // PO (Plain Old Java Object)
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
