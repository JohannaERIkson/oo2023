public class Toiduaine {
    String nimetus;
    double valkudeProtsent;
    double rasvadeProtsent;
    double sysivesikuteProtsent;

    public Toiduaine(String nimetus, double valkudeProtsent, double rasvadeProtsent, double sysivesikuteProtsent) {
        this.nimetus = nimetus;
        this.valkudeProtsent = valkudeProtsent;
        this.rasvadeProtsent = rasvadeProtsent;
        this.sysivesikuteProtsent = sysivesikuteProtsent;

        System.out.println(nimetus + "sees on valkudeprotsent:" +valkudeProtsent+ "%, rasvade protsent: "+rasvadeProtsent+"% ning süsiveskiute protsent"+ sysivesikuteProtsent+"%");
    }

    public String Protsent(){
        if ((valkudeProtsent + rasvadeProtsent + sysivesikuteProtsent) < 100){
            return "Protsentidega on korras";
        } else {
            return"ERROR, vaata üle " + nimetus +" protsendid!";
        }
    }


}
