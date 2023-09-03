package com.krystal.abstract_.exer;

/**
 * @author krystal
 * @create 2023-09-02 21:14
 */
public class AbstractExercise01 {
    public static void main(String[] args) {
        //final是不能继承
        //static和方法重写无关
        //private的方法不能被重写

        //测试
        Manager jack = new Manager("jack", 999, 80000);
        jack.setBonus(10000);
        jack.work();


        CommonEmployee tom = new CommonEmployee("tom", 20000, 8000);
        tom.work();

    }
}

abstract class Employee{
    public String name;

    public Integer id;

    public double salary;

    //抽象方法
    public abstract void work();

    public Employee() {
    }

    public Employee(String name, Integer id, Integer salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee{

    public String name;

    public Integer id;

    public double salary;

    public double bonus;

    public Manager(String name, Integer id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理"+getName() +"工作中");
    }
}

class CommonEmployee extends Employee{
    public String name;

    public Integer id;

    public double salary;

    public CommonEmployee(String name, Integer id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("员工" +getName() +"工作中");
    }
}

