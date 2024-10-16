package src.Move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;

public class IronHead extends PhysicalMove{
    public IronHead (Type type, double pow, double acc){
        super(type, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.3){
            Effect.flinch(pokemon);
            System.out.println("Оглушает " + pokemon.toString());
        }
    }

    @Override
    protected String describe() {
        return "Применяет Iron Head";
    }
}
