import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import java.util.Random;

public class Bouffalant extends Pokemon {

    double hp = 95;
    double att = 110;
    double def = 95;
    double spAtt = 40;
    double spDef = 95;
    double speed = 55;
    Type type = Type.NORMAL;

    public Bouffalant(String name, int level) {
        super(name, level);
        Random random = new Random();
        setStats(hp, att, def, spAtt, spDef, speed);
        setType(Type.NORMAL);
        addMove(new FuryAttack(Type.NORMAL, 15, 0.85, 0, random.nextInt(2, 5)));
        addMove(new IronHead(Type.STEEL, 80, 1));
        addMove(new FocusEnergy(type, 0, 1));
        addMove(new AerialAce(Type.FLYING, 60, 1));

    }
}