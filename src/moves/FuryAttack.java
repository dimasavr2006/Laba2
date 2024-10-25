package src.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class FuryAttack extends PhysicalMove{
    public FuryAttack(Type type, double pow, double acc, int priority, int hits){
//        this.type = Type.NORMAL;
//        this.power = 15;
//        this.accuracy = 0.85;
        super(type, pow, acc, priority, hits);
    }

    @Override
    protected String describe() {
        return "применяет Fury Attack";
    }
}
