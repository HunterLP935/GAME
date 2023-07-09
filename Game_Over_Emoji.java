
/**
 * Beschreiben Sie hier die Klasse Game_Over_Emoji.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Game_Over_Emoji extends Figur
{
    Game_Over_Emoji(int x, int y){
    super();
        PositionSetzen(x, y);
        this.Game_Over_Emoji_Zeichnen();
    
    }
    
    void Game_Over_Emoji_Zeichnen(){
    this.FigurteilFestlegenEllipse(-50, -50, 100, 100, "Gelb");
    this.FigurteilFestlegenEllipse(30, -30, 20, 20, "Rot");
    this.FigurteilFestlegenEllipse(-10, -30, 20, 20, "Rot");
    this.FigurteilFestlegenRechteck(20, 20, 50, 10, "Schwarz");
    }
    
}
