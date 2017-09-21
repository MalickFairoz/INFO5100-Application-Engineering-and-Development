/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framingham;

import java.util.ArrayList;

/**
 *
 * @author Malick
 */
public class Calculation {

    public void calculateCityLevelHealthScoreCount(CommunityArray ca) {

        int a, personSizeCity = 0, infectedPerson = 0, normalPerson = 0, healthPerson = 0, infectedMale = 0, infectedFemale = 0;
        int infectedChildren = 0, infectedParents = 0, infectedGrandParents = 0;
        for (Community c : ca.getCommunityArray()) {
            for (House h : c.getHouseArray().getHouseArray()) {
                for (Family f : h.getFamilyArray().getFamilyArray()) {
                    for (Person p : f.getPersonArray().getPersonArray()) {
                        personSizeCity++;

                        for (VitalSign vs : p.getVitalSignArray().getVitalSignArray()) {
                            a = 0;

                            if ((vs.getLowCholesterol() <= 10) && (vs.getLowCholesterol() >= 5)) {
                                a = a + 1;

                            }
                            if ((vs.getHighCholesterol() <= 10) && (vs.getHighCholesterol() >= 5)) {
                                a = a + 1;

                            }

                            if ((vs.getBloodPressure() <= 100) && (vs.getBloodPressure() >= 50)) {
                                a = a + 1;

                            }

                            if ((vs.getDiabetes() <= 100) && (vs.getDiabetes() >= 50)) {
                                a = a + 1;

                            }

                            String s = (String.valueOf(vs.isSmoke()));
                            if (s.equalsIgnoreCase("false")) {
                                a = a + 1;

                            }

                            vs.getHealthReportArray().addRisk(a);
                            for (HealthReport hr : vs.getHealthReportArray().getHealthReportArray()) {
                                if (hr.getHealthScore() < 3) {
                                    infectedPerson++;
                                    if (p.getSex() == "Male") {
                                        infectedMale++;
                                    } else if (p.getSex() == "Female") {
                                        infectedFemale++;
                                    }
                                    if (p.getAge() > 1 && p.getAge() <= 24) {
                                        infectedChildren++;
                                    }
                                    if (p.getAge() > 25 && p.getAge() <= 60) {
                                        infectedParents++;
                                    }
                                    if (p.getAge() > 60) {
                                        infectedGrandParents++;
                                    }
                                }
                                if (hr.getHealthScore() == 3) {
                                    normalPerson++;
                                }
                                if (hr.getHealthScore() > 3) {
                                    healthPerson++;
                                }

                            }

                        }

                    }
                }
            }
        }
        System.out.println("Name of the City : Boston");
        //      System.out.println("No of person in the city : " + personSizeCity);
        System.out.println("No of person infected to heart problem : " + infectedPerson);
        System.out.println("No of person in normal health  : " + normalPerson);
        System.out.println("No of person with GOOD Health  : " + healthPerson);
        System.out.println("");
//        System.out.print("Male : Female Ratio of infected people : " + infectedMale);
//        System.out.println(" : " + infectedFemale);
//
//        System.out.println("No of Children affected  : " + infectedChildren);
//        System.out.println("No of Parents affected  : " + infectedParents);
//        System.out.println("No of GrandParents affected  : " + infectedGrandParents);

    }

    public void calculateCommunityLevelHealthScoreCount(CommunityArray ca) {

        int a, infectedPerson = 0, normalPerson = 0, healthPerson = 0, infectedMale = 0, infectedFemale = 0;
        int totalPersonPerCommunity = 0;
        int infectedChildren = 0, infectedParents = 0, infectedGrandParents = 0;
        for (Community c : ca.getCommunityArray()) {
            for (House h : c.getHouseArray().getHouseArray()) {
                for (Family f : h.getFamilyArray().getFamilyArray()) {
                    for (Person p : f.getPersonArray().getPersonArray()) {
                        for (VitalSign vs : p.getVitalSignArray().getVitalSignArray()) {
                            a = 0;

                            if ((vs.getLowCholesterol() <= 10) && (vs.getLowCholesterol() >= 5)) {
                                a = a + 1;

                            }
                            if ((vs.getHighCholesterol() <= 10) && (vs.getHighCholesterol() >= 5)) {
                                a = a + 1;

                            }

                            if ((vs.getBloodPressure() <= 100) && (vs.getBloodPressure() >= 50)) {
                                a = a + 1;

                            }

                            if ((vs.getDiabetes() <= 100) && (vs.getDiabetes() >= 50)) {
                                a = a + 1;

                            }

                            String s = (String.valueOf(vs.isSmoke()));
                            if (s.equalsIgnoreCase("false")) {
                                a = a + 1;

                            }

                            vs.getHealthReportArray().addRisk(a);
                            for (HealthReport hr : vs.getHealthReportArray().getHealthReportArray()) {
                                if ((hr.getHealthScore() < 3)) {
                                    infectedPerson++;
                                    if (p.getSex() == "Male") {
                                        infectedMale++;
                                    } else if (p.getSex() == "Female") {
                                        infectedFemale++;
                                    }
                                    if (p.getAge() > 1 && p.getAge() <= 24) {
                                        infectedChildren++;
                                    }
                                    if (p.getAge() > 25 && p.getAge() <= 60) {
                                        infectedParents++;
                                    }
                                    if (p.getAge() > 60) {
                                        infectedGrandParents++;
                                    }
                                }
                                if (hr.getHealthScore() == 3) {
                                    normalPerson++;
                                }
                                if (hr.getHealthScore() > 3) {
                                    healthPerson++;
                                }

                            }

                        }

                        totalPersonPerCommunity++;
                    }
                }
            }
            System.out.println("Community Name : " + c.getNameCommunity());
            //           System.out.println("No of person in the Community  : " + totalPersonPerCommunity);
            System.out.println("No of person infected to heart problem : " + infectedPerson);
            System.out.println("No of person in normal health  : " + normalPerson);
            System.out.println("No of person with GOOD Health  : " + healthPerson);
            System.out.println("");
//            System.out.print("Male : Female Ratio of infected people : " + infectedMale);
//            System.out.println("No of Children affected  : " + infectedChildren);
//            System.out.println("No of Parents affected  : " + infectedParents);
//            System.out.println("No of GrandParents affected  : " + infectedGrandParents);
//            System.out.println(" : " + infectedFemale);
            totalPersonPerCommunity = 0;
            infectedPerson = 0;
            infectedPerson = 0;
            normalPerson = 0;
            healthPerson = 0;
            infectedMale = 0;
            infectedFemale = 0;
            infectedChildren = 0;
            infectedParents = 0;
            infectedGrandParents = 0;
        }

    }

