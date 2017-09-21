/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framingham;

import java.util.Random;

/**
 *
 * @author Malick
 */
public class Initialization1 {

    public static City Initialization1() {
        City city = new City();
        city.setNameCity("Boston");

        for (int i = 1; i <= 10; i++) {
            Community community = city.getCommunityArray().addCommunity();
            community.setNameCommunity(randCommunityName());

            for (int j = 1; j <= 50; j++) {
                House house = community.getHouseArray().addHouse();
                house.setNameHouse(randHouseName());

                for (int k = 1; k <= 2; k++) {

                    Family family = house.getFamilyArray().addFamily();
                    family.setNameFamily(randFamilyName());
                    for (int l = 1; l <= 4; l++) {
                        Person person = family.getPersonArray().addPerson();
                        VitalSignData(person);

                    }
                }
            }
        }
        return city;
    }

    public static void VitalSignData(Person person) {
        person.setNamePerson(randPersonName());

        person.setAge(randInt(5, 85));

        //person.setAge(randInt(0, 90));

        person.setSex(randomGender());

        for (int i = 1; i <= 1; i++) {

            VitalSign vitalSign = person.getVitalSignArray().addVitals();
            vitalSign.setLowCholesterol(randInt(0, 10));
            vitalSign.setHighCholesterol(randInt(0, 10));
            vitalSign.setBloodPressure(randInt(0, 100));
            vitalSign.setDiabetes(randInt(0, 100));
            vitalSign.setSmoke(randBoolean());

        }
    }

// Random Generation code begins here
    public static int randInt(int min, int max) {
        Random r = new Random();
        int randNum = r.nextInt((max - min) + 1) + min;
        return randNum;
    }

    public static boolean randBoolean() {
        Random r = new Random();
        return r.nextBoolean();

    }

    public static String randPersonName() {
        String personName[] = {"Ada", "Albert", "Alexandra", "Alfredo", "Allen", "Andre", "Angelica",
            "Anna", "Anthony", "Antonio", "Ashley", "Audrey", "Beatrice",
            "Benjamin", "Billy", "Bobby", "Bradley", "Bryant", "Candace",
            "Carole", "Carrie", "Claire", "Clifford", "Clint", "Clyde", "Cory",
            "Dale", "Danielle", "Daryl", "Delia", "Devin", "Douglas", "Eddie",
            "Ella", "Erica", "Erika", "Eva", "Frank", "Gayle", "George", "Georgia",
            "Geraldine", "Gina", "Gwen", "Hector", "Homer", "Irene", "James",
            "Jamie", "Jeremiah", "Joann", "Josefina", "Juan", "Karen", "Kenneth",
            "Laurie", "Lee", "Leland", "Leroy", "Levi", "Lewis", "Lillian",
            "Lillie", "Lorenzo", "Louise", "Lucas", "Lynn", "Marc", "Marcella",
            "Marlon", "Marvin", "Micheal", "Miranda", "Miriam", "Misty", "Naomi",
            "Natasha", "Nelson", "Oliver", "Pete", "Rafael", "Randall", "Raul",
            "Rebecca", "Reginald", "Roger", "Ruby", "Rufus", "Sabrina", "Sean",
            "Steven", "Stuart", "Terence", "Terry", "Van", "Velma", "Vincent",
            "Wanda", "Willard", "Winifred"};

        Random r = new Random();
        String name = personName[r.nextInt(personName.length)];
        return name;

    }

    public static String randCommunityName() {
        String communityName[] = {"Community1", "Community2", "Community3",
            "Community4", "Community5", "Community6", "Community7", "Community8", "Community9",
            "Community10", "Community11"};

        Random r = new Random();
        String name = communityName[r.nextInt(communityName.length)];
        return name;

    }

    public static String randHouseName() {
        String houseName[] = {"House1", "House2", "House3",
            "House4", "House5", "House6", "House7", "House8", "House9",
            "House10", "House11", "House12", "House13",
            "House14", "House15", "House16", "House17", "House18", "House19",
            "House20", "House21"};

        Random r = new Random();
        String name = houseName[r.nextInt(houseName.length)];
        return name;

    }

    public static String randFamilyName() {
        String familyName[] = {"Family1", "Family2", "Family3",
            "Family4", "Family5", "Family6", "Family7", "Family8", "Family9",
            "Family10", "Family11", "Family12", "Family13",
            "Family14", "Family15", "Family16", "Family17", "Family18", "Family19",
            "Family20", "Family21", "Family22", "Family23",
            "Family24", "Family25", "Family26", "Family27", "Family28", "Family29",
            "Family30", "Family31", "Family32", "Family33",
            "Family34", "Family35", "Family36", "Family37", "Family38", "Family39",
            "Family40", "Family41"};

        Random r = new Random();
        String name = familyName[r.nextInt(familyName.length)];
        return name;

    }

    public static String randomGender() {
        String gender[] = {"Male", "Female"};

        Random r = new Random();
        String g = gender[r.nextInt(gender.length)];
        return g;

    }
}
