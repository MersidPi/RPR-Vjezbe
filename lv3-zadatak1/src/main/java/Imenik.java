import java.util.*;

public class Imenik {
    private HashMap<String, TelefonskiBroj> mapa;

    public Imenik() {
        mapa = new HashMap<>();
    }

    public Imenik(HashMap<String, TelefonskiBroj> mapa) {
        this.mapa = mapa;
    }

    public void dodaj(String ime, TelefonskiBroj broj) {
        mapa.put(ime, broj);
    }

    public String dajBroj(String ime) {
        return mapa.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj) throws MojIzuzetak {
        for (Map.Entry<String, TelefonskiBroj> entry : mapa.entrySet()) {
            if (entry.getValue().ispisi().equals(broj.ispisi())) {
                return entry.getKey();
            }
        }
        throw new MojIzuzetak("Nije nadjen broj");
    }

    public String naSlovo(char s) {
        String result = new String();
        int brojac = 1;
        if (s >= 'a' && s <= 'z')
            s -= 'a' - 'A';
        for (Map.Entry<String, TelefonskiBroj> entry : mapa.entrySet()) {
            if (entry.getKey().charAt(0) == s || entry.getKey().charAt(0) == s + 'a' - 'A') {
                result += brojac + ". " + entry.getKey() + " - " + entry.getValue().ispisi() + "\r\n";
                brojac++;
            }
        }
        return result;
    }

    public Set<String> izGrada(Grad g) {
        Set<String> result = new HashSet<String>();
        for (Map.Entry<String, TelefonskiBroj> entry : mapa.entrySet()) {
            if (entry.getValue().getClass().equals(FiksniBroj.class) &&
                    entry.getValue().hashCode() == Objects.hash(g, entry.getValue())) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad g) {
        Set<TelefonskiBroj> result = new HashSet<TelefonskiBroj>();
        for (Map.Entry<String, TelefonskiBroj> entry : mapa.entrySet()) {
            if (entry.getValue().getClass().equals(FiksniBroj.class) &&
                    entry.getValue().hashCode() == Objects.hash(g, entry.getValue())) {
                result.add(entry.getValue());
            }
        }
        return result;
    }


}
