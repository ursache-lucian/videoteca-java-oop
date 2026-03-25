public class Movie {
    private String titlu;
    private int anLansare;
    private boolean disponibil;

    public Movie(String titlu, int anLansare){
        this.titlu = titlu;
        this.anLansare = anLansare;
        this.disponibil = true;
    }

    public String getTitlu(){
        return titlu;
    }

    public int getAnLansare(){
        return anLansare;
    }

    public boolean isDisponibil() {
        return disponibil;
    }

    public void setDisponibil(boolean disponibil) {
        this.disponibil = disponibil;
    }

    @Override
    public String toString(){
        return "Filmul: " + titlu + " Anul: " + anLansare + " Disponibil: " + disponibil;
    }
}
