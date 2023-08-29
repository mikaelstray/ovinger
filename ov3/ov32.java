import static javax.swing.JOptionPane.*;

import java.util.Scanner;

public class ov32 {
    
public static void main(String[] args) {

    String start = showInputDialog("Hvor mange tall?");
    int start1 = Integer.parseInt(start);

    
    for(int t=0;t<start1;t++){

    Scanner in = new Scanner(System.in);
    System.out.println("Tall: ");
    int tallBruker1 = in.nextInt();
    

    boolean sjekk = false;

    for(int i=2;i<tallBruker1-1;i++){
if(tallBruker1 % i == 0){
    sjekk = true;
    break;
}
    }

    if(sjekk == true){
System.out.println(tallBruker1 + " er ikke et primtall \n");    }
    else{
                showMessageDialog(null,"Primtall \n");

    }  
}
}

}

/*Skriv et program som finner ut om et tall er et primtall. Et primtall er et tall som kun kan deles 
med 1 og med seg selv uten å få rest. Les inn tallet fra brukeren og la programmet repetere 
slik at flere tall kan analyseres */