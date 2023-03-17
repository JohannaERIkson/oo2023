import java.util.ArrayList;

public class ToiduaineteList {
    private ArrayList<String> nimed;
    private ArrayList<Double> rasvaprotsendid;

    public String Toiduained() {
        nimed = new ArrayList<String>();
        rasvaprotsendid = new ArrayList<Double>();
        return(" ");
    }

    public void lisaToiduaine(String nimi, double rasvaprotsent) {
        nimed.add(nimi);
        rasvaprotsendid.add(rasvaprotsent);
    }

    public void kustutaToiduaine(String nimi) {
        int indeks = nimed.indexOf(nimi);
        if (indeks != -1) {
            nimed.remove(indeks);
            rasvaprotsendid.remove(indeks);
        }
    }

    public void nimeJargiVaata(String nimi) {
        int indeks = nimed.indexOf(nimi);
        if (indeks != -1) {
            System.out.println(nimi + " rasvaprotsent: " + rasvaprotsendid.get(indeks));
        } else {
            System.out.println("Toiduaine " + nimi + " ei ole listis.");
        }
    }

    public void rasvaprotsendiJargiOtsi(int minRasvaprotsent, int maxRasvaprotsent) {
        for (int i = 0; i < nimed.size(); i++) {
            double rasvaprotsent = rasvaprotsendid.get(i);
            if (rasvaprotsent >= minRasvaprotsent && rasvaprotsent <= maxRasvaprotsent) {
                System.out.println(nimed.get(i) + " - rasvaprotsent: " + rasvaprotsent);
            }
        }
    }
}