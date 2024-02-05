/*Написать компаратор - метод внутри класса сотрудника, сравнивающий сотрудников по произвольному параметру.

Опишите класс руководителя, наследник от сотрудника.
Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом,
чтобы он мог поднять заработную плату всем, кроме руководителей (использовать instanceof).

В основной программе создайте руководителя и поместите его в общий массив сотрудников.
Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.*/


import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Shinra", "officer", 2006, 10000);
        Employee e2 = new Employee("Arthur", "officer", 2006, 10000);
        Supervisor s1 = new Supervisor("Hinawa", "lieutenant", 1998, 50000);
        Employee[] employees = {e1, e2, s1};
        System.out.println("Before");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getSalary());
        }
        System.out.println("After");
        UpSalary(employees, 5000);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getSalary());
        }
        System.out.println(e1.compareTo(s1));

    }

    static void UpSalary(Employee[] employees, int up){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Supervisor) {

            }
            else{
                employees[i].setSalary(employees[i].getSalary()+up);
            }
        }
    }
}