import java.util.Arrays;

public class billigst {

public static void main(String[] args) {
   
    Double pris1 = 35.90;
    Double pris2 = 39.50;

    Double vekt1 = 450.00;
    Double vekt2 = 500.00;

    Double forhold1 = pris1/vekt1;
    Double forhold2 = pris2/vekt2;


System.out.println(forhold1);
System.out.println(forhold2);

if(forhold1==forhold2){System.out.println("Like");}
else if(forhold1 < forhold2){
    System.out.println("1 er billigere");
} else{
    System.out.println("2 er billigere");
}

}

}
