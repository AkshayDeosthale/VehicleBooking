package com.upgrad.hireWheels.Entities;

import javax.persistence.*;
import java.time.*;
import java.util.Set;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int user_id;

    @Column(nullable=true)
    private String first_name;

    private String last_name;

    @Column(nullable=true)
    private String password;

    @Column(nullable=true, unique=false)
    private String email;

    @Column(nullable=true, unique=false)
    private String mobile_number;


    @Column(nullable=true)
    private int role_id;

    private int wallet_money =10000;

    public Users(String first_name, String last_name, String password, String email, String mobile_number, int wallet_money, int role_id) {
        this.first_name = first_name;
        this.last_name=last_name;
        this.password = password;
        this.email = email;
        this.mobile_number = mobile_number;
        this.wallet_money = wallet_money;
        this.role_id = role_id;
    }

    /*
    @OneToMany (mappedBy = "users")
    private Set<booking> booking;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private role role;

     */


     public int Get_user_id() {
        return user_id;
    }

    public void Set_UserId(int userId) {
        this.user_id = user_id;
    }

    public String Get_first_name() {
        return first_name;
    }

    public void Set_User_first_name(String first_name) {
        this.first_name = first_name;
    }

    public String get_User_last_name() {
        return last_name;
    }

    public void set_User_last_name(String last_name) {
        this.last_name = last_name;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String get_User_email() {
        return email;
    }

    public void set_User_email(String email) {
        this.email = email;
    }

    public String get_User_mobile_number() {
        return mobile_number;
    }

    public void set_User_mobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public int get_User_role_id() {
        return role_id;
    }

    public void set_User_role_id(int role_id) {
        this.role_id= role_id;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "User ID : " + user_id +
                ", First Name :'" + first_name + '\'' +
                ", Last name : '" + last_name+ '\'' +
                ", Password : '" + password +
                ", Email : '" + email +
                ", Mobile Number : " + mobile_number + '\'' +
                ", Role : " + role_id + '\'' +
                ", Wallet balance : " + wallet_money + '\'' +
                '}';
    }



}

