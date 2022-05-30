/**
 * Persona
 * Attributi di un oggetto di tipo Persona
 */
public class Persona {

    private String nome;
    private String cognome;
    private String cFisc;


    public Persona(String nome, String cognome, String cFisc) {
        if(controllo(cFisc)){
            this.nome = nome;
            this.cognome = cognome;
            this.cFisc = cFisc;
        }
    }

    /**
     * controllo
     * Metodo che controlla la validità del codice fiscale
     */
    public boolean controllo(String cFisc){
        String vocali = "aeiou";
        if(cFisc == cFisc.trim())
        {
            for(int i = 0; i < cFisc.length(); i++)
            {
                if (cFisc.charAt(i) >= 'a' && cFisc.charAt(i) <= 'z') {
                    if(vocali.indexOf(cFisc.charAt(i)) == -1){
                        return true;
                    }
                }
            }
        }
        System.out.println("Codice fiscale non valido");
        return false;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCFisc() {
        return this.cFisc;
    }

    public void setCFisc(String cFisc) {
        this.cFisc = cFisc;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cognome='" + getCognome() + "'" +
            ", cFisc='" + getCFisc() + "'" +
            "}";
    }

}