package com.mycompany.project1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class EmployeeManagement {

    public static ArrayList<Employee> employees = new ArrayList<>();

    public static void AddEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add new Employment");
        System.out.println("Enter employee name");
        String name = sc.nextLine();

        System.out.println("Enter employee email");
        String email = sc.nextLine();

        System.out.println("Enter employee tel");
        String tel = sc.nextLine();

        System.out.println("Enter employee age");
        int age = sc.nextInt();

        System.out.println("choose employee type");
        System.out.println("1 - Programmer");
        System.out.println("2 - Secretary");
        System.out.println("3 - Technican");
        System.out.println("4 - Other");

        int chosenType = sc.nextInt();

        switch (chosenType) {
            case 1:
                System.out.println("Enter programmer specification:");
                String specification = sc.nextLine();
                Programmar programmer = new Programmar(name, email, tel, age, specification);
                employees.add(programmer);
                break;
            case 2:
                System.out.println("Enter secritary office name:");
                String office = sc.nextLine();
                Secritary secritary = new Secritary(name, email, tel, age, office);
                employees.add(secritary);
                break;
            case 3:
                System.out.println("Enter Technican's section:");
                String section = sc.nextLine();
                Technican technican = new Technican(name, email, tel, age, section);
                employees.add(technican);
            case 4:
                Employee employee = new Employee(name, email, tel, age);
                employees.add(employee);
        }
        System.out.println("Employee added successfuly!");

    }

    public static void UpdateEmployee() {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee id:");
        int id = sc.nextInt();
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.println("Enter  a new employee name, current name is (" + employee.getName() + ')');
                String name = sc.nextLine();
                employee.setName(name);
                System.out.println("Enter employee email , current email is (" + employee.getEmail() + ')');
                String email = sc.nextLine();
                employee.setEmail(email);
                System.out.println("Enter employee tel, current tel is (" + employee.getTel() + ')');
                String tel = sc.nextLine();
                employee.setTel(tel);

                System.out.println("Enter employee age, current age is (" + employee.getAge() + ')');
                int age = sc.nextInt();
                employee.setAge(age);
                if (employee instanceof Programmar) {
                    System.out.println("Enter programmer specification, current specification is (" + ((Programmar) employee).getSpecification() + ')');
                    String specification = sc.nextLine();
                    ((Programmar) employee).setSpecification(specification);

                } else if (employee instanceof Secritary) {
                    System.out.println("Enter secritary office, current office is (" + ((Secritary) employee).getOffice() + ')');
                    String office = sc.nextLine();
                    ((Secritary) employee).setOffice(office);
                } else if (employee instanceof Technican) {
                    System.out.println("Enter technican section, current section is (" + ((Technican) employee).getSection() + ')');
                    String section = sc.nextLine();
                    ((Technican) employee).setSection(section);
                }
            } // end if 

        }// end for 
        System.out.println("Employee updated successfully");
    }

    public static void removeEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id you want to remove:");
        int id = sc.nextInt();
        employees.removeIf(c -> c.getId() == id);
        System.out.println("employee removed successfuly");
    }

    public static void getAll() {

        Consumer<Employee> p = (Employee employee) -> {
            if (employee instanceof Programmar) {
                System.out.println(((Programmar) employee));
            } else if (employee instanceof Secritary) {
                System.out.println(((Secritary) employee));
            } else if (employee instanceof Technican) {
                System.out.println(((Technican) employee));
            } else {
                System.out.println(employee);
            }
        };

        employees.forEach(p);
    }

    public static void getAll(String type) {
        employees.forEach(employee -> {
            if (employee instanceof Programmar && type.equalsIgnoreCase("programmar")) {
                System.out.println(((Programmar) employee).toString());
            } else if (employee instanceof Secritary && type.equalsIgnoreCase("secritary")) {
                System.out.println(((Secritary) employee).toString());
            } else if (employee instanceof Technican && type.equalsIgnoreCase("technican")) {
                System.out.println(((Technican) employee).toString());
            }
        });
    }

    public void getByClass() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose type : ");
        System.out.print("1 - Programmer");
        System.out.print("2 - Secritary");
        System.out.print("3 - Technican");
        int chosenType = sc.nextInt();
        switch (chosenType) {
            case 1:
               getAll("programmar");
               break;
            case 2:
                getAll("secritary");
                break;
            case 3:
                getAll("technican");
                break;
        }

    }
}
