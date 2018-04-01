package com.example.demo07.models;
import io.swagger.annotations.ApiModelProperty;
import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Alias("value=pet")
public class Pet {
    @ApiModelProperty(value="宠物id")
    private int petid;
    private String petName;
    private int petBreed;
    private int petSex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String description;

    public int getPetSex() {
        return petSex;
    }

    public void setPetSex(int petSex) {
        this.petSex = petSex;
    }

    public int getPetid() {
        return petid;
    }

    public void setPetid(int petid) {
        this.petid = petid;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(int petBreed) {
        this.petBreed = petBreed;
    }



    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petid=" + petid +
                ", petName='" + petName + '\'' +
                ", petBreed=" + petBreed +
                ", petSex=" + petSex +
                ", birthday=" + birthday +
                ", description='" + description + '\'' +
                '}';
    }

    public Pet() {
    }

    public Pet(String petName, int petBreed, int petSex, Date birthday, String description) {

        this.petName = petName;
        this.petBreed = petBreed;
        this.petSex = petSex;
        this.birthday = birthday;
        this.description = description;
    }
}
