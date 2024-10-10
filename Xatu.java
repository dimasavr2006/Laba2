import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Xatu extends Natu{

    double hp = 65;
    double att = 75;
    double def = 70;
    double spAtt = 95;
    double spDef = 70;
    double speed = 95;

    public Xatu(String name, int level){
        super(name, level);
        setStats(hp, att, def, spAtt, spDef, speed);
        addMove(new AirSlash(Type.FLYING, 0, 0.95));
    }
}