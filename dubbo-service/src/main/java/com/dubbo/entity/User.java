package com.dubbo.entity;

import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Slf4j
public class User implements Serializable {
    private String userId;
    private String userName;
    private String account;
    private String phone;
    private String password;
    private String address;
}
