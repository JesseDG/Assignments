/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 *
 * @author cstuser
 */

@Entity
@Table(name="user_profile")
public class user_profile {
    
    @Id
    public int user_id;
    public String email;
    public String password_hash;
    public String salt;

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Column(name="USER_ID")
    public int getUser_id() {
        return user_id;
    }

    @Column(name="EMAIL")
    public String getEmail() {
        return email;
    }

    @Column(name="PASSWORD_HASH")
    public String getPassword_hash() {
        return password_hash;
    }

    @Column(name="SALT")
    public String getSalt() {
        return salt;
    }

    
    
    
    
}
