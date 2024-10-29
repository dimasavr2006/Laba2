package src.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderWave extends StatusMove {
    public ThunderWave(Type type, double power, double accuracy) {
        super(type, power, accuracy);

    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.paralyze(pokemon);
        System.out.println("Противник " + pokemon.toString() + " парализован");
    }

    @Override
    protected String describe() {
        return "Парализует противника";
    }

}
