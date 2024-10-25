package src.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import java.lang.Math;

public class AirSlash extends SpecialMove {
    public AirSlash(Type type, double pow, double acc) {
        super(type, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.3){
            Effect.flinch(pokemon);
            System.out.println("Противник " + pokemon.toString() + " оглушён!");
        }
    }

    @Override
    protected String describe() {
        return "Применяет Air Slash";
    }
}
