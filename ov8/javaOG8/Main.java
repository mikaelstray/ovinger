import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Exception {

        Person person1 = new Person("Mikael Stray","Froyshov",2003);
        ArbTaker arbTaker = new ArbTaker(person1,12345,2010,50000,20);


        Scanner myObj = new Scanner(System.in);
        System.out.println("Hva vil gjore?\n 1: Endre arbeidstakernummer. \n 2: Endre dato \n 3: Endre lonn \n 4: Endre skatteprosent \n 5: Sjekke skattetrett \n 6: Sjekke bruttolonn \n 7: Sjekke alt \n 0: Avslutt");
        int valg = myObj.nextInt();
        while (valg != 0){
            switch (valg){
                case 1:
                    System.out.println("Hva er det nye nummeret? 5 siffere");
                    int nyttAnNr = myObj.nextInt();
                    arbTaker.setArbTakernr(nyttAnNr);
                    break;
                case 2:
                    System.out.println("Hva er nye datoen? 4 siffere");
                    int nyAnDato = myObj.nextInt();
                    arbTaker.setAnsettelsesår(nyAnDato);
                    break;
                case 3:
                    System.out.println("Hva er nye lonnen?");
                    double nyLonn = myObj.nextInt();
                    arbTaker.setMånedslønn(nyLonn);
                    break;
                case 4:
                    System.out.println("Hva er nye skatteprosenten?");
                    double nySkatteProsent = myObj.nextInt();
                    arbTaker.setSkatteprosent(nySkatteProsent);
                    break;
                case 5:
                    System.out.println("Hvilken maned? Skriv");
                    int manedNr = 1;
                    for (int i = 0; i < 12; i++) {
                        System.out.println(manedNr + " for: "+ Month.of(manedNr).name());
                        manedNr++;
                    }
                    int manedInputNr = myObj.nextInt();
                    arbTaker.setManed(manedInputNr);
                    System.out.println(arbTaker.skatteTrekk());
                    break;
                case 6:
                    System.out.println(arbTaker.bruttoLonn());
                    break;
                case 7:
                    System.out.println(arbTaker.toString());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ugyldig");
                    break;
            }
            if (valg > 0 && valg < 5) {
                System.out.println(arbTaker.toString());
            }
            System.out.println("Hva vil gjore?\n 1: Endre arbeidstakernummer. \n 2: Endre dato \n 3: Endre lonn \n 4: Endre skatteprosent \n 5: Sjekke skattetrett \n 6: Sjekke bruttolonn \n 7: Sjekke alt \n 0: Avslutt");
            valg = myObj.nextInt();
        }
        System.out.println("Avsluttet");

        System.out.println("\n\nHer kommer metodene:\n");
        System.out.println(arbTaker.skatteTrekk());
        System.out.println(arbTaker.bruttoLonn());
        System.out.println(arbTaker.arligSkattetrekk());
        System.out.println(arbTaker.ansattMer(10));
        System.out.println(arbTaker.arIBedriften());
    }
}