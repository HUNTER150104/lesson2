package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введи цвет");
        String color =scanner.nextLine();

	switch (color){
        case "черный":
            System.out.println("вы грубый и агрессивный");
            break;
        case "белый":
            System.out.println("нет ответа");
            break;
        case "красный":
            System.out.println("вы добрый и мягкий");
            break;
        default:
            System.out.println("404 error not found ");



    }
    }
}
