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
public class Secritary extends Employee {
    private String office;
    Secritary( String name , String email , String tel , int age ,String office){
        super(name , email, tel , age);
        this.office = office;
    }
    public double getSalary(){
       return  20000+500*super.getAge();
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return super.toString()+ "secritary office=" + office ;
    }
    
    
}
