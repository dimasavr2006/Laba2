    import ru.ifmo.se.pokemon.Pokemon;

public class Natu{
    public Pokemon Natu = new Pokemon("Natu", 10);

    double hp = 40;
    double att = 50;
    double def = 45;
    double spAtt = 70;
    double spDef = 45;
    double speed = 70;

    public final void setStats(double hp,
                               double att,
                               double def,
                               double spAtt,
                               double spDef,
                               double speed){
        setStats(hp,att,def,spAtt,spDef,speed);
    }
}