
/**
 * Beschreiben Sie hier die Klasse Boden.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Boden extends Figur
{
    Boden(int x, int y){
    super();
    this.PositionSetzen(x, y);
    this.Boden_zeichnen();
    this.GrößeSetzen(250);
    }
    void Boden_zeichnen(){
    this.FigurteilFestlegenRechteck(-50, -50, 100, 100, "Grün");
    this.FigurteilFestlegenDreieck(-20, 10, -30, 30, -10, 30, "braun");
    this.FigurteilFestlegenEllipse(-10, 30, 10, 10, "cyan");
    this.FigurteilFestlegenRechteck(40,20,10,10,"grau");
    this.FigurteilFestlegenRechteck(10,20,10,10,"grau");
    this.FigurteilFestlegenRechteck(50,30,10,10,"grau");
    }
    @Override void AktionAusführen(){
    this.GanzNachHintenBringen();
    
    }
}
