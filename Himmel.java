
/**
 * Beschreiben Sie hier die Klasse Hintergrund.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Himmel extends Figur
{
    Himmel(int x, int y){
    super();
    this.PositionSetzen(x, y);
    this.Himmel_zeichnen();
    }
    void Himmel_zeichnen(){
    this.FigurteilFestlegenRechteck(-50, -30, 1000, 30, "Weiß");
    this.GrößeSetzen(1000);
    
    }
    
}
