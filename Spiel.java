import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Rahmen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spiel extends Ereignisbehandlung 
{

    
    Random zufall;
    
        Spiel(){
        
        zufall = new Random();
        for(int i=1; i <=20; i=i+1){
                new Ballon(zufall.nextInt(800), zufall.nextInt(500));
        }
    
        new AffeBloons(100,200);
        new Pfeilgeschoss(-25,100);
        new Pfeilgeschoss(-25,200);
        new Pfeilgeschoss(-25,300);
        new Gewehr(-25,100);
        new Gewehr(-25,200);
        new Gewehr(-25,300);
        new Himmel(10,20);
        new Boden(100, 300);
        new Boden(350,300);
        new Boden(600,300);
        new Boden(850,300);
        new Boden(100,50);
        new Boden(350,50);
        new Boden(600,50);
        new Boden(850,50);
        new Boden(100,550);
        new Boden(350,550);
        new Boden(600,550);
        new Boden(850,550);
        Starten();
    }
    
    }
    
   
