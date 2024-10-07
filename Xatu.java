import ru.ifmo.se.pokemon.Pokemon;

public class Xatu {
    public Pokemon Xatu = new Pokemon("Xatu", 10);

    double hp = 65;
    double att = 75;
    double def = 70;
    double spAtt = 95;
    double spDef = 70;
    double speed = 95;

    public final void setStats(double hp,
                               double att,
                               double def,
                               double spAtt,
                               double spDef,
                               double speed){
        setStats(hp,att,def,spAtt,spDef,speed);
    }
}
