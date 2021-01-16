package ru.geekbrains.lesson05;

public class Test {
    public static void main(String[] args) {

        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Фрейзер Крейн", "Радиоведущий", "fk@fraiser.com", "+2061111111", 100000, 30);
        emplArray[1] = new Employee("Дафни Мун", "Физиотерапевт", "dm@fraiser.com", "+2062222222", 110000, 40);
        emplArray[2] = new Employee("Найлс Крейн", "Психотерапевт", "nk@fraiser.com", "+2063333333", 120000, 50);
        emplArray[3] = new Employee("Мартин Крейн", "Детектив", "mk@fraiser.com", "+2064444444", 130000, 60);
        emplArray[4] = new Employee("Роуз Дойл", "Режиссер", "rd@fraiser.com", "+2065555555", 140000, 70);

        // если у объекта в ячейке i поле age > 40, то вызывается метод print
        for (int i = 0; i < emplArray.length; i++)
            if (emplArray[i].age > 40) emplArray[i].print();

    }
}

