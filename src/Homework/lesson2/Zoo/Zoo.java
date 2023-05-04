package Homework.lesson2.Zoo;

import Homework.lesson2.Animal.Class.Animal;
import Homework.lesson2.Animal.Representatives.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    ArrayList<Animal> zooAnimal = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addZoo() {
        zooAnimal.add(new Chicken("Курица", 32.5, 3.5, "Синий", 1.2));
        zooAnimal.add(new Stork("Аист", 175.2, 30.0, "белый", 300.2));
        zooAnimal.add(new Cat("Кошка", 10.5, 5.0, "Голубой", "Куданах", "Cибирская", false, "белый", "27.05.2010"));
        zooAnimal.add(new Cat("Кошка", 12.5, 4.0, "Зеленый", "Фубля", "Сфинкс", true, "", "14.05.2010"));
        zooAnimal.add(new Tiger("Тигр", 89.2, 120.0, "Серый", "Джунгли Индии", "02.02.2002"));
        zooAnimal.add(new Dog("Собака", 44.2, 5.6, "Голубой", "Дружок", "Хаска", true, "Серый", "15.12.2005", true));
        zooAnimal.add(new Dog("Собака", 51.2, 15.6, "Черный", "Балбес", "Дворняга", false, "Черный", "06.09.1987", false));
        zooAnimal.add(new Wolf("Волк", 82.3, 20.0, "Серый", "Сибирь", "28.02.2022", true));
        zooAnimal.add(new Wolf("Волк", 70.3, 15.0, "Серый", "Сибирь", "28.02.2022", false));
    }
    public void addAnimal() {
        System.out.println("Выберите какое животное заведем в зоопарке?:");
        System.out.println("1- Курица,2-Аист,3-Кошка,4- Собака,5-Тигру,6-Волк");
        int n = scanner.nextInt();
        System.out.println("Введите рост животного : ");
        double height = scanner.nextDouble();
        System.out.println("Введите вес животного : ");
        double weight = scanner.nextDouble();
        System.out.println("Введите цвет глаз : ");
        String eyeColor = scanner.next();
        if (n == 1 || n == 2) {//курица и аист
            System.out.println("Введите высоту полета : ");
            double flightAltitude = scanner.nextDouble();
            if (n == 1) {
                String typeName = "Курица";
                zooAnimal.add(new Chicken(typeName, height, weight, eyeColor, flightAltitude));
            }
            if (n == 2) {
                String typeName = "Аист";
                zooAnimal.add(new Stork(typeName, height, weight, eyeColor, flightAltitude));
            }
        }
        if (n == 3 || n == 4) {//кошка и собака
            System.out.println("Введите кличку: ");
            String nickname = scanner.next();
            System.out.println("Введите породу: ");
            String breed = scanner.next();
            System.out.println("Вакцинирован(1-да, 2-нет): ");
            String f = scanner.next();
            boolean isVaccinations = f.equals("1");
            System.out.println("Введите дата рождение: ");
            String birthdate = scanner.next();
            if (n == 3) {
                String typeName = "Кошка";
                System.out.println("Имеет шерсть (1-да, 2-нет): ");
                String f1 = scanner.next();
                boolean wool = f1.equals("1");
                System.out.println("Введите цвет шерсти: ");
                String coatColor = scanner.next();
                zooAnimal.add(new Cat(typeName, height, weight, eyeColor, nickname, breed, isVaccinations, coatColor, birthdate, wool));
            }
            if (n == 4) {
                String typeName = "Собака";
                System.out.println("Введите цвет шерсти: ");
                String coatColor = scanner.next();
                System.out.println("Наличие дрессировки (1-да, 2-нет): ");
                String f1 = scanner.next();
                boolean training = f1.equals("1");
                zooAnimal.add(new Dog(typeName, height, weight, eyeColor, nickname, breed, isVaccinations, coatColor, birthdate, training));
            }
        }
        if (n == 5 || n == 6) {//тигру и волк
            System.out.println("Введите местоположение : ");
            String habitat = scanner.next();
            System.out.println("Введите дату нахождения : ");
            String locationDate = scanner.next();
            if (n == 5) {
                String typeName = "Тигр";
                zooAnimal.add(new Tiger(typeName, height, weight, eyeColor, habitat, locationDate));
            }
            if (n == 6) {
                String typeName = "Волк";
                System.out.println("Лидер? (1-да, 2-нет): ");
                String f1 = scanner.next();
                boolean isTrained = f1.equals("y");
                zooAnimal.add(new Wolf(typeName, height, weight, eyeColor, habitat, locationDate, isTrained));
            }
        }
    }
    public void infoAnimal() {
        System.out.println("Введите номер из списка животного");
        int index = scanner.nextInt();
        System.out.println(zooAnimal.get(index));
    }
    public void infoAll() {
        for( var animal:zooAnimal){
            System.out.println(animal);
        }
    }
    public void removeAnimal() {
        System.out.println("Убрать животное из списка напишите индекс животного");
        int index = scanner.nextInt();
        zooAnimal.remove(index);
    }
    public void countList() {
        int count = 0;
        for (Animal i : zooAnimal) {
            System.out.println(count+"-"+i.getTypes()+";");
            count++;
        }

    }
    public void count(){
        int count = 0;
        for (Animal i : zooAnimal) {
            count++;
        }
        System.out.println("В нашем зоопарке " + count + " животных");
    }

    public void voiceAnimal() {
        System.out.println("Введите номер из списка животного");
        int i = scanner.nextInt();
        zooAnimal.get(i).voice();
    }

    public void voiceAll() {
        for (var i : zooAnimal) {
            i.voice();
        }
    }
    public void animalsList() {
        for (var i : zooAnimal) i.getTypes();
    }

}

