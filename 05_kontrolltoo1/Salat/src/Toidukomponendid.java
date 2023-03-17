public class Toidukomponendid {
    Toiduaine toiduaine;
    int kogus;

    double rasvakogus;

    public Toidukomponendid(Toiduaine toiduaine, int kogus) {
        this.toiduaine = toiduaine;
        this.kogus = kogus;

    }

    public void Kogus(Toiduaine toiduaine) {
        this.kogus = kogus;

        System.out.println("Võta toiduainet "+ kogus + " grammi");
    }

    public void Rasvakogus(Toiduaine toiduaine){
        this.rasvakogus = (this.kogus * toiduaine.rasvadeProtsent)/100;
        System.out.println("Rasvakogus on "+ rasvakogus+ "grammi");
    }
}
