package com.alterra.MiniProjectRyanHernawan.service.Authentication;


import com.alterra.MiniProjectRyanHernawan.model.User;
import com.alterra.MiniProjectRyanHernawan.payload.TokenResponses;
import com.alterra.MiniProjectRyanHernawan.payload.UsernamePassword;

public interface AuthService {
    User register(UsernamePassword req);
    TokenResponses generateToken(UsernamePassword req);
    void deleteUserById(Long id);
}
