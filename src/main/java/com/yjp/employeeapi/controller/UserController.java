package com.yjp.employeeapi.controller;

import com.yjp.employeeapi.entity.Users;
import com.yjp.employeeapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/allUsers")
    public ResponseEntity<List<Users>> getALlUsers(){
        List<Users> users = null;
        int a=10,b=20,sub,mul;
        try{
            users = userService.getALlUsers();
            sub = a - b;
            mul = a * b;

        }catch (Exception ge){
            ge.getMessage();
        }
        return new ResponseEntity<List<Users>>(users, HttpStatus.OK);
    }

    @GetMapping("/getuser/{id}")
    public ResponseEntity<Users> getUser(@PathVariable("id") int userId){
        Users user = null;

        try{
            user = userService.getUserById(userId);

        }catch (Exception ge){
            ge.getMessage();
        }
        return new ResponseEntity<Users>(user, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Users> addOrUpdateUser(@RequestBody Users user){
        Users users = null;
        try{
            user = userService.addOrUpdateUser(user);
        }catch (Exception ae){
            ae.getMessage();
        }
        return new ResponseEntity<Users>(user, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Users> deleteUser(@PathVariable("id") int userId){
        Users user = null;
        try{
            user = userService.deleteUser(userId);
        }
        catch (Exception e){
            e.getMessage();
        }
        return new ResponseEntity<Users>(user,HttpStatus.OK);
    }

}
