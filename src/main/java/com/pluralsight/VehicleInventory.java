package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {
    private static Vehicle[] vehicles = new Vehicle[20];
    private static int numVehickes = 6;
    public static void main(String[] args) {
        Vehicle first = new Vehicle(101121,"Ford Explorer","Red",45000,13500f);
        Vehicle second = new Vehicle(101122,"Toyota Camry","Blue",60000,11000f);
        Vehicle third = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700f);
        Vehicle fourth = new Vehicle(101124,"Honda Civic","White",70000,7500f);
        Vehicle fifth = new Vehicle(101125,"Subaru Outback","Green",55000,14500f);
        Vehicle sixth = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000f);

        vehicles[0]=first;
        vehicles[1]=second;
        vehicles[2]=third;
        vehicles[3]=fourth;
        vehicles[4]=fifth;
        vehicles[5]=sixth;

        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("What do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.println("Enter you command:");

            int command = in.nextInt();
            switch (command){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    break;
            }
        }
    }
}
