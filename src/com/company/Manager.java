package com.company;

public final class Manager extends Employee {
    private int experience;

    public Manager(String name, int age, Gender gender, String department, int salary, Adress adress, int experience) {
        super(name, age, gender, department, salary, adress);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
    public void toWork (String prepareReport, int amount) {
     System.out.println(prepareReport + amount);
    }
    public String getInfo (){
        return getName()+ " "+ getAge()+" "+getGender()+" "+getDepartment()+" "+ getSalary()+" "
                +getAdress().getNameOfStreet()+" "+getAdress().getNumberOfHouse()+ " "+ getExperience();
    }
    public String copyFromSameObject (){
        

    }

}
