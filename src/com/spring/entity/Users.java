package com.spring.entity;

public class Users {

    private Long id;
    private String name;
    private String pwd;
    private Products product;
    private String[] cardArray;

    public Users() {
    }

    public Users(Long id, String name, String pwd, Products product,String[] cardArray) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.product = product;
        this.cardArray = cardArray;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public String[] getCardArray() {
        return cardArray;
    }

    public void setCardArray(String[] cardArray) {
        this.cardArray = cardArray;
    }
}
