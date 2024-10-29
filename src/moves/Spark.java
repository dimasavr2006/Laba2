package src.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import java.lang.Math;

public class Spark extends PhysicalMove {
    public Spark(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.3) {
            Effect.paralyze(pokemon);
            System.out.println("Покемон " + pokemon.toString() + " парализован");
        }
    }

    @Override
    protected String describe() {
        return "Использует Spark";
    }
}
