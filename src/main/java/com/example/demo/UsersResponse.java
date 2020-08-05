package com.example.demo;

public class UsersResponse {
    private int id;
    private String name;
    private int page;

    public UsersResponse(int id, String name, int page) {
        this.id = id;
        this.name = name;
        this.page = page;
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

    public int getPage() {
        return page;
    }

    public int setPage(int page) {
        if(page == Integer.parseInt(null)) {
            return this.page = 10;
        }
        else{
            this.page = page;
        }
        return page;
    }
}