    public void calculateHouseLevelHealthScoreCount(CommunityArray ca) {

        int a;
        int infectedPerson = 0;
        int infectedPerson1 = 0;
        int normalPerson = 0;
        int normalPerson1 = 0;
        int healthPerson = 0;
        int healthPerson1 = 0;
        int totalPersonPerCommunity = 0;
        int totalPersonPerHouse = 0;
        int infectedMale = 0;
        int infectedFemale = 0;
        int infectedChildren = 0, infectedParents = 0, infectedGrandParents = 0;
        for (Community c : ca.getCommunityArray()) {
            for (House h : c.getHouseArray().getHouseArray()) {
                for (Family f : h.getFamilyArray().getFamilyArray()) {
                    for (Person p : f.getPersonArray().getPersonArray()) {
                        for (VitalSign vs : p.getVitalSignArray().getVitalSignArray()) {
                            a = 0;

                            if ((vs.getLowCholesterol() <= 10) && (vs.getLowCholesterol() >= 5)) {
                                a = a + 1;

                            }
                            if ((vs.getHighCholesterol() <= 10) && (vs.getHighCholesterol() >= 5)) {
                                a = a + 1;

                            }

                            if ((vs.getBloodPressure() <= 100) && (vs.getBloodPressure() >= 50)) {
                                a = a + 1;

                            }

                            if ((vs.getDiabetes() <= 100) && (vs.getDiabetes() >= 50)) {
                                a = a + 1;

                            }

                            String s = (String.valueOf(vs.isSmoke()));
                            if (s.equalsIgnoreCase("false")) {
                                a = a + 1;

                            }

                            vs.getHealthReportArray().addRisk(a);
                            for (HealthReport hr : vs.getHealthReportArray().getHealthReportArray()) {
                                if ((hr.getHealthScore() < 3)) {
                                    infectedPerson1++;
                                    if (p.getSex() == "Male") {
                                        infectedMale++;
                                    } else if (p.getSex() == "Female") {
                                        infectedFemale++;
                                    }
                                    if (p.getAge() > 1 && p.getAge() <= 24) {
                                        infectedChildren++;
                                    }
                                    if (p.getAge() > 25 && p.getAge() <= 60) {
                                        infectedParents++;
                                    }
                                    if (p.getAge() > 60) {
                                        infectedGrandParents++;
                                    }
                                }
                                if (hr.getHealthScore() == 3) {
                                    normalPerson1++;
                                }
                                if (hr.getHealthScore() > 3) {
                                    healthPerson1++;
                                }

                            }
                            totalPersonPerHouse++;
                        }

                        // totalPersonPerCommunity++;
                    }

                }
                System.out.println("Community Name : " + c.getNameCommunity());
                System.out.println("House Name : " + h.getNameHouse());
//                System.out.println("No of person in the Community  : " + totalPersonPerCommunity);
//                System.out.println("No of person in the House  : " + totalPersonPerHouse);
                System.out.println("No of person infected to heart problem : " + infectedPerson1);
                System.out.println("No of person in normal health  : " + normalPerson1);
                System.out.println("No of person with GOOD Health  : " + healthPerson1);
                System.out.println("");
//                System.out.print("Male : Female Ratio of infected people : " + infectedMale);
//                System.out.println("No of Children affected  : " + infectedChildren);
//                System.out.println("No of Parents affected  : " + infectedParents);
//                System.out.println("No of GrandParents affected  : " + infectedGrandParents);
//                System.out.println(" : " + infectedFemale);

                infectedPerson1 = 0;
                infectedPerson = 0;
                normalPerson1 = 0;
                healthPerson1 = 0;
                totalPersonPerHouse = 0;
                infectedMale = 0;
                infectedFemale = 0;
                infectedChildren = 0;
                infectedParents = 0;
                infectedGrandParents = 0;
            }
            totalPersonPerCommunity = 0;
        }

    }

