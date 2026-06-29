/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author FMT
 */
public class RabbitProblem {
    
    public static int rabbits(int month) {

        if (month == 1 || month == 2)
            return 1;

        return rabbits(month - 1) + rabbits(month - 2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of months: ");
        int month = input.nextInt();

        System.out.println("Rabbit pairs after " + month +
                " months = " + rabbits(month));
    }
}

