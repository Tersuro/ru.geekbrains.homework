package ru.geekbrains.homework.lesson5;

public class Homework5 {

    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Шаров Осип Игнатьевич", "Штукатур", "e@mailbox.com", "7(1449)341-27-39", 33344.86
                , 29);
        empArray[1] = new Employee("Богданов Лукьян Валентинович", "Землекоп", "m@mailbox.com", "7(820)672-90-86", 47404.92, 41
        );
        empArray[2] = new Employee("Панфилова Марианна Даниловна", "Телеграфист", "a@mailbox.com", "7(2926)180-58-78", 34777.80, 37
        );
        empArray[3] = new Employee("Бирюкова Раиса Иринеевна", "Журналист", "i@mailbox.com", "7(90)305-12-68", 22573.07, 25
        );
        empArray[4] = new Employee("Владимиров Олег Владленович", "Сталевар", "l@mailbox.com", "7(3084)442-46-90", 38583.43, 47
        );

        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getEmployeeAge() >= 40) {
                System.out.println("");
                empArray[i].getEmployeeInfo();
            }
        }
    }
}
