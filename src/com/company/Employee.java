package com.company;

public class Employee extends Person {
    private String department;
    private int salary;
    private Adress adress;

    public Employee(String name, int age, Gender gender, String department, int salary, Adress adress) {
        super(name, age, gender);
        this.department = department;
        this.salary = salary;
        this.adress = adress;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public Adress getAdress() {
        return adress;
    }
    public void toWork (String prepareReport, int amount) {
        System.out.println(prepareReport);

    }
    public final void toWork(String prepareReport) {
        System.out.println(prepareReport);
    }
    public String getInfo (){
        return getName()+" "+ getAge()+" "+ getGender()+" "+ getDepartment()+" "+getSalary()+ " "+
                getAdress().getNameOfStreet()+ " "+ getAdress().getNumberOfHouse();

    }
}
