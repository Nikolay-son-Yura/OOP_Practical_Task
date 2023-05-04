package Homework.lesson2.Zoo;


import java.util.ArrayList;
import java.util.Scanner;

public class MenuZoo {
    Zoo myZoo = new Zoo();
    public void menuZoo() {
        System.out.println();
        myZoo.count();
//        myZoo.countList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что будем делать?");
        System.out.println("1-Загрузить существующий Зоопарк");
        System.out.println("2-Добавлять новых животных в зоопарк");
        System.out.println("3-Убрать животное из зоопарка");
        System.out.println("4-Печатать информацию о конкретном животном");
        System.out.println("5-Печатать информацию о всех животных в зоопарке на данный момент");
        System.out.println("6-Заставить конкретное животное издать звук");
        System.out.println("7-Заставить издавать звук всех животных");
        System.out.println("0- Выход");
        int command = scanner.nextInt();
        switch (command) {
            case 1 -> {
                myZoo.addZoo();
                menuZoo();
            }
            case 2 -> {
                myZoo.addAnimal();
                menuZoo();
            }
            case 3 -> {
                myZoo.countList();
                myZoo.removeAnimal();
                menuZoo();
            }
            case 4 -> {
                myZoo.countList();
                myZoo.infoAnimal();
                menuZoo();
            }
            case 5 -> {
                myZoo.infoAll();
                menuZoo();
            }
            case 6 -> {
                myZoo.countList();
                myZoo.voiceAnimal();
                menuZoo();
            }
            case 7 -> {
                myZoo.voiceAll();
                menuZoo();
            }
        }

    }
}
