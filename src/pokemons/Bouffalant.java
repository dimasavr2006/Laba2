package src.pokemons;
import src.moves.*;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import java.util.Random;

public final class Bouffalant extends Pokemon {

    protected double hp = 95;
    protected double att = 110;
    protected double def = 95;
    protected double spAtt = 40;
    protected double spDef = 95;
    protected double speed = 55;
    Type type = Type.NORMAL;

    public Bouffalant(String name, int level) {
        super(name, level);
        Random random = new Random();
        setStats(hp, att, def, spAtt, spDef, speed);
        setType(type);
        addMove(new FuryAttack(Type.NORMAL, 15, 0.85, 0, random.nextInt(2, 5)));
        addMove(new IronHead(Type.STEEL, 80, 1));
        addMove(new FocusEnergy(Type.NORMAL, 0, 1));
        addMove(new AerialAce(Type.FLYING, 60, 1));

    }
}