public class Main2 {
    public static void main(String[] args) {

        String2Class teksten = new String2Class("Heiø. det! dette iiier, iifem. oiird");
        System.out.println(teksten.finneOrd());
        System.out.println(teksten.lengdeOrd());
        System.out.println(teksten.bytteOrd("Heiii","hei"));
        System.out.println(teksten.getTeksten());
        System.out.println(teksten.toUpper());
        teksten.periode();
        teksten.periode2();
    }
}