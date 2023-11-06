import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj {
    private Grad grad;
    private String broj;

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }

    @Override
    public String ispisi() {

       /* switch(grad) {
            case SARAJEVO:
        }*/

        if(grad.equals(Grad.SARAJEVO))
            return "033/"+broj;
        else if(grad.equals(Grad.ZENICA))
            return "032/"+broj;
        else if(grad.equals(Grad.TRAVNIK))
            return "030/"+broj;
        else if(grad.equals(Grad.BIHAC))
            return "037/"+broj;
        else if(grad.equals(Grad.ORASJE))
            return "031/"+broj;
        else if(grad.equals(Grad.GORAZDE))
            return "038/"+broj;
        else if(grad.equals(Grad.TUZLA))
            return "035/"+broj;
        else if(grad.equals(Grad.SIROKI_BRIJEG))
            return "039/"+broj;
        else if(grad.equals(Grad.LIVNO))
            return "034/"+broj;
        else if(grad.equals(Grad.BRCKO))
            return "049/"+broj;
        return "036/"+broj;
    }
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FiksniBroj that = (FiksniBroj) o;
        return grad == that.grad && Objects.equals(broj, that.broj);
    }
*/
    @Override
    public int hashCode() {
        return Objects.hash(grad, broj);
    }
}
