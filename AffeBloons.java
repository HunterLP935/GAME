
/**
 * Beschreiben Sie hier die Klasse AffeBloons.
 * 
 * @author (Tim Anacker; Justus Hackner) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class AffeBloons extends Figur
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    AffeBloons(int x, int y){
        super();
        PositionSetzen(x, y);
        this.AffeBloonsZeichnen();
    
    }
    void AffeBloonsZeichnen(){
        this.FigurteilFestlegenEllipse(-50, -50, 100, 100, "Orange");
        this.FigurteilFestlegenRechteck(-25, -25, 50, 50, "Grün");
        this.FigurteilFestlegenDreieck(0, 30, 30, 0, 0, -30, "rot");
    }
    
    @Override void SonderTasteGedrückt(int taste ){
    
        switch (taste)
         {      
         case 37:
             this.Drehen(90);
             break;
         case 38:
             this.AffeBloonsZeichnen();
             this.Gehen(10);
             break;
         case 39:
             this.Drehen(270); 
             break;
         case 40:
             this.Drehen(30);
             break;
        } 
    
    }
    
    void Aussehen_verändern(){
        this.FigurteilFestlegenEllipse(-50, -50, 100, 100, "Orange");
        this.FigurteilFestlegenRechteck(-25, -25, 50, 50, "Grün");
        this.FigurteilFestlegenDreieck(0, 30, 30, 0, 0, -30, "rot");
        this.FigurteilFestlegenDreieck(0, 0, -30, -30, -30, 30, "Braun");
    }
   
    @Override void TasteGedrückt(char taste ){
    
        switch (taste)
         {      
         case 'a':
             this.Drehen(90);
             break;
         case 'w':
             this.Aussehen_verändern();
             this.Gehen(40);
             break;
         case 'd':
             this.Drehen(270); 
             break;
         case 's':
             this.Drehen(30);
             break;
        } 
    
    }
    
    
    
    void Game_Over(){
        if(Berührt("schwarz")){
    
            this.Entfernen();
            new Game_Over_Emoji(200,200);
        }
        else{}
        }
    
    @Override void AktionAusführen(){
        this.Game_Over();
    }
}