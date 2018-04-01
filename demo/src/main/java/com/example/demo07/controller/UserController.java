package com.example.demo07.controller;
import com.example.demo07.models.User;
import com.example.demo07.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
     @Autowired
     UserService userService ;
     //@RequestMapping(value="/user",method = RequestMethod.GET)
     public  List<User> getUser(){
         List<User> list=userService.getAllUser();

      /* User uq=null;
         for(User user :list){
             uq=user;
         }*/
        return list;
     }

     @RequestMapping(value="/page",method = RequestMethod.GET)
   public  List<User> getUserByPage(){
        List<User> list=userService.getAllUser();
        int id=1;
        String pass="admin";
        User uq=null;
        for(User user:list){
            if(user.getId().equals(id)&&user.getPassword().equals(pass)){
                uq=user;
                break;
            }
        }
        List<User> list2=userService.getUserByPage(uq);
        return list2;
   }
}
