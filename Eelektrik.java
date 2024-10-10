import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Eelektrik extends Tynamo {

    double hp = 68;
    double att = 85;
    double def = 70;
    double spAtt = 75;
    double spDef = 70;
    double speed = 40;

    public Eelektrik(String name, int level) {
        super(name, level);
        setStats(hp, att, def, spAtt, spDef, speed);
        addMove(new Spark(Type.ELECTRIC, 65, 100));
    }
}