package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        int clientOs = 1;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOs < 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        int clientDeviceYear = 2016;
        int clientsOs = 1;

        if (clientDeviceYear < 2015 && clientsOs == 1) {
            System.out.println("Установите облегченную версию приложения для IOs по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientsOs == 1) {
            System.out.println("Установите обычную версию приложения для iOs по ссылке");
        } else if (clientDeviceYear < 2015 && clientsOs == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientsOs == 0) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }


        int year = 2021;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }


        int deliveryDistance = 95;

        if (deliveryDistance <= 20) {
            System.out.println("Доставка осуществляется за 1 день");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60 ) {
            System.out.println("Доставка осуществляется за 2 дня ");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка осуществляется за 3 дня");
        }else {
            System.out.println("Доставка не возит");
        }



             int monthNumber = 3;

            switch(monthNumber) {
                case 1:
                System.out.println("Январь");
                break;
                case 2:
                System.out.println("Февраль");
                break;
                case 3:
                System.out.println("Март");
                break;
                case 4:
                System.out.println("Апрель");
                break;
                case 5:
                System.out.println("Май");
                break;
                case 6:
                System.out.println("Июнь");
                break;
                case 7:
                System.out.println("Июль");
                break;
                case 8:
                System.out.println("Август");
                break;
                case 9:
                System.out.println("Сентябрь");
                break;
                case 10:
                System.out.println("Октябрь");
                break;
                case 11:
                System.out.println("Ноябрь");
                break;
                case 12:
                System.out.println("Декабрь");
                break;
                default:
                    System.out.println("Такого месяца нет");
            }
    }


    }


