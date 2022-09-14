package com.yjp.employeeapi.service.impl;

import com.yjp.employeeapi.entity.Users;
import com.yjp.employeeapi.repository.UserRepository;
import com.yjp.employeeapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    List<Users> users = null;
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> getALlUsers() {
      return (List<Users>) userRepository.findAll();
    }

    @Override
    public Users getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public Users addOrUpdateUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public Users deleteUser(int userId) throws Exception {
        Users deleteUser = null;
        try{
            deleteUser = userRepository.findById(userId).orElse(null);
            if(deleteUser == null){
                throw new Exception("user data is not available to delete");
            }else{
                userRepository.deleteById(userId);
            }
        }catch(Exception de){
            throw de;
        }
        return deleteUser;
    }
}
