package com.example.passwordmanagerapp;

/*
    This class holds info for an account
 */

public class Account {

    String domain;
    String username;
    String password;

    public Account(String domain, String username, String password){
        this.domain = domain;
        this.username = username;
        this.password = password;
    }

    // returns the domain for this account
    public String getDomain(){
        return this.domain;
    }
    // returns the username for this account
    public String getUsername(){
        return this.username;
    }
    // returns the password for this account
    public String getPassword(){
        return this.password;
    }

    // changes the domain for this account
    public void changeDomain(String newDomain){
        this.domain = newDomain;
    }
    // changes the password for this account
    public void changePassword(String newPassword){
        this.password = newPassword;
    }
}
