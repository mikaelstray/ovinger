public class Main {
    public static void main(String[] args) {


    StringClass teksten1 = new StringClass("hei jeg heter mikael");
    System.out.println(teksten1.getTeksten());
    System.out.println(teksten1.forsteChar());
    teksten1.fjerneChar("e");
    }
}