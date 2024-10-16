package src.Pokemon;
import src.Move.*;

import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Natu extends Pokemon {

        double hp = 40;
        double att = 50;
        double def = 45;
        double spAtt = 70;
        double spDef = 45;
        double speed = 70;
        Type type0 = Type.PSYCHIC;
        Type type1 = Type.FLYING;

        public Natu(String name, int level) {
            super(name, level);
            setStats(hp, att, def, spAtt, spDef, speed);
            setType(type0, type1);
            addMove(new AerialAce(Type.FLYING, 60, 1));
            addMove(new DazzlingGleam(Type.FAIRY, 80, 1));
            addMove(new Swagger(Type.NORMAL, 0, 0.85));
        }
    }