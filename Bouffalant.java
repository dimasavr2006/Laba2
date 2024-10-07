import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;

public class Bouffalant{
    public Pokemon Bouffalant = new Pokemon("Bouffalant", 10);

    double hp = 95;
    double att = 110;
    double def = 95;
    double spAtt = 40;
    double spDef = 95;
    double speed = 55;

    public final void setStats(double hp,
                               double att,
                               double def,
                               double spAtt,
                               double spDef,
                               double speed){
        setStats(hp,att,def,spAtt,spDef,speed);
    }

    protected final void setMove(Move move){
        
    }
}