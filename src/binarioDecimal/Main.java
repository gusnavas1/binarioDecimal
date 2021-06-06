package binarioDecimal;
import java.util.Scanner;
class Main {  
  public static void main(String args[]) { 
    String frase, entero, codigo=""; 
    int sumar=0, aux, digito, digito1, exponente, exp;
    double binario;
    long decimal;
    Scanner teclado= new Scanner(System.in);
    System.out.println("Bienvenido ");
    System.out.println("De la Siguiente Lista");
    System.out.println("Futbol (F), Basquet(B), Tenis (T), Ping pong(P), Natacion(N), Senderismo(S), Montañismos (M) , WaterPolo(W)");
    System.out.println("Ingrese el codigo para el deporte seleccioando, por ejemplo: TBN");
    System.out.println("Ingrese los codigos: ");
    frase=teclado.nextLine();
    String []vector = frase.split("",frase.length());
    for (String item: vector){
     // System.out.println(item);
       if (item.equals("F")){
      item="1";
    }else if(item.equals("B")){
      item="2";
    }else if(item.equals("T")){
      item="4";
     }else if(item.equals("P")){
      item="8";
     }else if(item.equals("N")){
     item="16";
      }     
     codigo=codigo+item;
      sumar=sumar+Integer.parseInt(item);
    }
      System.out.println("codigo "+codigo);
      System.out.println("suma "+sumar);
     


aux=sumar;
        
         //System.out.println("AUX:" +aux);  
         //BINARIO
        exp=0;
        binario=0;
        while(aux!=0){
                digito = aux % 2;           
                binario = binario + digito * Math.pow(10, exp);                                                   
                exp++;
                aux = aux/2;
        }
        System.out.printf("Binario: %.0f %n", binario);


    int binario1 = (int)binario; 
        //DECIMAL
        exponente = 0;
        decimal = 0; 
      while (binario1 != 0) {
                digito1 = binario1 % 10;                      
                decimal = decimal + digito1 * (int) Math.pow(2, exponente);
                exponente++;
                binario1 = binario1 / 10;
      }
      System.out.println("Decimal: " + decimal);
    
  } 
}