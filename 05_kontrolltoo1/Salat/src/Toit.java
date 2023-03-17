public class Toit {
    String nimetus;
    String toiduKomponendid;
    double mituGrammiValke;
    double mituGrammiRasve;
    double mituGrammiSysivesikuid;

    public Toit(String nimetus, String toiduKomponendid, double mituGrammiValke, double mituGrammiRasve, double mituGrammiSysivesikuid) {
        this.nimetus = nimetus;
        this.toiduKomponendid = toiduKomponendid;
        this.mituGrammiValke = mituGrammiValke;
        this.mituGrammiRasve = mituGrammiRasve;
        this.mituGrammiSysivesikuid = mituGrammiSysivesikuid;
    }

    private void PaljuValke(String nimetus){
        this.mituGrammiValke = mituGrammiValke;
        System.out.println("Selles toidus on " + mituGrammiValke+ " grammi valke");
    }

    private void PaljuRasvu(String nimetus){
        this.mituGrammiRasve = mituGrammiRasve;
        System.out.println("Selles toidus on " + mituGrammiRasve+ " grammi rasve");
    }
    private void PaljuSysivesikuid(String nimetus){
        this.mituGrammiSysivesikuid = mituGrammiSysivesikuid;
        System.out.println("Selles toidus on " + mituGrammiSysivesikuid+ " grammi süsivesikuid");
    }
}
