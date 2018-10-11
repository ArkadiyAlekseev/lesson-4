package ru.geekbrains.J1Homework4;


 class Employee {
    //Задание 1. Создать класс "Сотрудник" с полями: ФИО,зарплата, возраст;
    private String surname;// фамилия (параметр 1)
    private String name;//  имя (параметр 2)
    private String patronymic;// отчество (параметр 3)
    private String salary;//зарплата (параметр 4)
    private String birthYear;//год рождения (параметр 5)
    private static final int currentYear = 2018;//какой сейчас год
    // Задание 2. Конструктор класса должен заполнять эти поля при создании объекта;
    Employee (String surname, String name, String patronymic, String salary, String birthYear) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.salary = salary;
        this.birthYear = birthYear;
    }
    // Задание 3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    private String getName() {
        return this.surname + " " + this.name + " " + this.patronymic + " ";
    }
    int money() {
        return Integer.parseInt(salary);
    }
     private int getAge() {
        return currentYear - Integer.parseInt(birthYear);
    }
    // Задание 4. Вывести в консоль при помощи методов из пункта 3 ФИО и возраст.
    void consoleOutput (){
        System.out.println(" Задание 4.\n Сотрудник :" + getName() + getAge() + " года. \n");
    }
    //Задание 5. Создать массив из 5 сотрудников.
    private String[][] data;
    Employee(String [][] data) {
    }
     // Задание 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
    void over40(String[][] data) {
        System.out.println ("Задание 5.");
        for (int i = 0; i < 5; i++) {
            if ( Integer.parseInt(data[i][4]) < currentYear - 40) {
                System.out.printf("Сотрудник : %s %s %s, год рождения %s, зарплата %s \n", data[i][0], data[i][1], data[i][2], data[i][4], data[i][3]);
            }
        }
    }
        //задание 6. Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
     void salaryOver45(String[][] data){
         for( int i = 0; i<5; i++){
            if (Integer.parseInt(data[i][4]) < currentYear - 45) {
                data[i][3] = Integer.toString( Integer.parseInt(data[i][3])+5000);
            }
        }
    }
    void consolePrint(String[][] data){
        for (int i = 0; i < 5; i++) {
            // цикл по второй размерности
            for (int j = 0; j < 5; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    // ** Задание 7. Написать методы (принимающие на вход массив сотрудников),
    // вычисляющие средний возраст и среднюю зарплату сотрудников,
    // вывести результаты работы в консоль.
     int averageAge (String[][] data){
        int averageA = 0;
         for (int i = 0; i < 5; i++) {
             averageA += (currentYear - Integer.parseInt(data[i][4]))/5;
             }
         return averageA;
     }
     int averagesalary (String[][] data){
         int averageS = 0;
         for (int i = 0; i < 5; i++) {
             averageS += Integer.parseInt(data[i][3])/5;
         }
         return averageS;
     }
      String[][] numberOfWorker(String[][] data){
         String[][] data1 = new String[5][6];
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 6; j++) {
                 data1[i][j] = (j < 5) ? data[i][j] : "идентификационный номер: " + Integer.toString(i + 1);
                 System.out.print(data1[i][j] + " ");
             }
             System.out.println();
         }
         return data;
     }

 }




