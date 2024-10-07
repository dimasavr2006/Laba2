import ru.ifmo.se.pokemon.Pokemon;

public class Eelektrik {
    public Pokemon Eelektrik = new Pokemon("Eelektrik", 10);

    double hp = 68;
    double att = 85;
    double def = 70;
    double spAtt = 75;
    double spDef = 70;
    double speed = 40;

    public final void setStats(double hp,
                               double att,
                               double def,
                               double spAtt,
                               double spDef,
                               double speed){
        setStats(hp,att,def,spAtt,spDef,speed);
    }
}
