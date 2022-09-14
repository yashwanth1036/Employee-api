package com.yjp.employeeapi.service;

import com.yjp.employeeapi.entity.Users;

import java.util.List;

public interface UserService {


    public List<Users> getALlUsers();
    public Users getUserById(int userId);
    public Users addOrUpdateUser(Users user);
    public Users deleteUser(int userId) throws Exception;
}
