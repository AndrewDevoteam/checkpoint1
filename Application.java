package CheckpointOne;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String carMatrix[][] = new String[6][3];
        Scanner keyboard = new Scanner(System.in);

        carMatrix[0][0] = "Suburban";
        carMatrix[0][1] = "Malibu";
        carMatrix[0][2] = "Silverado";
        carMatrix[1][0] = "Azera";
        carMatrix[1][1] = "Sonata";
        carMatrix[1][2] = "Veloster";
        carMatrix[2][0] = "Golf";
        carMatrix[2][1] = "Jetta";
        carMatrix[2][2] = "Polo";
        carMatrix[3][0] = "A4";
        carMatrix[3][1] = "Q7";
        carMatrix[3][2] = "R8";
        carMatrix[4][0] = "C 180";
        carMatrix[4][1] = "C 200";
        carMatrix[4][2] = "GLA 200";
        carMatrix[5][0] = "206";
        carMatrix[5][1] = "208";
        carMatrix[5][2] = "2008";
        int selectedValue = 0;
        int continueOrNot = 1;

        while (continueOrNot != 0) {
            System.out.println("Please select a car brand to see the available vehicles");
            System.out.println("1.GM");
            System.out.println("2.Hyundia");
            System.out.println("3.Volkswagen");
            System.out.println("4. Audi");
            System.out.println("5. Mercedes");
            System.out.println("6. Peugeot");
            System.out.println("0 - Exit");
            selectedValue = keyboard.nextInt();

            switch (selectedValue) {

                case 1, 2, 3, 4, 5, 6 -> {
                    for (int i = 1; i < 2; i++) {
                        System.out.println("Available Cars");
                        for (int j = 0; j < carMatrix[i].length; j++) {
                            System.out.println(carMatrix[selectedValue - 1][j]);
                        }
                    }
                }
                default -> System.out.println("Invalid input");
            }
            System.out.println("Do you wish to continue?");
            System.out.println("0. No");
            System.out.println("1. Yes");
            continueOrNot = keyboard.nextInt();
        }
        System.out.println("Program Terminated");
    }
}