import static javax.swing.JOptionPane.*;


public class ovinger1 {

public static void main(String[] args) {
    
    String tommerLeng = showInputDialog("Hvor mange tommer?");
    Integer tommer = Integer.parseInt(tommerLeng);
    
    System.out.println(tommer);
    
    if (tommer%100 != 0 && tommer%4 == 0 || tommer%400 == 0){
        showMessageDialog(null, "JA");
    }
   
else{
            showMessageDialog(null, "NEI");
}

}
    
}