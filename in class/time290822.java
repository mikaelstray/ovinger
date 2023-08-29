import static javax.swing.JOptionPane.*;

import javax.swing.JOptionPane;

public class time290822 {
    
public static void main(String[] args) {

    
    String num1 = showInputDialog("Tall 1?");
    String num2 = showInputDialog("Tall 2?");

    int numm1 = Integer.parseInt(num1); 
    int numm2 = Integer.parseInt(num2);

    int max = (numm2 > numm1) ? numm2:numm1;
    System.out.println(max);
    

String[] options = {"Pluss","Minus","Avbryt"};
int valg = JOptionPane.showOptionDialog(null,numm1+ " + / - " +numm2+ "?",
"Kalkulator",YES_NO_CANCEL_OPTION,DEFAULT_OPTION,null,options,options[0]);  

    int svar = 0;

    if(valg == 0){
        svar=numm1+numm2;
        showMessageDialog(null, "Svaret er: " +svar);
    } else{
    if(valg==1){svar=numm1-numm2;
        showMessageDialog(null, "Svaret er: " +svar);}
    else{}
    }

}
}
