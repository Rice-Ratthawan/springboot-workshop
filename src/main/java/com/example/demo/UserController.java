package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/users")
    public List<UsersResponse> getAllUser() {
        List<UsersResponse> usersResponseList = new ArrayList<>();
        usersResponseList.add(new UsersResponse(1, "User 1", 20));
        usersResponseList.add(new UsersResponse(2, "User 2" ,10));
        usersResponseList.add(new UsersResponse(3, "User 3" ,10));
        return usersResponseList;
    }

    @GetMapping("/users/{id}")
    public UsersResponse getUserById(@PathVariable int id, int page) {
        return new UsersResponse(id,"User "+id, page);
    }

//    @GetMapping("/users?page={page}")
//    public UsersResponse getPagingAndItemPerPage(@PathParam("page") int page) {
//        return new UsersResponse(page);
//    }
}
