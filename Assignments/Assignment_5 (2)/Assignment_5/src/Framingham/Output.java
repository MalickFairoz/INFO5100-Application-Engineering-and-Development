/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framingham;

import java.util.Scanner;

/**
 *
 * @author Malick
 */
public class Output {

    private static IndividualReport individualReport;
    private static Calculation calculation;
    private static CommunityArray ca;
    private static City city;
    private static HouseArray ha;
    private static Community community;

    public static void main(String[] args) {
        IndividualReport individualReport = new IndividualReport();
        Calculation calculation = new Calculation();
        city = Initialization1.Initialization1();
        ca = city.getCommunityArray();

        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        boolean flag4 = true;

        do {
            System.out.println("*********Welcome to the Framingham Heart City*************** ");
            System.out.println("*********Please enter the choice for Health Report");
            
            System.out.println("1. Health report on City level ");
            System.out.println("2. Health report on Community level ");
            System.out.println("3. Health report on House level ");
            System.out.println("4. Health report on Family level ");
            System.out.println("5. Health report on Individuals ");
            
//            System.out.println("6. Health report on Person level ");
            Scanner reader1 = new Scanner(System.in);
            int choice1 = reader1.nextInt();
            switch (choice1) {
                case 1:

                    do {
                        System.out.println("*********Please enter the choice for City Level Report Category**************");
                        System.out.println("1. Categorization on Overall Population - Health Score  ");
                        System.out.println("2. Categorization on Gender type - Health Score ");
                        System.out.println("3. Categorization on Person type - Health Score ");
                        Scanner reader11 = new Scanner(System.in);
                        int choice11 = reader11.nextInt();
                        switch (choice11) {
                            case 1:

                                calculation.calculateCityLevelHealthScoreCount(ca);

                                break;

                            case 2:

                                calculation.calculateCityLevelGenderRatio(ca);

                                break;

                            case 3:

                                calculation.calculateCityLevelPersonTypeRatio(ca);

                                break;

                            default: {
                                System.out.println("Invalid Entry");
                            }

                        }

                        System.out.println("Press Q to quit or any other key to continue");
                        Scanner readQuit11 = new Scanner(System.in);
                        String quit = readQuit11.nextLine();
                        if (quit.equalsIgnoreCase("q")) {
                            flag1 = false;
                        }
                    } while (flag1);

                    break;

                case 2:

                    do {
                        System.out.println("*********Please enter the choice for Community Level Report Category**************");
                        System.out.println("1. Categorization on Overall Population - Health Score  ");
                        System.out.println("2. Categorization on Gender type - Health Score ");
                        System.out.println("3. Categorization on Person type - Health Score ");
                        Scanner reader12 = new Scanner(System.in);
                        int choice12 = reader12.nextInt();
                        switch (choice12) {
                            case 1:

                                calculation.calculateCommunityLevelHealthScoreCount(ca);

                                break;

                            case 2:

                                calculation.calculateCommunityLevelGenderRatio(ca);

                                break;

                            case 3:

                                calculation.calculateCommunityLevelPersonTypeRatio(ca);

                                break;

                            default: {
                                System.out.println("Invalid Entry");
                            }

                        }

                        System.out.println("Press Q to quit or any other key to continue");
                        Scanner readQuit12 = new Scanner(System.in);
                        String quit = readQuit12.nextLine();
                        if (quit.equalsIgnoreCase("q")) {
                            flag2 = false;
                        }
                    } while (flag2);

                    break;

                case 3:

                    do {
                        System.out.println("*********Please enter the choice for House Level Report Category**************");
                        System.out.println("1. Categorization on Overall Population - Health Score  ");
                        System.out.println("2. Categorization on Gender type - Health Score ");
                        System.out.println("3. Categorization on Person type - Health Score ");
                        Scanner reader13 = new Scanner(System.in);
                        int choice13 = reader13.nextInt();
                        switch (choice13) {
                            case 1:

                                calculation.calculateHouseLevelHealthScoreCount(ca);

                                break;

                            case 2:

                                calculation.calculateHouseLevelGenderRatio(ca);

                                break;

                            case 3:

                                calculation.calculateHouseLevelPersonTypeRatio(ca);

                                break;

                            default: {
                                System.out.println("Invalid Entry");
                            }

                        }

                        System.out.println("Press Q to quit or any other key to continue");
                        Scanner readQuit13 = new Scanner(System.in);
                        String quit = readQuit13.nextLine();
                        if (quit.equalsIgnoreCase("q")) {
                            flag3 = false;
                        }
                    } while (flag3);

                    break;

                case 4:

                    do {
                        System.out.println("*********Please enter the choice for Family Level Report Category**************");
                        System.out.println("1. Categorization on Overall Population - Health Score  ");
                        System.out.println("2. Categorization on Gender type - Health Score ");
                        System.out.println("3. Categorization on Person type - Health Score ");
                        Scanner reader14 = new Scanner(System.in);
                        int choice14 = reader14.nextInt();
                        switch (choice14) {
                            case 1:

                                calculation.calculateFamilyLevelHealthScoreCount(ca);

                                break;

                            case 2:

                                calculation.calculateFamilyLevelGenderRatio(ca);

                                break;

                            case 3:

                                calculation.calculateFamilyLevelPersonTypeRatio(ca);

                                break;

                            default: {
                                System.out.println("Invalid Entry");
                            }

                        }

                        System.out.println("Press Q to quit or any other key to continue");
                        Scanner readQuit14 = new Scanner(System.in);
                        String quit = readQuit14.nextLine();
                        if (quit.equalsIgnoreCase("q")) {
                            flag4 = false;
                        }
                    } while (flag4);

                    break;

                case 5:

                //    individualReport.IndividualReportGeneratorMalick();
                   individualReport.IndividualReportGeneratorKaran();

                    break;

                default: {
                    System.out.println("Invalid Entry");
                }

            }

            System.out.println("Press Q to quit or any other key to continue");
            Scanner readQuit = new Scanner(System.in);
            String quit = readQuit.nextLine();
            if (quit.equalsIgnoreCase("q")) {
                flag = false;
            }
        } while (flag);

    }
}
