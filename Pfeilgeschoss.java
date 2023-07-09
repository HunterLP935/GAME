
/**
 * Beschreiben Sie hier die Klasse Pfeilgeschoss.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Pfeilgeschoss extends Figur
{
    void Pfeilgeschosszeichnen(){
        this.FigurteilFestlegenRechteck(10, -10, 20, 10, "Schwarz");
    
    }
    Pfeilgeschoss(int x, int y){
        super();
        PositionSetzen(x, y);
        this.Pfeilgeschosszeichnen();
    
    }
    
    void Schießen(){
    this.Pfeilgeschosszeichnen();
    this.Gehen(10);
    
    }
    
    @Override void AktionAusführen(){
        this.Schießen();
    }
    
    @Override void TasteGedrückt(char taste ){
    
        switch (taste)
         {      
         case 'q':
             new Pfeilgeschoss(0,200);
             break;
         case 'e':
             new Pfeilgeschoss (0,100);
             break;
         case 'x':
             new Pfeilgeschoss(0,300);
             break;
        } 
        
    
    }
}
