package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {
    private static Vehicle[] vehicles = new Vehicle[20];
    private static int numVehicles = 6;
    public static void main(String[] args) {

        vehicles[0] = new Vehicle(101121,"Ford Explorer","Red",45000,13500f);
        vehicles[1] = new Vehicle(101122,"Toyota Camry","Blue",60000,11000f);
        vehicles[2] = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700f);
        vehicles[3] = new Vehicle(101124,"Honda Civic","White",70000,7500f);
        vehicles[4] = new Vehicle(101125,"Subaru Outback","Green",55000,14500f);
        vehicles[5] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000f);


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
            in.nextLine();
            switch (command){
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    findVehiclesByMakeModel(in);
                    break;
                case 3:
                    findVehiclesByPriceRange(in);
                    break;
                case 4:
                    findVehiclesByColor(in);
                    break;
                case 5:
                    addVehicle(in);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid Command");
                    break;
            }
        }
    }
    public static void listAllVehicles(){
        System.out.println("Vehicle Inventory:");
        for (int i = 0; i<numVehicles;i++){
            System.out.println(vehicles[i]);
        }
    }
    public static void  findVehiclesByMakeModel(Scanner in){
        System.out.println("Enter make and mode: ");
        String makeModel = in.nextLine();
        boolean found = false;
        for (int num = 0; num < numVehicles; num++) {
            if(vehicles[num].getMakeModel().equalsIgnoreCase(makeModel)){
                System.out.println(vehicles[num]);
                found = true;
            }
        }
        if(!found){
            System.out.println("No Vehicles Found!");
        }
    }
    public static void  findVehiclesByPriceRange(Scanner in){
        System.out.println("Enter lowest price: ");
        float lowest = in.nextFloat();
        System.out.println("Enter highest price: ");
        float highest = in.nextFloat();
        boolean found = false;
        for (int num = 0; num < numVehicles; num++) {
            if(lowest <= vehicles[num].getPrice()&& vehicles[num].getPrice()<=highest ){
                System.out.println(vehicles[num]);
                found = true;
            }
        }
        if(!found){
            System.out.println("No Vehicles Found!");
        }
    }
    public static void  findVehiclesByColor(Scanner in){
        System.out.println("Enter Color: ");
        String color = in.nextLine();
        boolean found = false;
        for (int num = 0; num < numVehicles; num++) {
            if(vehicles[num].getColor().equalsIgnoreCase(color)){
                System.out.println(vehicles[num]);
                found = true;
            }
        }
        if(!found){
            System.out.println("No Vehicles Found!");
        }
    }
    public static void addVehicle(Scanner in){
        if(numVehicles == 20){
            System.out.println("Inventory is full");
        }
        else {
            System.out.println("Please enter the vehicle Id:");
            int id = in.nextInt();
            in.nextLine();
            System.out.println("Please enter the make model:");
            String makeModel = in.nextLine();
            System.out.println("Please enter the color:");
            String color = in.nextLine();
            System.out.println("Please enter the odometer reading:");
            int odometer = in.nextInt();
            in.nextLine();
            System.out.println("Please enter the price:");
            float price = in.nextFloat();
            in.nextLine();
            vehicles[numVehicles] = new Vehicle(id, makeModel,color, odometer,price);
            numVehicles++;
            System.out.println("Vehicle added");
        }
    }
}
