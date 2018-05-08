
package notendurchschnitt;
import java.util.Scanner;

public class Notendurchschnitt {
     public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        
        int note = 0;
        int anzahlnoten = 1;        
        int summe = 0;
        double durchschnitt = 0;
        
        do{
            System.out.println("Bitte gib deine Noten ein und beende die Eingabe mit 0:");
            note = eingabe.nextInt();
                if (note>6){
                    System.out.println("Bitte überprüfe deine Eingabe."); 
                }
                else {    
                    anzahlnoten++;
                    summe= summe+note;}
            } while (note!=0);
        
        durchschnitt = (double) summe/(anzahlnoten-2);
         System.out.println("Dein Notendurchschnitt beträgt: " + durchschnitt);
    }
}
