import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Discharge extends SpecialMove {
    public Discharge(Type type, double pow, double acc) {
        super(type, pow, acc);
    }

    // IMPOSSIBLE AGAIN, BRUH

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.3) {
            Effect.paralyze(pokemon);
            System.out.println("Покемон парализован");
        }
    }

    @Override
    protected String describe() {
        return "Использует Discharge";
    }
}
