package com.company;


import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Employee Empl = new Employee("Anna", 25, Gender.FEMALE, "Pharma", 500,
                new Adress("Эркиндик", 71));

        Manager Mang1 = new Manager("Oleg", 36, Gender.MALE,"Manegment",600,
            new Adress("Элдик", 80), 5 );
        Manager Mang2 = new Manager("Zoya", 40,Gender.FEMALE,"Marketing",800,
            new Adress("Новая", 5), 10);

        System.out.println(Empl.getInfo());
        System.out.println(Mang1.getInfo());
        System.out.println(Mang2.getInfo());


        Empl.toWork("Анализ данных за 2018 год.");
        Mang1.toWork("Продажи и прибыль ", 10);
        Mang2.toWork("Холодные звонки ", 100);
    }



}
