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
public class Programmar extends Employee {
    
    private String specification;
    
    Programmar(String name, String email, String tel,int age , String specification){
        super(name,email,tel,age);
        this.specification = specification;    
    }
    
    public double getSalary(){
      return 20000+2000*super.getAge();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    @Override
    public String toString() { 
        return super.toString() + "programmer specification=" + specification;
    }
    
   
    
}
