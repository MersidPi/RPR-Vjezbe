
/**
 * Hello world!
 *
 */
public class Program
{
    public static void main( String[] args )
    {
        System.out.println( "Dodajemo u imenik 6 ljudi s brojevima!" );
        Imenik imenik = new Imenik();
        imenik.dodaj("Mersid Pilipovic", new FiksniBroj(Grad.SARAJEVO, "456-789"));
        imenik.dodaj("Emina Pilipovic", new MobilniBroj(61, "315-305"));
        imenik.dodaj("Draga Pilipovic", new MedunarodniBroj("+387", "62-764-838"));
        imenik.dodaj("Mirsad Pilipovic", new FiksniBroj(Grad.SARAJEVO, "659-849"));
        imenik.dodaj("Senad Pilipovic", new MobilniBroj(62, "396-365"));
        imenik.dodaj("Eman Pilipovic", new MedunarodniBroj("+381", "62-231-241"));

        System.out.println("Sada ispisujemo broj od 'Mersid Pilipovic': " + imenik.dajBroj("Mersid Pilipovic"));
        System.out.println("Sada ispisujemo broj od 'Emina Pilipovic'");
        System.out.println(imenik.dajBroj("Emina Pilipovic"));
        System.out.println("Sada ispisujemo broj od 'Draga Pilipovic'");
        System.out.println(imenik.dajBroj("Draga Pilipovic"));

        TelefonskiBroj broj= new FiksniBroj(Grad.SARAJEVO, "456-789");
        try {
            System.out.println("Sad ispisujemo ime od broja '456-789': " + imenik.dajIme(broj));
        } catch (MojIzuzetak e) {
            System.out.println("BACEN IZUZETAK: " + e.toString());
        }
        broj= new MedunarodniBroj("+381", "62-231s-241");
        try {
            System.out.println("Sad ispisujemo ime od broja '62-231-241': " + imenik.dajIme(broj));
        } catch (MojIzuzetak e) {
            System.out.println("BACEN IZUZETAK: " + e.toString());
        }

        System.out.println("Sad ispisujemo sva imena koja pocinju na e:\r\n" + imenik.naSlovo('e'));

    }
}
