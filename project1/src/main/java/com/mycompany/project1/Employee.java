/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project1;

/**
 *
 * @author almaani
 */
public class Employee {
    static int idGenerator = 1;
    int id;
    private String name;
    private String email;
    private String tel;
    private int age;

    public Employee( String name, String email, String tel, int age) {
        this.id = idGenerator++;
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.age = age;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return  20000 +1000*age;
    }


    @Override
    public String toString() {
        return "Employee {" + "id=" + id + ", name=" + name + ", email=" + email + ", tel=" + tel + ", age=" + age +", salary="+this.getSalary() +'}';
    }
    
}
