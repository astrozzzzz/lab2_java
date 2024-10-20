import static java.lang.System.out;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    private boolean checkType(String x, String typeName) {
        if (typeName == "double") {
            try {
                double value = Double.parseDouble(x);
                return true;
            } catch (NumberFormatException e) {
                out.println("Ошибка: введено не число типа double");
            }
        }
        if (typeName == "int") {
            try {
                double value = Integer.parseInt(x);
                return true;
            } catch (NumberFormatException e) {
                out.println("Ошибка: введено не число типа int");
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Main m = new Main();

        out.print("Введите номер задания и номер задачи через пробел: ");
        Scanner scanner = new Scanner(System.in);
        String task = scanner.nextLine();
        String[] parts = task.split(" ");
        if (!m.checkType(parts[0], "int") || !m.checkType(parts[1], "int")) {
            out.println("Неправильно введён номер задачи");
            return;
        }
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[1]);
        if (num1 == 1) {
            if (num2 == 1) {
                double x1, y1;
                out.print("Введите координаты первой точки через пробел: ");
                String inp = scanner.nextLine();
                parts = inp.split(" ");
                if (!m.checkType(parts[0], "double") || !m.checkType(parts[1], "double")) {
                    return;
                }
                x1 = Double.parseDouble(parts[0]);
                y1 = Double.parseDouble(parts[1]);
                Dot dot1 = new Dot(x1, y1);
                out.print("Введите координаты второй точки через пробел: ");
                inp = scanner.nextLine();
                parts = inp.split(" ");
                if (!m.checkType(parts[0], "double") || !m.checkType(parts[1], "double")) {
                    return;
                }
                x1 = Double.parseDouble(parts[0]);
                y1 = Double.parseDouble(parts[1]);
                Dot dot2 = new Dot(x1, y1);
                out.print("Введите координаты третьей точки через пробел: ");
                inp = scanner.nextLine();
                parts = inp.split(" ");
                if (!m.checkType(parts[0], "double") || !m.checkType(parts[1], "double")) {
                    return;
                }
                x1 = Double.parseDouble(parts[0]);
                y1 = Double.parseDouble(parts[1]);
                Dot dot3 = new Dot(x1, y1);
                out.println("Точка 1: " + dot1.toString());
                out.println("Точка 2: " + dot2.toString());
                out.println("Точка 3: " + dot3.toString());
            }
            if (num2 == 3) {
                Name name1 = new Name("Клеопатра", "", "");
                Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
                Name name3 = new Name("Владимир", "Маяковский", "");
                out.println("Первое имя: " + name1.toString());
                out.println("Второе имя: " + name2.toString());
                out.println("Третье имя: " + name3.toString());
            }
        }
        else if (num1 == 2) {
            if (num2 == 1) {
                Line line1 = new Line(new Dot(1, 3), new Dot(23, 8));
                Line line2 = new Line(new Dot(5, 10), new Dot(25, 10));
                Line line3 = new Line(line1.getFirst(), line2.getSecond());
                out.println("Линия 1: " + line1);
                out.println("Линия 2: " + line2);
                out.println("Линия 3: " + line3);

                // Изминение координат 1 2
                out.println("Изминение координат 1 2");
                line1.getFirst().setX(1);
                line1.getFirst().setY(2);
                line1.getSecond().setX(3);
                line1.getSecond().setY(4);

                line2.getFirst().setX(5);
                line2.getFirst().setY(6);
                line2.getSecond().setX(7);
                line2.getSecond().setY(8);
                System.out.println("Линия 1: " + line1);
                System.out.println("Линия 2: " + line2);
                System.out.println("Линия 3: " + line3);

                // Изминение координат линии 1 без изменения линии 3
                out.println("Изминение координат линии 1 без изменения линии 3");
                Dot newDot1 = new Dot(100, 100);
                Dot newDot2 = new Dot(200, 200);
                line1.setFirst(newDot1);
                line1.setSecond(newDot2);
                System.out.println("Линия 1: " + line1);
                System.out.println("Линия 2: " + line2);
                System.out.println("Линия 3: " + line3);
            }
        }
        else if (num1 == 3 && num2 == 3) {
            City cityA = new City("Город A");
            City cityB = new City("Город B");
            City cityC = new City("Город C");
            City cityD = new City("Город D");
            City cityE = new City("Город E");
            City cityF = new City("Город F");

            cityA.addPath(cityB, 5);
            cityA.addPath(cityF, 1);
            cityA.addPath(cityD, 6);

            cityB.addPath(cityA, 5);
            cityB.addPath(cityC, 3);

            cityC.addPath(cityB, 3);
            cityC.addPath(cityD, 4);

            cityD.addPath(cityC, 4);
            cityD.addPath(cityE, 2);
            cityD.addPath(cityA, 6);

            cityE.addPath(cityF, 2);

            cityF.addPath(cityB, 1);
            cityF.addPath(cityE, 2);

            out.println(cityA);
            out.println(cityB);
            out.println(cityC);
            out.println(cityD);
            out.println(cityE);
            out.println(cityF);

        }
        else if (num1 == 4 && num2 == 8) {
            // Создание города только по названию
            City cityA = new City("Город A");
            City cityB = new City("Город B");
            City cityC = new City("Город C");

            cityA.addPath(cityB, 1);
            cityA.addPath(cityC, 2);

            // Создание города по названию и путям
            Map<City, Integer> p = new HashMap<>();
            p.put(cityA, 4);
            City cityD = new City("Город D", p);
            out.println(cityA);
            out.println(cityD);

        }
        else if (num1 == 5 && num2 == 5) {
            out.print("Введите числитель и знаменатель первой дроби через пробел: ");
            String frac1 = scanner.nextLine();
            parts = frac1.split(" ");
            if (!m.checkType(parts[0], "int") || !m.checkType(parts[1], "int")) {
                out.println("Неправильно введена дробь");
                return;
            }
            Fraction f1 = new Fraction(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
            out.print("Введите числитель и знаменатель второй дроби через пробел: ");
            String frac2 = scanner.nextLine();
            parts = frac2.split(" ");
            if (!m.checkType(parts[0], "int") || !m.checkType(parts[1], "int")) {
                out.println("Неправильно введена дробь");
                return;
            }
            Fraction f2 = new Fraction(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
            out.print("Введите числитель и знаменатель третей дроби через пробел: ");
            String frac3 = scanner.nextLine();
            parts = frac3.split(" ");
            if (!m.checkType(parts[0], "int") || !m.checkType(parts[1], "int")) {
                out.println("Неправильно введена дробь");
                return;
            }
            Fraction f3 = new Fraction(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));

            out.println("Сложение: " + f1 + " + " + f2 + " = " + f1.sum(f2));
            out.println("Вычитание: " + f1 + " - " + f2 + " = " + f1.minus(f2));
            out.println("Умножение: " + f1 + " * " + f2 + " = " + f1.mult(f2));
            out.println("Деление: " + f1 + " / " + f2 + " = " + f1.div(f2));
            out.println("Целые числа");
            out.println(f2 + " + 2 = " + f2.sum(2));
            out.println(f2 + " - 2 = " + f2.minus(2));
            out.println(f2 + " * 2 = " + f2.mult(2));
            out.println(f2 + " / 2 = " + f2.div(2));

            Fraction res = f1.sum(f2).div(f3).minus(5);
            out.println("(" + f1 + " + " + f2 + ") / " + f3 + " - 5 = " + res);

        }
        else {
            out.println("Неправильно выбран номер");
        }
    }
}