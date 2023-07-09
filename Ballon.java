import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Luftballon.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Ballon extends Figur
{
    Random zufall;
        Ballon(int x, int y){
        super();
        PositionSetzen(x, y);
        this.Ballonzeichnen();
        
        zufall = new Random();
    }
    
    void Ballonzeichnen(){
        this.FigurteilFestlegenEllipse(-50, -50, 100, 50, "Blau");
        this.Drehen(90);
    }
    void Ballonsteigen(){
        this.Gehen(10);
    }
    
    
    
        
    void Ballongeplatzt(){
        if(Berührt("Orange")){
            this.PositionSetzen(zufall.nextInt(800),520);
    
    
        }
        else{}
    
    }
    void Ballongeschossen(){
    if (Berührt("Schwarz")){
        this.PositionSetzen(zufall.nextInt(800),520);
    }
    else{}
    
    }
    void entetycramming(){
    if(Berührt("blau")){
    this.PositionSetzen(zufall.nextInt(800), 520);
    }
    }
     void Himmelgeplatzt(){
    if (Berührt("Weiß")){
        this.PositionSetzen(zufall.nextInt(800),520);
    }
    else{}
    
    }
    @Override void AktionAusführen(){
    this.Ballonsteigen();
    this.Ballongeplatzt();
    this.Ballongeschossen();
    this.Himmelgeplatzt();
    this.entetycramming();
    }
    
}
       