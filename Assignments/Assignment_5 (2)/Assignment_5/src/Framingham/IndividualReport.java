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
public class IndividualReport {
    
    public void IndividualReportGeneratorMalick()
            {
                
            

                System.out.println("Enter the Patient Name ");
                Scanner reader = new Scanner(System.in);
                String input = reader.nextLine();

                System.out.println("Enter the details ");

                System.out.println("1.Low Cholesterol =  ");
                Scanner reader1 = new Scanner(System.in);
                int input1 = reader1.nextInt();

                System.out.println("2.High Cholesterol =  ");
                Scanner reader2 = new Scanner(System.in);
                int input2 = reader2.nextInt();

                System.out.println("3.Blood Pressure =  ");
                Scanner reader3 = new Scanner(System.in);
                int input3 = reader3.nextInt();

                System.out.println("4.Diabetes =  ");
                Scanner reader4 = new Scanner(System.in);
                int input4 = reader4.nextInt();

                System.out.println("5.Smoking - yes or no =  ");
                Scanner reader5 = new Scanner(System.in);
                String input5 = reader5.nextLine();

                int a = 0;
                if ((input1 <= 10) && (input1 >= 5)) {
                    a = a + 1;

                }
                if ((input2 <= 10) && (input2 >= 5)) {
                    a = a + 1;

                }

                if ((input3 <= 100) && (input3 >= 50)) {
                    a = a + 1;

                }

                if ((input4 <= 100) && (input4 >= 50)) {
                    a = a + 1;

                }

                if (input5.equalsIgnoreCase("no")) {
                    a = a + 1;

                }

                System.out.println("Health score " + a);

                if (a == 3) {
                    System.out.println("The health condition is **NEUTRAL**");
                }

                if (a < 3) {
                    System.out.println("The health condition is **BAD**");
                }

                if (a > 3) {
                    System.out.println("The health condition is **GOOD**");
                }

            }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public void IndividualReportGeneratorKaran() {

        System.out.println("Enter your Gender");
        Scanner sc = new Scanner(System.in);
        String gender = sc.nextLine();

        System.out.println("Enter your Age");
        Scanner sc1 = new Scanner(System.in);
        int age = sc1.nextInt();

        System.out.println("Enter Total Cholestrol level (mg/dl) ");
        Scanner sc3 = new Scanner(System.in);
        int totalCholestrol = sc3.nextInt();

        System.out.println("Enter HDL-Cholestrol level (mg/dl)");
        Scanner sc4 = new Scanner(System.in);
        int hdlCholestrol = sc4.nextInt();

        System.out.println("Smoker?");
        Scanner sc2 = new Scanner(System.in);
        String smoker = sc2.nextLine();

        System.out.println("Diabetes?");
        Scanner sc5 = new Scanner(System.in);
        String diabetes = sc5.nextLine();

        System.out.println("Enter Systolic Blood Pressure level (mm Hg)");
        Scanner sc6 = new Scanner(System.in);
        int bloodPressure = sc6.nextInt();

        System.out.println("Is the patient being treated for High Blood Pressure?");
        Scanner sc7 = new Scanner(System.in);
        String hbp = sc7.nextLine();

        int agePoints = 0;
        int smokePoints = 0;
        int cholestrolPoints = 0;
        int hdlcholestrolPoints = 0;
        int diabetesPoints = 0;
        int bloodPressurePoints = 0;
        int hbpPoints = 0;
        int totalPoints;

        //Age
        if (gender.equalsIgnoreCase("male")) {
            if (age >= 30 && age <= 34) {
                agePoints = -1;
            } else if (age >= 35 && age <= 39) {
                agePoints = 0;
            } else if (age >= 40 && age <= 44) {
                agePoints = 1;
            } else if (age >= 45 && age <= 49) {
                agePoints = 2;
            } else if (age >= 50 && age <= 54) {
                agePoints = 3;
            } else if (age >= 55 && age <= 59) {
                agePoints = 4;
            } else if (age >= 60 && age <= 64) {
                agePoints = 5;
            } else if (age >= 65 && age <= 69) {
                agePoints = 6;
            } else if (age >= 70 && age <= 74) {
                agePoints = 7;
            }
        } else if (gender.equalsIgnoreCase("female")) {
            if (age >= 30 && age <= 34) {
                agePoints = -9;
            } else if (age >= 35 && age <= 39) {
                agePoints = -4;
            } else if (age >= 40 && age <= 44) {
                agePoints = 0;
            } else if (age >= 45 && age <= 49) {
                agePoints = 3;
            } else if (age >= 50 && age <= 54) {
                agePoints = 6;
            } else if (age >= 55 && age <= 59) {
                agePoints = 7;
            } else if (age >= 60 && age <= 74) {
                agePoints = 8;
            }

        }

        //cholestrol
        if (gender.equalsIgnoreCase("male")) {
            if (totalCholestrol < 160) {
                cholestrolPoints = -3;
            } else if (totalCholestrol >= 160 && totalCholestrol <= 199) {
                cholestrolPoints = 0;
            } else if (totalCholestrol >= 200 && totalCholestrol <= 239) {
                cholestrolPoints = 1;
            } else if (totalCholestrol >= 240 && totalCholestrol <= 279) {
                cholestrolPoints = 2;
            } else if (totalCholestrol >= 280) {
                cholestrolPoints = 3;
            }

        } else if (gender.equalsIgnoreCase("female")) {
            if (totalCholestrol < 160) {
                cholestrolPoints = -2;
            } else if (totalCholestrol >= 160 && totalCholestrol <= 199) {
                cholestrolPoints = 0;
            } else if (totalCholestrol >= 200 && totalCholestrol <= 239) {
                cholestrolPoints = 1;
            } else if (totalCholestrol >= 240 && totalCholestrol <= 279) {
                cholestrolPoints = 1;
            } else if (totalCholestrol >= 280) {
                cholestrolPoints = 3;
            }

        }
        //hdlcholestrol

        if (gender.equalsIgnoreCase("male")) {
            if (hdlCholestrol < 35) {
                hdlcholestrolPoints = 2;
            } else if (hdlCholestrol >= 35 && hdlCholestrol <= 44) {
                hdlcholestrolPoints = 1;
            } else if (hdlCholestrol >= 45 && hdlCholestrol <= 49) {
                hdlcholestrolPoints = 0;
            } else if (hdlCholestrol >= 50 && hdlCholestrol <= 59) {
                hdlcholestrolPoints = 0;
            } else if (hdlCholestrol >= 60) {
                hdlcholestrolPoints = -2;
            }

        } else if (gender.equalsIgnoreCase("female")) {
            if (hdlCholestrol < 35) {
                hdlcholestrolPoints = 5;
            } else if (hdlCholestrol >= 35 && hdlCholestrol <= 44) {
                hdlcholestrolPoints = 2;
            } else if (hdlCholestrol >= 45 && hdlCholestrol <= 49) {
                hdlcholestrolPoints = 1;
            } else if (hdlCholestrol >= 50 && hdlCholestrol <= 59) {
                hdlcholestrolPoints = 0;
            } else if (hdlCholestrol >= 60) {
                hdlcholestrolPoints = -3;
            }
        }

        //smoker
        if (smoker.equalsIgnoreCase("yes")) {
            smokePoints = 2;
        } else if (smoker.equalsIgnoreCase("no")) {
            smokePoints = 0;
        }

        //diabetes
        if (diabetes.equalsIgnoreCase("yes")) {
            diabetesPoints = 2;
        } else if (diabetes.equalsIgnoreCase("no")) {
            diabetesPoints = 0;
        }
        //bloodPressure
        if (gender.equalsIgnoreCase("male")) {
            if (bloodPressure < 120) {
                bloodPressurePoints = 0;
            } else if (bloodPressure >= 120 && bloodPressure <= 129) {
                bloodPressurePoints = 0;
            } else if (bloodPressure >= 130 && bloodPressure <= 139) {
                bloodPressurePoints = 1;
            } else if (bloodPressure >= 140 && bloodPressure <= 159) {
                bloodPressurePoints = 2;
            } else if (bloodPressure >= 160) {
                bloodPressurePoints = 3;
            }

        } else if (gender.equalsIgnoreCase("female")) {
            if (bloodPressure < 35) {
                bloodPressurePoints = -3;
            } else if (bloodPressure >= 35 && bloodPressure <= 44) {
                bloodPressurePoints = 0;
            } else if (bloodPressure >= 45 && bloodPressure <= 49) {
                bloodPressurePoints = 0;
            } else if (bloodPressure >= 50 && bloodPressure <= 59) {
                bloodPressurePoints = 2;
            } else if (bloodPressure >= 60) {
                bloodPressurePoints = 3;
            }
        }
        //high blood pressure
        if (hbp.equalsIgnoreCase("yes")) {
            hbpPoints = 2;
        } else if (hbp.equalsIgnoreCase("no")) {
            hbpPoints = 0;
        }

        totalPoints = agePoints + smokePoints + cholestrolPoints + hdlcholestrolPoints + diabetesPoints + bloodPressurePoints + hbpPoints;
        System.out.println("CHD risk is" + totalPoints);

        if (gender.equalsIgnoreCase("male")) {
            if (totalPoints <= -1) {
                System.out.println("10 year CHD risk is 2%");
            } else if (totalPoints == 0 && totalPoints == 1) {
                System.out.println("10 year CHD risk is 3%");
            } else if (totalPoints == 2) {
                System.out.println("10 year CHD risk is 4%");
            } else if (totalPoints == 3) {
                System.out.println("10 year CHD risk is 5%");
            } else if (totalPoints == 4) {
                System.out.println("10 year CHD risk is 7%");
            } else if (totalPoints == 5) {
                System.out.println("10 year CHD risk is 8%");
            } else if (totalPoints == 6) {
                System.out.println("10 year CHD risk is 10%");
            } else if (totalPoints == 7) {
                System.out.println("10 year CHD risk is 13%");
            } else if (totalPoints == 8) {
                System.out.println("10 year CHD risk is 16%");
            } else if (totalPoints == 9) {
                System.out.println("10 year CHD risk is 20%");
            } else if (totalPoints == 10) {
                System.out.println("10 year CHD risk is 25%");
            } else if (totalPoints == 11) {
                System.out.println("10 year CHD risk is 31%");
            } else if (totalPoints == 12) {
                System.out.println("10 year CHD risk is 37%");
            } else if (totalPoints == 13) {
                System.out.println("10 year CHD risk is 45%");
            } else if (totalPoints == 14) {
                System.out.println("10 year CHD risk is >=53%");
            }

        } else if (gender.equalsIgnoreCase("female")) {
            if (totalPoints <= -2) {
                System.out.println("10 year CHD risk is 1%");
            } else if (totalPoints == 0 && totalPoints == 1 && totalPoints == -1) {
                System.out.println("10 year CHD risk is 2%");
            } else if (totalPoints == 2 && totalPoints == 3) {
                System.out.println("10 year CHD risk is 3%");
            } else if (totalPoints == 4 && totalPoints == 5) {
                System.out.println("10 year CHD risk is 4%");
            } else if (totalPoints == 6) {
                System.out.println("10 year CHD risk is 5%");
            } else if (totalPoints == 7) {
                System.out.println("10 year CHD risk is 6%");
            } else if (totalPoints == 8) {
                System.out.println("10 year CHD risk is 7%");
            } else if (totalPoints == 9) {
                System.out.println("10 year CHD risk is 8%");
            } else if (totalPoints == 10) {
                System.out.println("10 year CHD risk is 10%");
            } else if (totalPoints == 11) {
                System.out.println("10 year CHD risk is 11%");
            } else if (totalPoints == 12) {
                System.out.println("10 year CHD risk is 13%");
            } else if (totalPoints == 13) {
                System.out.println("10 year CHD risk is 15%");
            } else if (totalPoints == 14) {
                System.out.println("10 year CHD risk is 18%");
            } else if (totalPoints == 15) {
                System.out.println("10 year CHD risk is 20%");
            } else if (totalPoints == 16) {
                System.out.println("10 year CHD risk is 24%");
            } else if (totalPoints == 17) {
                System.out.println("10 year CHD risk is >=27%");
            }
        }
    }

}
