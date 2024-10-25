package src.pokemons;
import src.moves.*;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tynamo extends Pokemon {

    double hp = 35;
    double att = 55;
    double def = 40;
    double spAtt = 45;
    double spDef = 40;
    double speed = 60;
    Type type0 = Type.ELECTRIC;

    public Tynamo(String name, int level) {
        super(name, level);
        setStats(hp, att, def, spAtt, spDef, speed);
        setType(type0);
        addMove(new ThunderWave(Type.ELECTRIC, 0, 0.9));
        addMove(new ChargeBeam(Type.ELECTRIC, 50, 0.9));
    }
}