import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class DazzlingGleam extends SpecialMove{
    public DazzlingGleam(Type type, double pow, double acc){
        super(type, pow, acc);
        // ATTACK ALL, BUT IT'S IMPOSSIBLE
    }
    @Override
    protected String describe() {
        return "Special Dazzling Gleam";
    }
}
