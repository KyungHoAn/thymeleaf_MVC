package com.example.thymeleaf_test.domain;

import lombok.Data;

@Data
public class Member {
    int no;
    String name;
    String phone;

    public Member(){
    }

    public Member(int no, String name, String phone){
        this.no = no;
        this.name = name;
        this.phone = phone;
    }

    public int getNo(){
        return no;
    }

    public void setNo(int no){
        this.no = no;
    }
}
