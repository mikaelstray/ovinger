import static javax.swing.JOptionPane.*;


public class ov31 {
    public static void main(String[] args) {
        
    String start = showInputDialog("Hvilket tall? Skriv tall1");
    int start1 = Integer.parseInt(start);
    String end = showInputDialog("Hvilket tall? Skriv tall2");
    int end1 = Integer.parseInt(end);
   

String antall = showInputDialog("Hvor mange?");
    int antall1 = Integer.parseInt(antall);

  for(int i=start1; i<end1+1; i++){
ganging(i,antall1);  }

    }

    public static void ganging(int n, int b){

         

                   System.out.println(n + " gangern:");
                   for(int i=0;i<b;i++){
                    System.out.println(n+ "x" + i + "=" +(n*i));
                   }
    }


    
}
