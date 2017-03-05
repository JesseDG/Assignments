/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.model;


import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Entity;
import java.io.Serializable;
/**
 *
 * @author cstuser
 */

@Entity
@Table(name="user_info")
public class user_info implements Serializable{
    
    public int user_info_id;  
    public String first_name;
    public String middle_name;
    public String last_name;
    public String city;
    public String country;
    public int user_profile_id;

    @Column(name="USER_PROFILE_ID")
    public int getUser_profile_id() {
        return user_profile_id;
    }

    public void setUser_profile_id(int user_profile_id) {
        this.user_profile_id = user_profile_id;
    }
    
    @Id
    @Column(name="USER_INFO_ID")
    public int getUser_id() {
        return user_info_id;
    }

    public void setUser_id(int user_id) {
        this.user_info_id = user_id;
    }

    @Column(name="FIRST_NAME")
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    @Column(name="MIDDLE_NAME")
    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    @Column(name="LAST_NAME")
    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Column(name="CITY")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name="COUNTRY")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    
}
