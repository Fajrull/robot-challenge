package com.enigmacamp;

import java.util.Scanner;

public class RobotApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tentukan posisi awal Robot : ");
        String nilaiAwalRobot = scanner.nextLine();
        String[] nilaiAwalRobotArray = nilaiAwalRobot.split(",");

        int posisiX = Integer.parseInt(nilaiAwalRobotArray[0]);
        int posisiY = Integer.parseInt(nilaiAwalRobotArray[1]);

        System.out.print("Input perintah : ");
        String perintah = scanner.next();
        String[] perintahArray = perintah.split("");

        Robot robot = new Robot(posisiX,posisiY);

       for(String move : perintahArray) {
           switch (move.toUpperCase()) {
               case "F" -> robot.atas();
               case "L" -> robot.kiri();
               case "R" -> robot.kanan();
               case "B" -> robot.bawah();
               default -> {
                   System.out.println("Masukkan perintah yang benar");
                   return;
               }
           }
           System.out.println(move + " -> " + robot.x + "," + robot.y);
       }
    }
}
