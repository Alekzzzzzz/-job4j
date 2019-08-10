package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int monhly,int percent){
        int year = 0;
        while (year > 0){
           percent = (amount / 100) * percent;
           year = (percent + amount)/monhly;
        }
        return year;
    }
}
