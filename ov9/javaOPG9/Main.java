public class Main {
     public static void main(String[] args) {

        OppgaveOversikt oversikt1 = new OppgaveOversikt();
        Student studd1 = new Student("Mike",5);
        Student studd2 = new Student("Mike",5);

        boolean stud1 = oversikt1.registrerNyStud("Mikael", 5);
        boolean stud2 = oversikt1.registrerNyStud("Jacob", 3);
        boolean stud3 = oversikt1.registrerNyStud("Erik", 4);
        boolean stud4 = oversikt1.registrerNyStud("Fail",1);

         System.out.println("Number of tests: 4:\n\n");

        if (stud1 && stud2 && stud3&&stud4){
            System.out.println("Test 1 passed");
        }

        if (oversikt1.antallStudenter() == 4){
            System.out.println("Test 2 passed");
        }
        if (oversikt1.bestemtOpgantall("Jacob") == 3){
            System.out.println("Test 3 passed");
        }
        oversikt1.okOpg(1,3);
        if (oversikt1.bestemtOpgantall("Jacob ") == 6){
            System.out.println("Test 4 passed");
        }
         System.out.println("\n"+studd1.equals(studd2));


         System.out.println(oversikt1.toString());
    }
}