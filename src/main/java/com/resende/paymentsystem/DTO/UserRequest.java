package com.resende.paymentsystem.DTO;

import com.resende.paymentsystem.entity.User;

public record UserRequest(String username, String email, String password) {

    public User toModel(){
        return new User(username, email, password);
    }

}
