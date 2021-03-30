package com.ricorich.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String name;
    private int age;
    private int sex;
    private Date birthday;
    private String note;
    private Date created;
    private Date updated;

}