    public void calculateFamilyLevelHealthScoreCount(CommunityArray ca) {

        int a;
        int infectedPerson = 0;
        int normalPerson = 0;
        int healthPerson = 0;
        int totalPersonPerFamily = 0;
        int infectedMale = 0;
        int infectedFemale = 0;
        int infectedChildren = 0, infectedParents = 0, infectedGrandParents = 0;
        for (Community c : ca.getCommunityArray()) {
            for (House h : c.getHouseArray().getHouseArray()) {
                for (Family f : h.getFamilyArray().getFamilyArray()) {
                    for (Person p : f.getPersonArray().getPersonArray()) {
                        for (VitalSign vs : p.getVitalSignArray().getVitalSignArray()) {
                            a = 0;

                            if ((vs.getLowCholesterol() <= 10) && (vs.getLowCholesterol() >= 5)) {
                                a = a + 1;

                            }
                            if ((vs.getHighCholesterol() <= 10) && (vs.getHighCholesterol() >= 5)) {
                                a = a + 1;

                            }

                            if ((vs.getBloodPressure() <= 100) && (vs.getBloodPressure() >= 50)) {
                                a = a + 1;

                            }

                            if ((vs.getDiabetes() <= 100) && (vs.getDiabetes() >= 50)) {
                                a = a + 1;

                            }

                            String s = (String.valueOf(vs.isSmoke()));
                            if (s.equalsIgnoreCase("false")) {
                                a = a + 1;

                            }

                            vs.getHealthReportArray().addRisk(a);
                            for (HealthReport hr : vs.getHealthReportArray().getHealthReportArray()) {
                                if ((hr.getHealthScore() < 3)) {
                                    infectedPerson++;
                                    if (p.getSex() == "Male") {
                                        infectedMale++;
                                    } else if (p.getSex() == "Female") {
                                        infectedFemale++;
                                    }
                                    if (p.getAge() > 1 && p.getAge() <= 24) {
                                        infectedChildren++;
                                    }
                                    if (p.getAge() > 25 && p.getAge() <= 60) {
                                        infectedParents++;
                                    }
                                    if (p.getAge() > 60) {
                                        infectedGrandParents++;
                                    }
                                }
                                if (hr.getHealthScore() == 3) {
                                    normalPerson++;
                                }
                                if (hr.getHealthScore() > 3) {
                                    healthPerson++;
                                }

                            }
                            totalPersonPerFamily++;
                        }

                    }

                    System.out.println("Community Name : " + c.getNameCommunity());
                    System.out.println("House Name : " + h.getNameHouse());
                    System.out.println("Family Name : " + f.getNameFamily());
                    
//                    System.out.println("No of person in the family  : " + totalPersonPerFamily);
                    System.out.println("No of person infected to heart problem : " + infectedPerson);
                    System.out.println("No of person in normal health  : " + normalPerson);
                    System.out.println("No of person with GOOD Health  : " + healthPerson);
                    System.out.println("");
//                    System.out.print("Male : Female Ratio of infected people : " + infectedMale);
//                    System.out.println(" : " + infectedFemale);
//
//                    System.out.println("No of Children affected  : " + infectedChildren);
//                    System.out.println("No of Parents affected  : " + infectedParents);
//                    System.out.println("No of GrandParents affected  : " + infectedGrandParents);

                }

                infectedPerson = 0;
                normalPerson = 0;
                healthPerson = 0;
                totalPersonPerFamily = 0;
                infectedMale = 0;
                infectedFemale = 0;
                infectedChildren = 0;
                infectedParents = 0;
                infectedGrandParents = 0;
            }
        }

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void calculateCityLevelGenderRatio(CommunityArray ca) {

        int a, personSizeCity = 0, infectedPerson = 0, normalPerson = 0, healthPerson = 0, infectedMale = 0, infectedFemale = 0;
        int infectedChildren = 0, infectedParents = 0, infectedGrandParents = 0;
        for (Community c : ca.getCommunityArray()) {
            for (House h : c.getHouseArray().getHouseArray()) {
                for (Family f : h.getFamilyArray().getFamilyArray()) {
                    for (Person p : f.getPersonArray().getPersonArray()) {
                        personSizeCity++;

                        for (VitalSign vs : p.getVitalSignArray().getVitalSignArray()) {
                            a = 0;

                            if ((vs.getLowCholesterol() <= 10) && (vs.getLowCholesterol() >= 5)) {
                                a = a + 1;

                            }
                            if ((vs.getHighCholesterol() <= 10) && (vs.getHighCholesterol() >= 5)) {
                                a = a + 1;

                            }

                            if ((vs.getBloodPressure() <= 100) && (vs.getBloodPressure() >= 50)) {
                                a = a + 1;

                            }

                            if ((vs.getDiabetes() <= 100) && (vs.getDiabetes() >= 50)) {
                                a = a + 1;

                            }

                            String s = (String.valueOf(vs.isSmoke()));
                            if (s.equalsIgnoreCase("false")) {
                                a = a + 1;

                            }

                            vs.getHealthReportArray().addRisk(a);
                            for (HealthReport hr : vs.getHealthReportArray().getHealthReportArray()) {
                                if (hr.getHealthScore() < 3) {
                                    infectedPerson++;
                                    if (p.getSex() == "Male") {
                                        infectedMale++;
                                    } else if (p.getSex() == "Female") {
                                        infectedFemale++;
                                    }
                                    if (p.getAge() > 1 && p.getAge() <= 24) {
                                        infectedChildren++;
                                    }
                                    if (p.getAge() > 25 && p.getAge() <= 60) {
                                        infectedParents++;
                                    }
                                    if (p.getAge() > 60) {
                                        infectedGrandParents++;
                                    }
                                }
                                if (hr.getHealthScore() == 3) {
                                    normalPerson++;
                                }
                                if (hr.getHealthScore() > 3) {
                                    healthPerson++;
                                }

                            }

                        }

                    }
                }
            }
        }
        System.out.println("Name of the City : Boston");
        //      System.out.println("No of person in the city : " + personSizeCity);
//        System.out.println("No of person infected to heart problem : " + infectedPerson);
//        System.out.println("No of person in normal health  : " + normalPerson);
//        System.out.println("No of person with GOOD Health  : " + healthPerson);

        System.out.println("Male Ratio of infected people :   " + infectedMale);
        System.out.println("Female Ratio of infected people :   " + infectedFemale);
        System.out.println("");

//        System.out.println("No of Children affected  : " + infectedChildren);
//        System.out.println("No of Parents affected  : " + infectedParents);
//        System.out.println("No of GrandParents affected  : " + infectedGrandParents);

    }

    public void calculateCommunityLevelGenderRatio(CommunityArray ca) {

        int a, infectedPerson = 0, normalPerson = 0, healthPerson = 0, infectedMale = 0, infectedFemale = 0;
        int totalPersonPerCommunity = 0;
        int infectedChildren = 0, infectedParents = 0, infectedGrandParents = 0;
        for (Community c : ca.getCommunityArray()) {
            for (House h : c.getHouseArray().getHouseArray()) {
                for (Family f : h.getFamilyArray().getFamilyArray()) {
                    for (Person p : f.getPersonArray().getPersonArray()) {
                        for (VitalSign vs : p.getVitalSignArray().getVitalSignArray()) {
                            a = 0;

                            if ((vs.getLowCholesterol() <= 10) && (vs.getLowCholesterol() >= 5)) {
                                a = a + 1;

                            }
                            if ((vs.getHighCholesterol() <= 10) && (vs.getHighCholesterol() >= 5)) {
                                a = a + 1;

                            }

                            if ((vs.getBloodPressure() <= 100) && (vs.getBloodPressure() >= 50)) {
                                a = a + 1;

                            }

                            if ((vs.getDiabetes() <= 100) && (vs.getDiabetes() >= 50)) {
                                a = a + 1;

                            }

                            String s = (String.valueOf(vs.isSmoke()));
                            if (s.equalsIgnoreCase("false")) {
                                a = a + 1;

                            }

                            vs.getHealthReportArray().addRisk(a);
                            for (HealthReport hr : vs.getHealthReportArray().getHealthReportArray()) {
                                if ((hr.getHealthScore() < 3)) {
                                    infectedPerson++;
                                    if (p.getSex() == "Male") {
                                        infectedMale++;
                                    } else if (p.getSex() == "Female") {
                                        infectedFemale++;
                                    }
                                    if (p.getAge() > 1 && p.getAge() <= 24) {
                                        infectedChildren++;
                                    }
                                    if (p.getAge() > 25 && p.getAge() <= 60) {
                                        infectedParents++;
                                    }
                                    if (p.getAge() > 60) {
                                        infectedGrandParents++;
                                    }
                                }
                                if (hr.getHealthScore() == 3) {
                                    normalPerson++;
                                }
                                if (hr.getHealthScore() > 3) {
                                    healthPerson++;
                                }

                            }

                        }

                        totalPersonPerCommunity++;
                    }
                }
            }
            System.out.println("Community Name : " + c.getNameCommunity());
            //           System.out.println("No of person in the Community  : " + totalPersonPerCommunity);
//            System.out.println("No of person infected to heart problem : " + infectedPerson);
//            System.out.println("No of person in normal health  : " + normalPerson);
//            System.out.println("No of person with GOOD Health  : " + healthPerson);
        System.out.println("Male Ratio of infected people :   " + infectedMale);
        System.out.println("Female Ratio of infected people :   " + infectedFemale);
        System.out.println("");
//            System.out.println("No of Children affected  : " + infectedChildren);
//            System.out.println("No of Parents affected  : " + infectedParents);
//            System.out.println("No of GrandParents affected  : " + infectedGrandParents);
            totalPersonPerCommunity = 0;
            infectedPerson = 0;
            infectedPerson = 0;
            normalPerson = 0;
            healthPerson = 0;
            infectedMale = 0;
            infectedFemale = 0;
            infectedChildren = 0;
            infectedParents = 0;
            infectedGrandParents = 0;
        }

    }

    public void calculateHouseLevelGenderRatio(CommunityArray ca) {

        int a;
        int infectedPerson = 0;
        int infectedPerson1 = 0;
        int normalPerson = 0;
        int normalPerson1 = 0;
        int healthPerson = 0;
        int healthPerson1 = 0;
        int totalPersonPerCommunity = 0;
        int totalPersonPerHouse = 0;
        int infectedMale = 0;
        int infectedFemale = 0;
        int infectedChildren = 0, infectedParents = 0, infectedGrandParents = 0;
        for (Community c : ca.getCommunityArray()) {
            for (House h : c.getHouseArray().getHouseArray()) {
                for (Family f : h.getFamilyArray().getFamilyArray()) {
                    for (Person p : f.getPersonArray().getPersonArray()) {
                        for (VitalSign vs : p.getVitalSignArray().getVitalSignArray()) {
                            a = 0;

                            if ((vs.getLowCholesterol() <= 10) && (vs.getLowCholesterol() >= 5)) {
                                a = a + 1;

                            }
                            if ((vs.getHighCholesterol() <= 10) && (vs.getHighCholesterol() >= 5)) {
                                a = a + 1;

                            }

                            if ((vs.getBloodPressure() <= 100) && (vs.getBloodPressure() >= 50)) {
                                a = a + 1;

                            }

                            if ((vs.getDiabetes() <= 100) && (vs.getDiabetes() >= 50)) {
                                a = a + 1;

                            }

                            String s = (String.valueOf(vs.isSmoke()));
                            if (s.equalsIgnoreCase("false")) {
                                a = a + 1;

                            }

                            vs.getHealthReportArray().addRisk(a);
                            for (HealthReport hr : vs.getHealthReportArray().getHealthReportArray()) {
                                if ((hr.getHealthScore() < 3)) {
                                    infectedPerson1++;
                                    if (p.getSex() == "Male") {
                                        infectedMale++;
                                    } else if (p.getSex() == "Female") {
                                        infectedFemale++;
                                    }
                                    if (p.getAge() > 1 && p.getAge() <= 24) {
                                        infectedChildren++;
                                    }
                                    if (p.getAge() > 25 && p.getAge() <= 60) {
                                        infectedParents++;
                                    }
                                    if (p.getAge() > 60) {
                                        infectedGrandParents++;
                                    }
                                }
                                if (hr.getHealthScore() == 3) {
                                    normalPerson1++;
                                }
                                if (hr.getHealthScore() > 3) {
                                    healthPerson1++;
                                }

                            }
                            totalPersonPerHouse++;
                        }

                        // totalPersonPerCommunity++;
                    }

                }
                System.out.println("Community Name : " + c.getNameCommunity());
                System.out.println("House Name : " + h.getNameHouse());
//                System.out.println("No of person in the Community  : " + totalPersonPerCommunity);
//                System.out.println("No of person in the House  : " + totalPersonPerHouse);
//                System.out.println("No of person infected to heart problem : " + infectedPerson1);
//                System.out.println("No of person in normal health  : " + normalPerson1);
//                System.out.println("No of person with GOOD Health  : " + healthPerson1);
                System.out.println("Male Ratio of infected people :   " + infectedMale);
                System.out.println("Female Ratio of infected people :   " + infectedFemale);
                System.out.println("");
//                System.out.println("No of Children affected  : " + infectedChildren);
//                System.out.println("No of Parents affected  : " + infectedParents);
//                System.out.println("No of GrandParents affected  : " + infectedGrandParents);


                infectedPerson1 = 0;
                infectedPerson = 0;
                normalPerson1 = 0;
                healthPerson1 = 0;
                totalPersonPerHouse = 0;
                infectedMale = 0;
                infectedFemale = 0;
                infectedChildren = 0;
                infectedParents = 0;
                infectedGrandParents = 0;
            }
            totalPersonPerCommunity = 0;
        }

    }

    public void calculateFamilyLevelGenderRatio(CommunityArray ca) {

        int a;
        int infectedPerson = 0;
        int normalPerson = 0;
        int healthPerson = 0;
        int totalPersonPerFamily = 0;
        int infectedMale = 0;
        int infectedFemale = 0;
        int infectedChildren = 0, infectedParents = 0, infectedGrandParents = 0;
        for (Community c : ca.getCommunityArray()) {
            for (House h : c.getHouseArray().getHouseArray()) {
                for (Family f : h.getFamilyArray().getFamilyArray()) {
                    for (Person p : f.getPersonArray().getPersonArray()) {
                        for (VitalSign vs : p.getVitalSignArray().getVitalSignArray()) {
                            a = 0;

                            if ((vs.getLowCholesterol() <= 10) && (vs.getLowCholesterol() >= 5)) {
                                a = a + 1;

                            }
                            if ((vs.getHighCholesterol() <= 10) && (vs.getHighCholesterol() >= 5)) {
                                a = a + 1;

                            }

                            if ((vs.getBloodPressure() <= 100) && (vs.getBloodPressure() >= 50)) {
                                a = a + 1;

                            }

                            if ((vs.getDiabetes() <= 100) && (vs.getDiabetes() >= 50)) {
                                a = a + 1;

                            }

                            String s = (String.valueOf(vs.isSmoke()));
                            if (s.equalsIgnoreCase("false")) {
                                a = a + 1;

                            }

                            vs.getHealthReportArray().addRisk(a);
                            for (HealthReport hr : vs.getHealthReportArray().getHealthReportArray()) {
                                if ((hr.getHealthScore() < 3)) {
                                    infectedPerson++;
                                    if (p.getSex() == "Male") {
                                        infectedMale++;
                                    } else if (p.getSex() == "Female") {
                                        infectedFemale++;
                                    }
                                    if (p.getAge() > 1 && p.getAge() <= 24) {
                                        infectedChildren++;
                                    }
                                    if (p.getAge() > 25 && p.getAge() <= 60) {
                                        infectedParents++;
                                    }
                                    if (p.getAge() > 60) {
                                        infectedGrandParents++;
                                    }
                                }
                                if (hr.getHealthScore() == 3) {
                                    normalPerson++;
                                }
                                if (hr.getHealthScore() > 3) {
                                    healthPerson++;
                                }

                            }
                            totalPersonPerFamily++;
                        }

                    }

                    System.out.println("Community Name : " + c.getNameCommunity());
                    System.out.println("House Name : " + h.getNameHouse());
                    System.out.println("Family Name : " + f.getNameFamily());
//                    System.out.println("No of person in the family  : " + totalPersonPerFamily);
//                    System.out.println("No of person infected to heart problem : " + infectedPerson);
//                    System.out.println("No of person in normal health  : " + normalPerson);
//                    System.out.println("No of person with GOOD Health  : " + healthPerson);

                    System.out.println("Male Ratio of infected people :   " + infectedMale);
                    System.out.println("Female Ratio of infected people :   " + infectedFemale);
                    System.out.println("");

//                    System.out.println("No of Children affected  : " + infectedChildren);
//                    System.out.println("No of Parents affected  : " + infectedParents);
//                    System.out.println("No of GrandParents affected  : " + infectedGrandParents);

                }

                infectedPerson = 0;
                normalPerson = 0;
                healthPerson = 0;
                totalPersonPerFamily = 0;
                infectedMale = 0;
                infectedFemale = 0;
                infectedChildren = 0;
                infectedParents = 0;
                infectedGrandParents = 0;
            }
        }

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void calculateCityLevelPersonTypeRatio(CommunityArray ca) {

        int a, personSizeCity = 0, infectedPerson = 0, normalPerson = 0, healthPerson = 0, infectedMale = 0, infectedFemale = 0;
        int infectedChildren = 0, infectedParents = 0, infectedGrandParents = 0;
        for (Community c : ca.getCommunityArray()) {
            for (House h : c.getHouseArray().getHouseArray()) {
                for (Family f : h.getFamilyArray().getFamilyArray()) {
                    for (Person p : f.getPersonArray().getPersonArray()) {
                        personSizeCity++;

                        for (VitalSign vs : p.getVitalSignArray().getVitalSignArray()) {
                            a = 0;

                            if ((vs.getLowCholesterol() <= 10) && (vs.getLowCholesterol() >= 5)) {
                                a = a + 1;

                            }
                            if ((vs.getHighCholesterol() <= 10) && (vs.getHighCholesterol() >= 5)) {
                                a = a + 1;

                            }

                            if ((vs.getBloodPressure() <= 100) && (vs.getBloodPressure() >= 50)) {
                                a = a + 1;

                            }

                            if ((vs.getDiabetes() <= 100) && (vs.getDiabetes() >= 50)) {
                                a = a + 1;

                            }

                            String s = (String.valueOf(vs.isSmoke()));
                            if (s.equalsIgnoreCase("false")) {
                                a = a + 1;

                            }

                            vs.getHealthReportArray().addRisk(a);
                            for (HealthReport hr : vs.getHealthReportArray().getHealthReportArray()) {
                                if (hr.getHealthScore() < 3) {
                                    infectedPerson++;
                                    if (p.getSex() == "Male") {
                                        infectedMale++;
                                    } else if (p.getSex() == "Female") {
                                        infectedFemale++;
                                    }
                                    if (p.getAge() > 1 && p.getAge() <= 24) {
                                        infectedChildren++;
                                    }
                                    if (p.getAge() > 25 && p.getAge() <= 60) {
                                        infectedParents++;
                                    }
                                    if (p.getAge() > 60) {
                                        infectedGrandParents++;
                                    }
                                }
                                if (hr.getHealthScore() == 3) {
                                    normalPerson++;
                                }
                                if (hr.getHealthScore() > 3) {
                                    healthPerson++;
                                }

                            }

                        }

                    }
                }
            }
        }
        System.out.println("Name of the City : Boston");
        //      System.out.println("No of person in the city : " + personSizeCity);
//        System.out.println("No of person infected to heart problem : " + infectedPerson);
//        System.out.println("No of person in normal health  : " + normalPerson);
//        System.out.println("No of person with GOOD Health  : " + healthPerson);

//        System.out.print("Male : Female Ratio of infected people : " + infectedMale);
//        System.out.println(" : " + infectedFemale);

        System.out.println("No of Children affected  : " + infectedChildren);
        System.out.println("No of Parents affected  : " + infectedParents);
        System.out.println("No of GrandParents affected  : " + infectedGrandParents);
        System.out.println("");
    }

    public void calculateCommunityLevelPersonTypeRatio(CommunityArray ca) {

        int a, infectedPerson = 0, normalPerson = 0, healthPerson = 0, infectedMale = 0, infectedFemale = 0;
        int totalPersonPerCommunity = 0;
        int infectedChildren = 0, infectedParents = 0, infectedGrandParents = 0;
        for (Community c : ca.getCommunityArray()) {
            for (House h : c.getHouseArray().getHouseArray()) {
                for (Family f : h.getFamilyArray().getFamilyArray()) {
                    for (Person p : f.getPersonArray().getPersonArray()) {
                        for (VitalSign vs : p.getVitalSignArray().getVitalSignArray()) {
                            a = 0;

                            if ((vs.getLowCholesterol() <= 10) && (vs.getLowCholesterol() >= 5)) {
                                a = a + 1;

                            }
                            if ((vs.getHighCholesterol() <= 10) && (vs.getHighCholesterol() >= 5)) {
                                a = a + 1;

                            }

                            if ((vs.getBloodPressure() <= 100) && (vs.getBloodPressure() >= 50)) {
                                a = a + 1;

                            }

                            if ((vs.getDiabetes() <= 100) && (vs.getDiabetes() >= 50)) {
                                a = a + 1;

                            }

                            String s = (String.valueOf(vs.isSmoke()));
                            if (s.equalsIgnoreCase("false")) {
                                a = a + 1;

                            }

                            vs.getHealthReportArray().addRisk(a);
                            for (HealthReport hr : vs.getHealthReportArray().getHealthReportArray()) {
                                if ((hr.getHealthScore() < 3)) {
                                    infectedPerson++;
                                    if (p.getSex() == "Male") {
                                        infectedMale++;
                                    } else if (p.getSex() == "Female") {
                                        infectedFemale++;
                                    }
                                    if (p.getAge() > 1 && p.getAge() <= 24) {
                                        infectedChildren++;
                                    }
                                    if (p.getAge() > 25 && p.getAge() <= 60) {
                                        infectedParents++;
                                    }
                                    if (p.getAge() > 60) {
                                        infectedGrandParents++;
                                    }
                                }
                                if (hr.getHealthScore() == 3) {
                                    normalPerson++;
                                }
                                if (hr.getHealthScore() > 3) {
                                    healthPerson++;
                                }

                            }

                        }

                        totalPersonPerCommunity++;
                    }
                }
            }
            System.out.println("Community Name : " + c.getNameCommunity());
            //           System.out.println("No of person in the Community  : " + totalPersonPerCommunity);
//            System.out.println("No of person infected to heart problem : " + infectedPerson);
//            System.out.println("No of person in normal health  : " + normalPerson);
//            System.out.println("No of person with GOOD Health  : " + healthPerson);
//            System.out.print("Male : Female Ratio of infected people : " + infectedMale);
            System.out.println("No of Children affected  : " + infectedChildren);
            System.out.println("No of Parents affected  : " + infectedParents);
            System.out.println("No of GrandParents affected  : " + infectedGrandParents);
            System.out.println("");
//            System.out.println(" : " + infectedFemale);
            totalPersonPerCommunity = 0;
            infectedPerson = 0;
            infectedPerson = 0;
            normalPerson = 0;
            healthPerson = 0;
            infectedMale = 0;
            infectedFemale = 0;
            infectedChildren = 0;
            infectedParents = 0;
            infectedGrandParents = 0;
        }

    }

    public void calculateHouseLevelPersonTypeRatio(CommunityArray ca) {

        int a;
        int infectedPerson = 0;
        int infectedPerson1 = 0;
        int normalPerson = 0;
        int normalPerson1 = 0;
        int healthPerson = 0;
        int healthPerson1 = 0;
        int totalPersonPerCommunity = 0;
        int totalPersonPerHouse = 0;
        int infectedMale = 0;
        int infectedFemale = 0;
        int infectedChildren = 0, infectedParents = 0, infectedGrandParents = 0;
        for (Community c : ca.getCommunityArray()) {
            for (House h : c.getHouseArray().getHouseArray()) {
                for (Family f : h.getFamilyArray().getFamilyArray()) {
                    for (Person p : f.getPersonArray().getPersonArray()) {
                        for (VitalSign vs : p.getVitalSignArray().getVitalSignArray()) {
                            a = 0;

                            if ((vs.getLowCholesterol() <= 10) && (vs.getLowCholesterol() >= 5)) {
                                a = a + 1;

                            }
                            if ((vs.getHighCholesterol() <= 10) && (vs.getHighCholesterol() >= 5)) {
                                a = a + 1;

                            }

                            if ((vs.getBloodPressure() <= 100) && (vs.getBloodPressure() >= 50)) {
                                a = a + 1;

                            }

                            if ((vs.getDiabetes() <= 100) && (vs.getDiabetes() >= 50)) {
                                a = a + 1;

                            }

                            String s = (String.valueOf(vs.isSmoke()));
                            if (s.equalsIgnoreCase("false")) {
                                a = a + 1;

                            }

                            vs.getHealthReportArray().addRisk(a);
                            for (HealthReport hr : vs.getHealthReportArray().getHealthReportArray()) {
                                if ((hr.getHealthScore() < 3)) {
                                    infectedPerson1++;
                                    if (p.getSex() == "Male") {
                                        infectedMale++;
                                    } else if (p.getSex() == "Female") {
                                        infectedFemale++;
                                    }
                                    if (p.getAge() > 1 && p.getAge() <= 24) {
                                        infectedChildren++;
                                    }
                                    if (p.getAge() > 25 && p.getAge() <= 60) {
                                        infectedParents++;
                                    }
                                    if (p.getAge() > 60) {
                                        infectedGrandParents++;
                                    }
                                }
                                if (hr.getHealthScore() == 3) {
                                    normalPerson1++;
                                }
                                if (hr.getHealthScore() > 3) {
                                    healthPerson1++;
                                }

                            }
                            totalPersonPerHouse++;
                        }

                        // totalPersonPerCommunity++;
                    }

                }
                System.out.println("Community Name : " + c.getNameCommunity());
                System.out.println("House Name : " + h.getNameHouse());
//                System.out.println("No of person in the Community  : " + totalPersonPerCommunity);
//                System.out.println("No of person in the House  : " + totalPersonPerHouse);
//                System.out.println("No of person infected to heart problem : " + infectedPerson1);
//                System.out.println("No of person in normal health  : " + normalPerson1);
//                System.out.println("No of person with GOOD Health  : " + healthPerson1);
//                System.out.print("Male : Female Ratio of infected people : " + infectedMale);
                System.out.println("No of Children affected  : " + infectedChildren);
                System.out.println("No of Parents affected  : " + infectedParents);
                System.out.println("No of GrandParents affected  : " + infectedGrandParents);
                System.out.println("");
//                System.out.println(" : " + infectedFemale);
                infectedPerson1 = 0;
                infectedPerson = 0;
                normalPerson1 = 0;
                healthPerson1 = 0;
                totalPersonPerHouse = 0;
                infectedMale = 0;
                infectedFemale = 0;
                infectedChildren = 0;
                infectedParents = 0;
                infectedGrandParents = 0;
            }
            totalPersonPerCommunity = 0;
        }

    }

    public void calculateFamilyLevelPersonTypeRatio(CommunityArray ca) {

        int a;
        int infectedPerson = 0;
        int normalPerson = 0;
        int healthPerson = 0;
        int totalPersonPerFamily = 0;
        int infectedMale = 0;
        int infectedFemale = 0;
        int infectedChildren = 0, infectedParents = 0, infectedGrandParents = 0;
        for (Community c : ca.getCommunityArray()) {
            for (House h : c.getHouseArray().getHouseArray()) {
                for (Family f : h.getFamilyArray().getFamilyArray()) {
                    for (Person p : f.getPersonArray().getPersonArray()) {
                        for (VitalSign vs : p.getVitalSignArray().getVitalSignArray()) {
                            a = 0;

                            if ((vs.getLowCholesterol() <= 10) && (vs.getLowCholesterol() >= 5)) {
                                a = a + 1;

                            }
                            if ((vs.getHighCholesterol() <= 10) && (vs.getHighCholesterol() >= 5)) {
                                a = a + 1;

                            }

                            if ((vs.getBloodPressure() <= 100) && (vs.getBloodPressure() >= 50)) {
                                a = a + 1;

                            }

                            if ((vs.getDiabetes() <= 100) && (vs.getDiabetes() >= 50)) {
                                a = a + 1;

                            }

                            String s = (String.valueOf(vs.isSmoke()));
                            if (s.equalsIgnoreCase("false")) {
                                a = a + 1;

                            }

                            vs.getHealthReportArray().addRisk(a);
                            for (HealthReport hr : vs.getHealthReportArray().getHealthReportArray()) {
                                if ((hr.getHealthScore() < 3)) {
                                    infectedPerson++;
                                    if (p.getSex() == "Male") {
                                        infectedMale++;
                                    } else if (p.getSex() == "Female") {
                                        infectedFemale++;
                                    }
                                    if (p.getAge() > 1 && p.getAge() <= 24) {
                                        infectedChildren++;
                                    }
                                    if (p.getAge() > 25 && p.getAge() <= 60) {
                                        infectedParents++;
                                    }
                                    if (p.getAge() > 60) {
                                        infectedGrandParents++;
                                    }
                                }
                                if (hr.getHealthScore() == 3) {
                                    normalPerson++;
                                }
                                if (hr.getHealthScore() > 3) {
                                    healthPerson++;
                                }

                            }
                            totalPersonPerFamily++;
                        }

                    }

                    System.out.println("Community Name : " + c.getNameCommunity());
                    System.out.println("House Name : " + h.getNameHouse());
                    System.out.println("Family Name : " + f.getNameFamily());
//                    System.out.println("No of person in the family  : " + totalPersonPerFamily);
//                    System.out.println("No of person infected to heart problem : " + infectedPerson);
//                    System.out.println("No of person in normal health  : " + normalPerson);
//                    System.out.println("No of person with GOOD Health  : " + healthPerson);
//
//                    System.out.print("Male : Female Ratio of infected people : " + infectedMale);
//                    System.out.println(" : " + infectedFemale);

                    System.out.println("No of Children affected  : " + infectedChildren);
                    System.out.println("No of Parents affected  : " + infectedParents);
                    System.out.println("No of GrandParents affected  : " + infectedGrandParents);
                    System.out.println("");

                }

                infectedPerson = 0;
                normalPerson = 0;
                healthPerson = 0;
                totalPersonPerFamily = 0;
                infectedMale = 0;
                infectedFemale = 0;
                infectedChildren = 0;
                infectedParents = 0;
                infectedGrandParents = 0;
            }
        }

    }
    
    
    
    
    
    

}











