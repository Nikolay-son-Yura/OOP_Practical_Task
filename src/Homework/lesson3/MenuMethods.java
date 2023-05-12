package Homework.lesson3;
import Homework.lesson3.Heir.Circle;
import Homework.lesson3.Heir.Rectangle;
import Homework.lesson3.Heir.Square;
import Homework.lesson3.Heir.Triangle;
import Homework.lesson3.Parent.Figure;
import Homework.lesson3.Parent.Polygon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MenuMethods {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Figure> allFigure = new ArrayList<>();

    public void addFigure() throws Exception {
        allFigure.add(new Triangle("Треугольник 1", 2.0, 4.9, 6.2));
        allFigure.add(new Circle("КРуг 1", 5.0));
        allFigure.add(new Square("Квадрат 1", 6.0));
        allFigure.add(new Rectangle("Прямоугольник 1", 6.0, 10.0));

    }

    public void addFigures() throws Exception {
        System.out.println("Какую фигуру добавим?:");
        System.out.println("""
                1-Треугольник
                2-Квадрат
                3-Прямоугольник
                4-Круг""");
        int n = scanner.nextInt();
        System.out.println("Как назовем фигуру? : ");
        String name = scanner.next();
        switch (n) {
            case 1 -> {
                System.out.print("Введите сторону А: ");
                Double a = scanner.nextDouble();
                System.out.print("Введите сторону В: ");
                Double b = scanner.nextDouble();
                System.out.print("Введите сторону В: ");
                Double c = scanner.nextDouble();
                allFigure.add(new Triangle(name, a, b, c));
            }
            case 2 -> {
                System.out.println("Введите сторону ");
                Double width = scanner.nextDouble();
                allFigure.add(new Square(name, width));
            }
            case 3 -> {
                System.out.print("Введите сторону А: ");
                Double width1 = scanner.nextDouble();
                System.out.print("Введите сторону В: ");
                Double height = scanner.nextDouble();
                allFigure.add(new Rectangle(name, width1, height));
            }
            case 4 -> {
                System.out.print("Введите радиус: ");
                Double radius = scanner.nextDouble();
                allFigure.add(new Circle(name, radius));
            }
        }
    }

    public void infoAll() {
        for (var animal : allFigure) {
            System.out.println(animal);
            System.out.println("-----------");

        }
    }

    public void getAllParameter() {
        Double perimeter = 0.0;
        int index = 0;
        for (Figure item : allFigure) {
            if (item instanceof Polygon) {
                index++;
                perimeter += ((Polygon) item).getPeremetr();
            }
        }
        System.out.println("Периметр " + index + " возможных фигур = " + perimeter + ";");
    }

    public void getAreaAll() {
        Double square = 0.0;
        int index = 0;
        for (Figure item : allFigure) {
            index++;
            square += item.getArea();
        }
        System.out.println("Площадь " + index + " возможных фигур = " + square + ";");
    }


    public void figureChange() {
        int count = 0;
        for (Figure i : allFigure) {
            System.out.println(count + "-" + i.getName() + ";");
            count++;
        }
        System.out.println("Какую фигуру изменим?:");
        int choice = scanner.nextInt();
        //можно через создание новой фигуры, но я решил сделать так
        if (allFigure.get(choice) instanceof Square) {
            System.out.println("Какое поле менять будем?: ");
            System.out.println("1-Название фигуры\n2-Сторону");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.println("Введите новое название: ");
                    String newName = scanner.next();
                    allFigure.get(choice).setName(newName);
                }
                case 2 -> {
                    System.out.println("Введите новое значение сторон: ");
                    double newSides = scanner.nextDouble();
                    ((Square) allFigure.get(choice)).setSides(new Double[]{newSides, newSides});
                }
            }
        }
        if (allFigure.get(choice) instanceof Circle) {
            System.out.println("Какое поле менять будем?: ");
            System.out.println("1-Название фигуры\n2-Радиус");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.println("Введите новое название: ");
                    String newName = scanner.next();
                    allFigure.get(choice).setName(newName);
                }
                case 2 -> {
                    System.out.println("Введите новое значение радиуса: ");
                    double newRadius = scanner.nextDouble();
                    ((Circle) allFigure.get(choice)).setRadius(newRadius);
                }
            }
        }
        if (allFigure.get(choice) instanceof Rectangle) {
            System.out.println("Какое поле менять будем?: ");
            System.out.println("1-Название фигуры\n2-стороны");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.println("Введите новое название: ");
                    String newName = scanner.next();
                    allFigure.get(choice).setName(newName);
                }
                case 2 -> {
                    System.out.println("Введите новое значение стороны А: ");
                    double newSidesA = scanner.nextDouble();
                    System.out.println("Введите новое значение стороны B: ");
                    double newSidesB = scanner.nextDouble();
                    ((Rectangle) allFigure.get(choice)).setSides(new Double[]{newSidesA, newSidesB});
                }
            }
        }
        if (allFigure.get(choice) instanceof Triangle) {
            System.out.println("Какое поле менять будем?: ");
            System.out.println("1-Название фигуры\n2-стороны");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.println("Введите новое название: ");
                    String newName = scanner.next();
                    allFigure.get(choice).setName(newName);
                }
                case 2 -> {
                    System.out.println("Введите новое значение стороны А: ");
                    double newSidesA = scanner.nextDouble();
                    System.out.println("Введите новое значение стороны B: ");
                    double newSidesB = scanner.nextDouble();
                    System.out.println("Введите новое значение стороны C: ");
                    double newSidesC = scanner.nextDouble();
                    ((Triangle) allFigure.get(choice)).setSides(new Double[]{newSidesA, newSidesB, newSidesC});
                }

            }
        }
        System.out.println("Параметры изменены");
    }

    public void getAllParameters() {
        Double square = 0.0;
        Double perimeter = 0.0;
        Double circumference = 0.0;
        int index = 0;
        for (Figure item : allFigure) {
            index++;
            square += item.getArea();
        }
        System.out.println("Площадь всех возможных " + index + " фигур = " + square + ";");
        index = 0;
        for (Figure item : allFigure) {
            if (item instanceof Polygon) {
                index++;
                perimeter += ((Polygon) item).getPeremetr();
            }
        }
        System.out.println("Периметр всех возможных " + index + " фигур = " + perimeter + ";");
        index = 0;
        for (Figure item : allFigure) {
            if (item instanceof Circle) {
                index++;
                circumference += ((Circle) item).getLen();
            }
        }
        System.out.println("Длина окружности всех возможных " + index + " фигур = " + circumference + ";");
        index = 0;
    }

    public void countList() {
        int count = 0;
        for (Figure i : allFigure) {
            System.out.println(count + "-" + i.getName() + ";");
            count++;
        }
    }

    public void removeFigure() {
        System.out.println("Какую фигуру удалить?");
        int index = scanner.nextInt();
        allFigure.remove(index);
    }

    public void sortAll() {
        Collections.sort(allFigure);
        System.out.println("-----Фигуры отсортированы по размеру площади-----");
    }
}

