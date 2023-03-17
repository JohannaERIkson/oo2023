public class Main {
    public static void main(String[] args) {

        System.out.println("YAY salat!");

        Toiduaine kartul = new Toiduaine("kartul", 14.2,22.5,41.0);
        Toidukomponendid toidukomponendid = new Toidukomponendid(kartul, 50);

        Toiduaine hapukoor = new Toiduaine("hapukoor",22.7,22.9,34.5 );
        Toidukomponendid toidukomponendid2 = new Toidukomponendid(hapukoor,180);

        Toiduaine vorst = new Toiduaine("vorst", 24.3,57.3,37.6);
        Toidukomponendid toidukomponendid3 = new Toidukomponendid(vorst,100);


        String mituProtsenti = hapukoor.Protsent();
        System.out.println(mituProtsenti);

        String mituProtsenti3 = vorst.Protsent();
        System.out.println(mituProtsenti3);

        System.out.println("Mitu grammi tuleks võtta toiduainet?");

        toidukomponendid2.Kogus(hapukoor);

        toidukomponendid3.Rasvakogus(hapukoor);


    }

}