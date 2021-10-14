package com.company;

import Geometry.Point;
import Geometry.Triangle;
import Support.Support;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String inputX = "Введите x: ";
        String inputY = "Введите y: ";
        String error = "Допущена ошибка, повторите ввод: ";
        double x;
        double y;
        Point[] points = new Point[3];
        for (int i = 0; i < 3; i++){
            System.out.println ("Ввод " + Integer.toString(i+1) + " точки.");
            x = Support.inputDouble (scan, inputX, error);
            y = Support.inputDouble (scan, inputY, error);
            points[i] = new Point (x, y);
        }
        System.out.println ("Площадь треугольника равна: " +
                String.format (
                        Double.toString (new Triangle (points[0], points[1], points[2]).getArea ()),
                        "%1.f"));
    }
}
