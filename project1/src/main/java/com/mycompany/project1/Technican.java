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
public class Technican extends Employee {
        private String section;
        
    Technican(String name , String email , String tel , int age , String section){
        super(name , email , tel , age );
        this.section = section;
    }
    public double getSalary(){
        return 20000+1000*super.getAge();
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return  super.toString() + " Technican section=" + section;
    }
    
}
