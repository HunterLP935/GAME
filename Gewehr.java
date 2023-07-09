
/**
 * Beschreiben Sie hier die Klasse Gewehr.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Gewehr extends Figur
{
    void Gewehrzeichnen(){
        this.FigurteilFestlegenRechteck(50, -10, 100, 20, "Schwarz");
    
    }
    Gewehr(int x, int y){
        super();
        PositionSetzen(x, y);
        this.Gewehrzeichnen();
    
    }
}
