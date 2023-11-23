package org.example;

import java.util.Scanner;

public class Brukergrensesnitt {
    /**
* Presents the menu for the user, and awaits input from the user. The menu
* choice selected by the user is being returned.
*
* @return the menu choice by the user as a positive number starting from 1.
* If 0 is returned, the user has entered a wrong value
*/

    private final int ADD_PROPERTY = 1;
    private final int REMOVE_PROPERTY = 2;
    private final int LIST_ALL_PROPERTIES = 3;
    private final int FIND_PROPERTY_BY_ID = 4;

    private final int FIND_PROPERTY_BY_GNR = 5;
    private final int CALCULATE_AVERAGE_AREA = 6;
    private final int EXIT = 7;
    private static void showMenu() {
        System.out.println("\n***** Property Register Application v0.1 *****\n");
        System.out.println("1. Add property");
        System.out.println("2. Remove property");
        System.out.println("3. List all properties");
        System.out.println("4. Search property by ID");
        System.out.println("5. Search property by GNR");
        System.out.println("6. Calculate average area");
        System.out.println("7. Quit");
        System.out.println("\nPlease enter a number between 1 and 7.\n");
    }
    private int brukerValg(){
        Scanner sc = new Scanner(System.in);
        int menuChoice = 0;
        if (sc.hasNextInt()) {
            menuChoice = sc.nextInt();
        } else {
            System.out.println("You must enter a number, not text");
        }
        return menuChoice;
    }
    private static Eiendom skriveInnEiendomInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kommunenavn");
        String kommunenavn = scanner.nextLine();

        scanner = new Scanner(System.in);
        System.out.println("kommunenummer");
        String kommunenummer = scanner.nextLine();

        scanner = new Scanner(System.in);
        System.out.println("GNR");
        String gnr = scanner.nextLine();

        scanner = new Scanner(System.in);
        System.out.println("BNR");
        String bnr = scanner.nextLine();

        scanner = new Scanner(System.in);
        System.out.println("Navn, 0 hvis ingen navn");
        String navn = scanner.nextLine();
        if (Integer.valueOf(navn) == 0){
            navn = null;
        }

        scanner = new Scanner(System.in);
        System.out.println("Areal");
        String areal = scanner.nextLine();

        scanner = new Scanner(System.in);
        System.out.println("Eiernavn");
        String eierNavn = scanner.nextLine();

        return new Eiendom(kommunenavn,Integer.valueOf(kommunenummer),Integer.valueOf(gnr),Integer.valueOf(bnr),navn,Double.valueOf(areal),eierNavn);
    }
/**
* Starts the application. This is the main loop of the application,
* presenting the menu, retrieving the selected menu choice from the user,
* and executing the selected functionality.
*/
    public void start() {
        EiendomRegister reg1 = new EiendomRegister();
        boolean finished = false;
// The while-loop will run as long as the user has not selected
// to quit the application
        while (!finished) {
        this.showMenu();
        int menuChoice = this.brukerValg();
        switch (menuChoice){
            case ADD_PROPERTY:
                Eiendom eiendom = skriveInnEiendomInfo();
                reg1.registrereEiendom(eiendom);
                System.out.println(eiendom + " ble lagt til");
                break;
            case REMOVE_PROPERTY:
                System.out.println("ID? Pa formen: kommunenummer-gnr/bnr ");
                String id1 = new Scanner(System.in).nextLine();
                Eiendom eiendommen = reg1.finnEiendommerBasertPaID(id1);
                reg1.sletteEiendom(id1);
                System.out.println(eiendommen + " Ble fjerna");
                break;
            case LIST_ALL_PROPERTIES:
                System.out.println(reg1.toString());
                break;
            case FIND_PROPERTY_BY_ID:
                System.out.println("ID? Pa formen: kommunenummer-gnr/bnr");
                String id2 = new Scanner(System.in).nextLine();
                System.out.println(reg1.finnEiendommerBasertPaID(id2));
                break;
            case FIND_PROPERTY_BY_GNR:
                System.out.println("GNR?");
                String gnr = new Scanner(System.in).nextLine();
                System.out.println(reg1.eiendommerMedGnr(Integer.valueOf(gnr)));
                break;
            case CALCULATE_AVERAGE_AREA:
                System.out.println(reg1.finneGjennomsnittsAreal());
                break;
            case EXIT:
                System.out.println("Thank you for using the Properties app!\n");
                finished = true;
                break;
            default:
                System.out.println("Unrecognized menu selected..");
                break;
            }
        }
    }
    // Constants representing the different menu choices

}
