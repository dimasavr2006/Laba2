package src.pokemons;
import src.moves.*;

import ru.ifmo.se.pokemon.Type;
public class Eelektross extends Eelektrik {

    double hp = 85;
    double att = 115;
    double def = 80;
    double spAtt =  105;
    double spDef = 80;
    double speed = 50;

    public Eelektross(String name, int level) {
        super(name, level);
        setStats(hp, att, def, spAtt, spDef, speed);
        addMove(new Discharge(Type.ELECTRIC, 80, 1));
    }
}