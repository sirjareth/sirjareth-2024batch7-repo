/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.encap;


// MODEL
public class User {
    private int id;
    private String username;
    private String password;
    private String fullName;
    private String address;
    private String companyName;
    
    
    
    // setter constructor
    public User(int id, String username, String password,
            String fullName, String address){
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.address = address;
        this.companyName = "Joysis";
    }
    
    public User(){
        this.username = "N/A";
        this.password = "N/A";
        this.fullName = "N/A";
        this.address = "N/A";
        this.companyName = "N/A";
    }
    
    public User(int id, String username, String password,
            String fullName){
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.companyName = "Joysis";
    }
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
        this.companyName = null;
    }
    
    

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    
    
    public int getId() {
        return id;
    }
    
    

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return fullName;
    }

    public void setName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    
}
