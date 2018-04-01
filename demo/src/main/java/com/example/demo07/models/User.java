package com.example.demo07.models;
import io.swagger.annotations.ApiModelProperty;
import org.apache.ibatis.type.Alias;

import javax.validation.constraints.NotNull;

@Alias(value="user")
public class User {
    private  Integer id;
    private  boolean account_expired;
    private  boolean account_locked;
    private  boolean credentials_expired;
    @NotNull(message = "不能为空")
    private  boolean account_enabled;
    private  String first_name;
    @NotNull(message = "不能为空")
    private  String isinuser;
    private  String last_name;
    private  String password;
    private  String username;
    private  Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isAccount_expired() {
        return account_expired;
    }

    public void setAccount_expired(boolean account_expired) {
        this.account_expired = account_expired;
    }

    public boolean isAccount_locked() {
        return account_locked;
    }

    public void setAccount_locked(boolean account_locked) {
        this.account_locked = account_locked;
    }

    public boolean isCredentials_expired() {
        return credentials_expired;
    }

    public void setCredentials_expired(boolean credentials_expired) {
        this.credentials_expired = credentials_expired;
    }

    public boolean isAccount_enabled() {
        return account_enabled;
    }

    public void setAccount_enabled(boolean account_enabled) {
        this.account_enabled = account_enabled;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getIsinuser() {
        return isinuser;
    }

    public void setIsinuser(String isinuser) {
        this.isinuser = isinuser;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account_expired=" + account_expired +
                ", account_locked=" + account_locked +
                ", credentials_expired=" + credentials_expired +
                ", account_enabled=" + account_enabled +
                ", first_name='" + first_name + '\'' +
                ", isinuser='" + isinuser + '\'' +
                ", last_name='" + last_name + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", version=" + version +
                '}';
    }
}
