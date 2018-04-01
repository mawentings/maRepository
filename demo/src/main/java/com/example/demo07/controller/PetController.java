package com.example.demo07.controller;

import com.example.demo07.dao.PetMapper;
import com.example.demo07.models.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.Console;
import java.util.Date;

@RestController
public class PetController {
    @Autowired
    private PetMapper petMapper;
   // @GetMapping("/api/getPet")//前端代理名
    @RequestMapping(value="/hello" ,method = RequestMethod.GET)
    public Pet getPet(){
        Pet pet=petMapper.getPetById(10);
        return pet;
    }
    @RequestMapping(value ="/inserts",method = RequestMethod.GET)
    public int inserts(){
        //(String petName, int petBreed, int sex, Date birthday, String description)
        Pet pet=new Pet();
        pet.setPetName("嘻嘻2");
        pet.setBirthday(new Date());
        pet.setDescription("温顺可爱美丽2");
        pet.setPetBreed(1);
        pet.setPetSex(1);
        int hi= petMapper.insert(pet);

        return pet.getPetid();
    }
}
