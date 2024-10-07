import ru.ifmo.se.pokemon.Pokemon;

public class Eelektross {
    public Pokemon Eelektross = new Pokemon("Eelektross", 10);

    double hp = 85;
    double att = 115;
    double def = 80;
    double spAtt =  105;
    double spDef = 80;
    double speed = 50;

    public final void setStats(double hp,
                               double att,
                               double def,
                               double spAtt,
                               double spDef,
                               double speed){
        setStats(hp,att,def,spAtt,spDef,speed);
    }
}
